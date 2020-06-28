package com.sunny.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCommentReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCommentReplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Long value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Long value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Long value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Long value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Long> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Long> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Long value1, Long value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Long value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Long value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Long value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Long value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Long> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Long> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Long value1, Long value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdIsNull() {
            addCriterion("reply_root_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdIsNotNull() {
            addCriterion("reply_root_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdEqualTo(Long value) {
            addCriterion("reply_root_id =", value, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdNotEqualTo(Long value) {
            addCriterion("reply_root_id <>", value, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdGreaterThan(Long value) {
            addCriterion("reply_root_id >", value, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_root_id >=", value, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdLessThan(Long value) {
            addCriterion("reply_root_id <", value, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_root_id <=", value, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdIn(List<Long> values) {
            addCriterion("reply_root_id in", values, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdNotIn(List<Long> values) {
            addCriterion("reply_root_id not in", values, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdBetween(Long value1, Long value2) {
            addCriterion("reply_root_id between", value1, value2, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyRootIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_root_id not between", value1, value2, "replyRootId");
            return (Criteria) this;
        }

        public Criteria andReplyHeadIsNull() {
            addCriterion("reply_head is null");
            return (Criteria) this;
        }

        public Criteria andReplyHeadIsNotNull() {
            addCriterion("reply_head is not null");
            return (Criteria) this;
        }

        public Criteria andReplyHeadEqualTo(String value) {
            addCriterion("reply_head =", value, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadNotEqualTo(String value) {
            addCriterion("reply_head <>", value, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadGreaterThan(String value) {
            addCriterion("reply_head >", value, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadGreaterThanOrEqualTo(String value) {
            addCriterion("reply_head >=", value, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadLessThan(String value) {
            addCriterion("reply_head <", value, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadLessThanOrEqualTo(String value) {
            addCriterion("reply_head <=", value, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadLike(String value) {
            addCriterion("reply_head like", value, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadNotLike(String value) {
            addCriterion("reply_head not like", value, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadIn(List<String> values) {
            addCriterion("reply_head in", values, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadNotIn(List<String> values) {
            addCriterion("reply_head not in", values, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadBetween(String value1, String value2) {
            addCriterion("reply_head between", value1, value2, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyHeadNotBetween(String value1, String value2) {
            addCriterion("reply_head not between", value1, value2, "replyHead");
            return (Criteria) this;
        }

        public Criteria andReplyNickIsNull() {
            addCriterion("reply_nick is null");
            return (Criteria) this;
        }

        public Criteria andReplyNickIsNotNull() {
            addCriterion("reply_nick is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNickEqualTo(String value) {
            addCriterion("reply_nick =", value, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickNotEqualTo(String value) {
            addCriterion("reply_nick <>", value, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickGreaterThan(String value) {
            addCriterion("reply_nick >", value, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickGreaterThanOrEqualTo(String value) {
            addCriterion("reply_nick >=", value, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickLessThan(String value) {
            addCriterion("reply_nick <", value, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickLessThanOrEqualTo(String value) {
            addCriterion("reply_nick <=", value, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickLike(String value) {
            addCriterion("reply_nick like", value, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickNotLike(String value) {
            addCriterion("reply_nick not like", value, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickIn(List<String> values) {
            addCriterion("reply_nick in", values, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickNotIn(List<String> values) {
            addCriterion("reply_nick not in", values, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickBetween(String value1, String value2) {
            addCriterion("reply_nick between", value1, value2, "replyNick");
            return (Criteria) this;
        }

        public Criteria andReplyNickNotBetween(String value1, String value2) {
            addCriterion("reply_nick not between", value1, value2, "replyNick");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNickIsNull() {
            addCriterion("user_nick is null");
            return (Criteria) this;
        }

        public Criteria andUserNickIsNotNull() {
            addCriterion("user_nick is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickEqualTo(String value) {
            addCriterion("user_nick =", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotEqualTo(String value) {
            addCriterion("user_nick <>", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickGreaterThan(String value) {
            addCriterion("user_nick >", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickGreaterThanOrEqualTo(String value) {
            addCriterion("user_nick >=", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLessThan(String value) {
            addCriterion("user_nick <", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLessThanOrEqualTo(String value) {
            addCriterion("user_nick <=", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickLike(String value) {
            addCriterion("user_nick like", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotLike(String value) {
            addCriterion("user_nick not like", value, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickIn(List<String> values) {
            addCriterion("user_nick in", values, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotIn(List<String> values) {
            addCriterion("user_nick not in", values, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickBetween(String value1, String value2) {
            addCriterion("user_nick between", value1, value2, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserNickNotBetween(String value1, String value2) {
            addCriterion("user_nick not between", value1, value2, "userNick");
            return (Criteria) this;
        }

        public Criteria andUserHeadIsNull() {
            addCriterion("user_head is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadIsNotNull() {
            addCriterion("user_head is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadEqualTo(String value) {
            addCriterion("user_head =", value, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadNotEqualTo(String value) {
            addCriterion("user_head <>", value, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadGreaterThan(String value) {
            addCriterion("user_head >", value, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadGreaterThanOrEqualTo(String value) {
            addCriterion("user_head >=", value, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadLessThan(String value) {
            addCriterion("user_head <", value, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadLessThanOrEqualTo(String value) {
            addCriterion("user_head <=", value, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadLike(String value) {
            addCriterion("user_head like", value, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadNotLike(String value) {
            addCriterion("user_head not like", value, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadIn(List<String> values) {
            addCriterion("user_head in", values, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadNotIn(List<String> values) {
            addCriterion("user_head not in", values, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadBetween(String value1, String value2) {
            addCriterion("user_head between", value1, value2, "userHead");
            return (Criteria) this;
        }

        public Criteria andUserHeadNotBetween(String value1, String value2) {
            addCriterion("user_head not between", value1, value2, "userHead");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andOfficialIsNull() {
            addCriterion("official is null");
            return (Criteria) this;
        }

        public Criteria andOfficialIsNotNull() {
            addCriterion("official is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialEqualTo(Byte value) {
            addCriterion("official =", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialNotEqualTo(Byte value) {
            addCriterion("official <>", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialGreaterThan(Byte value) {
            addCriterion("official >", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialGreaterThanOrEqualTo(Byte value) {
            addCriterion("official >=", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialLessThan(Byte value) {
            addCriterion("official <", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialLessThanOrEqualTo(Byte value) {
            addCriterion("official <=", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialIn(List<Byte> values) {
            addCriterion("official in", values, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialNotIn(List<Byte> values) {
            addCriterion("official not in", values, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialBetween(Byte value1, Byte value2) {
            addCriterion("official between", value1, value2, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialNotBetween(Byte value1, Byte value2) {
            addCriterion("official not between", value1, value2, "official");
            return (Criteria) this;
        }

        public Criteria andAnonymousIsNull() {
            addCriterion("anonymous is null");
            return (Criteria) this;
        }

        public Criteria andAnonymousIsNotNull() {
            addCriterion("anonymous is not null");
            return (Criteria) this;
        }

        public Criteria andAnonymousEqualTo(Byte value) {
            addCriterion("anonymous =", value, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousNotEqualTo(Byte value) {
            addCriterion("anonymous <>", value, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousGreaterThan(Byte value) {
            addCriterion("anonymous >", value, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousGreaterThanOrEqualTo(Byte value) {
            addCriterion("anonymous >=", value, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousLessThan(Byte value) {
            addCriterion("anonymous <", value, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousLessThanOrEqualTo(Byte value) {
            addCriterion("anonymous <=", value, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousIn(List<Byte> values) {
            addCriterion("anonymous in", values, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousNotIn(List<Byte> values) {
            addCriterion("anonymous not in", values, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousBetween(Byte value1, Byte value2) {
            addCriterion("anonymous between", value1, value2, "anonymous");
            return (Criteria) this;
        }

        public Criteria andAnonymousNotBetween(Byte value1, Byte value2) {
            addCriterion("anonymous not between", value1, value2, "anonymous");
            return (Criteria) this;
        }

        public Criteria andHideIsNull() {
            addCriterion("hide is null");
            return (Criteria) this;
        }

        public Criteria andHideIsNotNull() {
            addCriterion("hide is not null");
            return (Criteria) this;
        }

        public Criteria andHideEqualTo(Byte value) {
            addCriterion("hide =", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotEqualTo(Byte value) {
            addCriterion("hide <>", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThan(Byte value) {
            addCriterion("hide >", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThanOrEqualTo(Byte value) {
            addCriterion("hide >=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThan(Byte value) {
            addCriterion("hide <", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThanOrEqualTo(Byte value) {
            addCriterion("hide <=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideIn(List<Byte> values) {
            addCriterion("hide in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotIn(List<Byte> values) {
            addCriterion("hide not in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideBetween(Byte value1, Byte value2) {
            addCriterion("hide between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotBetween(Byte value1, Byte value2) {
            addCriterion("hide not between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberIsNull() {
            addCriterion("agree_number is null");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberIsNotNull() {
            addCriterion("agree_number is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberEqualTo(Integer value) {
            addCriterion("agree_number =", value, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberNotEqualTo(Integer value) {
            addCriterion("agree_number <>", value, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberGreaterThan(Integer value) {
            addCriterion("agree_number >", value, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("agree_number >=", value, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberLessThan(Integer value) {
            addCriterion("agree_number <", value, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("agree_number <=", value, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberIn(List<Integer> values) {
            addCriterion("agree_number in", values, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberNotIn(List<Integer> values) {
            addCriterion("agree_number not in", values, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberBetween(Integer value1, Integer value2) {
            addCriterion("agree_number between", value1, value2, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andAgreeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("agree_number not between", value1, value2, "agreeNumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}