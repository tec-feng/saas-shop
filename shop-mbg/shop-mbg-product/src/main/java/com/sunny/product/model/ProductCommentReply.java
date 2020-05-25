package com.sunny.product.model;

import java.io.Serializable;
import java.util.Date;

public class ProductCommentReply implements Serializable {
    private Long id;

    /**
     * 被回复的product_comment的id
     *
     * @mbg.generated
     */
    private Long commentId;

    /**
     * 回复ID，默认为0
     *
     * @mbg.generated
     */
    private Long replyId;

    /**
     * 主回复ID
     *
     * @mbg.generated
     */
    private Long replyRootId;

    /**
     * 被回复人头像
     *
     * @mbg.generated
     */
    private String replyHead;

    /**
     * 被回复人的昵称
     *
     * @mbg.generated
     */
    private String replyNick;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * 用户昵称
     *
     * @mbg.generated
     */
    private String userNick;

    /**
     * 用户头像
     *
     * @mbg.generated
     */
    private String userHead;

    /**
     * 评论内容
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 是否官方回复,0否(非官方回复),1是(官方回复)
     *
     * @mbg.generated
     */
    private Byte official;

    /**
     * 是否匿名,0否(不匿名),1是(匿名)
     *
     * @mbg.generated
     */
    private Byte anonymous;

    /**
     * 是否隐藏，0不隐藏，1隐藏
     *
     * @mbg.generated
     */
    private Byte hide;

    /**
     * 点赞数量
     *
     * @mbg.generated
     */
    private Integer agreeNumber;

    /**
     * 0正常，1删除
     *
     * @mbg.generated
     */
    private Byte status;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    public Long getReplyRootId() {
        return replyRootId;
    }

    public void setReplyRootId(Long replyRootId) {
        this.replyRootId = replyRootId;
    }

    public String getReplyHead() {
        return replyHead;
    }

    public void setReplyHead(String replyHead) {
        this.replyHead = replyHead;
    }

    public String getReplyNick() {
        return replyNick;
    }

    public void setReplyNick(String replyNick) {
        this.replyNick = replyNick;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getOfficial() {
        return official;
    }

    public void setOfficial(Byte official) {
        this.official = official;
    }

    public Byte getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Byte anonymous) {
        this.anonymous = anonymous;
    }

    public Byte getHide() {
        return hide;
    }

    public void setHide(Byte hide) {
        this.hide = hide;
    }

    public Integer getAgreeNumber() {
        return agreeNumber;
    }

    public void setAgreeNumber(Integer agreeNumber) {
        this.agreeNumber = agreeNumber;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commentId=").append(commentId);
        sb.append(", replyId=").append(replyId);
        sb.append(", replyRootId=").append(replyRootId);
        sb.append(", replyHead=").append(replyHead);
        sb.append(", replyNick=").append(replyNick);
        sb.append(", userId=").append(userId);
        sb.append(", userNick=").append(userNick);
        sb.append(", userHead=").append(userHead);
        sb.append(", content=").append(content);
        sb.append(", official=").append(official);
        sb.append(", anonymous=").append(anonymous);
        sb.append(", hide=").append(hide);
        sb.append(", agreeNumber=").append(agreeNumber);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}