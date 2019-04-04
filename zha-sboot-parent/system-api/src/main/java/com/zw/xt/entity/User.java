package com.zw.xt.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zha
 * @since 2019-04-02
 */
@TableName("t_sys_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId("user_id")
    private Integer userId;

    /**
     * 行政区域ID
     */
    @TableField("d_id")
    private Integer dId;

    /**
     * 用户组ID
     */
    @TableField("u_gid")
    private Integer uGid;

    /**
     * 用户名
     */
    @TableField("name")
    private String name;

    /**
     * 密码
     */
    @TableField("passwd")
    private String passwd;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 是否激活 1 未激活 2 激活
     */
    @TableField("is_active")
    private Integer isActive;

    /**
     * 创建者
     */
    @TableField("creator")
    private String creator;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 手机号码
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户姓名
     */
    @TableField("adname")
    private String adname;

    /**
     * 身份证号码
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 角色类型：0:超级管理员 1:省级管理员 2:省级普通用户 3:市级普通用户 4：区县级普通用户
     */
    @TableField("type")
    private Integer type;

    /**
     * 管辖机构(管辖机构id)
     */
    @TableField("organiz")
    private String organiz;

    /**
     * 管辖机构类型
     */
    @TableField("organ_type")
    private Integer organType;

    /**
     * 激活状态(1激活2 未激活3 停用)
     */
    @TableField("activa_user")
    private Integer activaUser;

    /**
     * 部门
     */
    @TableField("depart")
    private Integer depart;

    /**
     * 是否完善 0 未完善 1 已完善
     */
    @TableField("is_perfect")
    private Integer isPerfect;

    /**
     * 租户id
     */
    @TableField("tenant_id")
    private Integer tenantId;

    /**
     * 扩展字段1
     */
    @TableField("var_field1")
    private String varField1;

    /**
     * 扩展字段2
     */
    @TableField("var_field2")
    private String varField2;

    /**
     * 扩展字段3
     */
    @TableField("var_field3")
    private String varField3;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
    public Integer getuGid() {
        return uGid;
    }

    public void setuGid(Integer uGid) {
        this.uGid = uGid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public String getOrganiz() {
        return organiz;
    }

    public void setOrganiz(String organiz) {
        this.organiz = organiz;
    }
    public Integer getOrganType() {
        return organType;
    }

    public void setOrganType(Integer organType) {
        this.organType = organType;
    }
    public Integer getActivaUser() {
        return activaUser;
    }

    public void setActivaUser(Integer activaUser) {
        this.activaUser = activaUser;
    }
    public Integer getDepart() {
        return depart;
    }

    public void setDepart(Integer depart) {
        this.depart = depart;
    }
    public Integer getIsPerfect() {
        return isPerfect;
    }

    public void setIsPerfect(Integer isPerfect) {
        this.isPerfect = isPerfect;
    }
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }
    public String getVarField1() {
        return varField1;
    }

    public void setVarField1(String varField1) {
        this.varField1 = varField1;
    }
    public String getVarField2() {
        return varField2;
    }

    public void setVarField2(String varField2) {
        this.varField2 = varField2;
    }
    public String getVarField3() {
        return varField3;
    }

    public void setVarField3(String varField3) {
        this.varField3 = varField3;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", dId=" + dId +
        ", uGid=" + uGid +
        ", name=" + name +
        ", passwd=" + passwd +
        ", email=" + email +
        ", isActive=" + isActive +
        ", creator=" + creator +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", phone=" + phone +
        ", adname=" + adname +
        ", idCard=" + idCard +
        ", type=" + type +
        ", organiz=" + organiz +
        ", organType=" + organType +
        ", activaUser=" + activaUser +
        ", depart=" + depart +
        ", isPerfect=" + isPerfect +
        ", tenantId=" + tenantId +
        ", varField1=" + varField1 +
        ", varField2=" + varField2 +
        ", varField3=" + varField3 +
        "}";
    }
}
