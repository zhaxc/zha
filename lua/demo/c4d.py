/**
 * Created by zha on 2019/1/23.
 */
import c4d from c4d import utils
import math

def GetCurrentState(o):
obj = utils.SendModelingCommand(
    command = c4d.MCOMMAND_CURRENTSTATETOOBJECT,
    list = [o],
    mode=c4d.MODELINGCOMMANDMODE_ALL,
    bc=c4d.BaseContainer(),
    doc = doc)
return  utils.SendModelingCommand(
    command = c4d.MCOMMAND_JOIN,
    list = obj,
    mode=c4d.MODELINGCOMMANDMODE_ALL,
    bc=c4d.BaseContainer(),
    doc = doc)

def main():

update = op[c4d.ID_USERDATA,4]
if update:

target = op[c4d.ID_USERDATA,2]
max_seg = op[c4d.ID_USERDATA,3]

if target != None:
obj = op.GetObject()
target_poly = GetCurrentState(target)[0]

objM = obj.GetMg()
targetM = target.GetMg() * target.GetUpMg()


toTarget = objM * targetM.__invert__()
toObj = targetM * objM.__invert__()

rc = utils.GeRayCollider()
rc.Init(target_poly)

points = [c4d.Vector(0, 0, 0)]

start = points[0] * toTarget
direction = c4d.Vector(0, 0, 1) * toTarget - start

#            c4d.StatusSetSpin()

for i in xrange(1, max_seg+1):
if not rc.Intersect(start + direction.GetNormalized() * 0.001, direction, 100000):
break

ray_result = rc.GetNearestIntersection()
pos = ray_result["hitpos"]
start = pos
points.append(pos * toObj)
n = ray_result["f_normal"].GetNormalized()
refl = utils.ReflectRay(direction, n)
direction = refl

obj.ResizeObject(len(points))
obj.SetAllPoints(points)
obj.Message(c4d.MSG_UPDATE)
#            c4d.StatusClear()