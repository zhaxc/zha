--
-- Created by IntelliJ IDEA.
-- User: zha
-- Date: 2019/1/22
-- Time: 11:22
-- To change this template use File | Settings | File Templates.
--

a = {}

a["key"] = "value"
key = 10
a[key] = 22
a[key] = a[key] + 11
for k, v in pairs(a) do
    print(k .. ":" .. v)
end

print(a.key)
print(a[10])


