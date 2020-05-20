package com.sunny.user.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String id;

    /**
     * 用户名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * 密码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 是否被禁用：0正常 1被禁用
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "是否被禁用：0正常 1被禁用")
    private Boolean hasForbidden;

    /**
     * 用户类型
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户类型")
    private String userType;

    /**
     * 头像
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "头像")
    private String icon;

    /**
     * 是否验证邮箱0未验证1已验证
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "是否验证邮箱0未验证1已验证")
    private Boolean boundEmail;

    /**
     * 是否绑定手机0未绑定1已绑定
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "是否绑定手机0未绑定1已绑定")
    private Boolean boundPhone;

    /**
     * 是否绑定微信
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "是否绑定微信")
    private Boolean boundWechat;

    /**
     * 简介
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "简介")
    private String brief;

    /**
     * 用户真实姓名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户真实姓名")
    private String realName;

    /**
     * 微信unionid
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "微信unionid")
    private String unionId;

    /**
     * 微信openid
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "微信openid")
    private String openId;

    /**
     * 用户状态：0正常1删除
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户状态：0正常1删除")
    private Boolean status;

    private Date createTime;

    private Date updateTime;

    /**
     * 性别：0->未知；1->男；2->女
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    private Integer gender;

    /**
     * 所做城市
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "所做城市")
    private String city;

    /**
     * 区域id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "区域id")
    private Integer areaUserId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getHasForbidden() {
        return hasForbidden;
    }

    public void setHasForbidden(Boolean hasForbidden) {
        this.hasForbidden = hasForbidden;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getBoundEmail() {
        return boundEmail;
    }

    public void setBoundEmail(Boolean boundEmail) {
        this.boundEmail = boundEmail;
    }

    public Boolean getBoundPhone() {
        return boundPhone;
    }

    public void setBoundPhone(Boolean boundPhone) {
        this.boundPhone = boundPhone;
    }

    public Boolean getBoundWechat() {
        return boundWechat;
    }

    public void setBoundWechat(Boolean boundWechat) {
        this.boundWechat = boundWechat;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAreaUserId() {
        return areaUserId;
    }

    public void setAreaUserId(Integer areaUserId) {
        this.areaUserId = areaUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", hasForbidden=").append(hasForbidden);
        sb.append(", userType=").append(userType);
        sb.append(", icon=").append(icon);
        sb.append(", boundEmail=").append(boundEmail);
        sb.append(", boundPhone=").append(boundPhone);
        sb.append(", boundWechat=").append(boundWechat);
        sb.append(", brief=").append(brief);
        sb.append(", realName=").append(realName);
        sb.append(", unionId=").append(unionId);
        sb.append(", openId=").append(openId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", gender=").append(gender);
        sb.append(", city=").append(city);
        sb.append(", areaUserId=").append(areaUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}