package com.bbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RevertInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RevertInfoExample() {
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

        public Criteria andRevertIdIsNull() {
            addCriterion("revert_id is null");
            return (Criteria) this;
        }

        public Criteria andRevertIdIsNotNull() {
            addCriterion("revert_id is not null");
            return (Criteria) this;
        }

        public Criteria andRevertIdEqualTo(String value) {
            addCriterion("revert_id =", value, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdNotEqualTo(String value) {
            addCriterion("revert_id <>", value, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdGreaterThan(String value) {
            addCriterion("revert_id >", value, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdGreaterThanOrEqualTo(String value) {
            addCriterion("revert_id >=", value, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdLessThan(String value) {
            addCriterion("revert_id <", value, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdLessThanOrEqualTo(String value) {
            addCriterion("revert_id <=", value, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdLike(String value) {
            addCriterion("revert_id like", value, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdNotLike(String value) {
            addCriterion("revert_id not like", value, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdIn(List<String> values) {
            addCriterion("revert_id in", values, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdNotIn(List<String> values) {
            addCriterion("revert_id not in", values, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdBetween(String value1, String value2) {
            addCriterion("revert_id between", value1, value2, "revertId");
            return (Criteria) this;
        }

        public Criteria andRevertIdNotBetween(String value1, String value2) {
            addCriterion("revert_id not between", value1, value2, "revertId");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("post_id like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("post_id not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdIsNull() {
            addCriterion("parent_revert_id is null");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdIsNotNull() {
            addCriterion("parent_revert_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdEqualTo(String value) {
            addCriterion("parent_revert_id =", value, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdNotEqualTo(String value) {
            addCriterion("parent_revert_id <>", value, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdGreaterThan(String value) {
            addCriterion("parent_revert_id >", value, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_revert_id >=", value, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdLessThan(String value) {
            addCriterion("parent_revert_id <", value, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdLessThanOrEqualTo(String value) {
            addCriterion("parent_revert_id <=", value, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdLike(String value) {
            addCriterion("parent_revert_id like", value, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdNotLike(String value) {
            addCriterion("parent_revert_id not like", value, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdIn(List<String> values) {
            addCriterion("parent_revert_id in", values, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdNotIn(List<String> values) {
            addCriterion("parent_revert_id not in", values, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdBetween(String value1, String value2) {
            addCriterion("parent_revert_id between", value1, value2, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andParentRevertIdNotBetween(String value1, String value2) {
            addCriterion("parent_revert_id not between", value1, value2, "parentRevertId");
            return (Criteria) this;
        }

        public Criteria andRevertMessageIsNull() {
            addCriterion("revert_message is null");
            return (Criteria) this;
        }

        public Criteria andRevertMessageIsNotNull() {
            addCriterion("revert_message is not null");
            return (Criteria) this;
        }

        public Criteria andRevertMessageEqualTo(String value) {
            addCriterion("revert_message =", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageNotEqualTo(String value) {
            addCriterion("revert_message <>", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageGreaterThan(String value) {
            addCriterion("revert_message >", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageGreaterThanOrEqualTo(String value) {
            addCriterion("revert_message >=", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageLessThan(String value) {
            addCriterion("revert_message <", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageLessThanOrEqualTo(String value) {
            addCriterion("revert_message <=", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageLike(String value) {
            addCriterion("revert_message like", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageNotLike(String value) {
            addCriterion("revert_message not like", value, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageIn(List<String> values) {
            addCriterion("revert_message in", values, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageNotIn(List<String> values) {
            addCriterion("revert_message not in", values, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageBetween(String value1, String value2) {
            addCriterion("revert_message between", value1, value2, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertMessageNotBetween(String value1, String value2) {
            addCriterion("revert_message not between", value1, value2, "revertMessage");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumIsNull() {
            addCriterion("revert_fine_num is null");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumIsNotNull() {
            addCriterion("revert_fine_num is not null");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumEqualTo(Integer value) {
            addCriterion("revert_fine_num =", value, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumNotEqualTo(Integer value) {
            addCriterion("revert_fine_num <>", value, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumGreaterThan(Integer value) {
            addCriterion("revert_fine_num >", value, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("revert_fine_num >=", value, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumLessThan(Integer value) {
            addCriterion("revert_fine_num <", value, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumLessThanOrEqualTo(Integer value) {
            addCriterion("revert_fine_num <=", value, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumIn(List<Integer> values) {
            addCriterion("revert_fine_num in", values, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumNotIn(List<Integer> values) {
            addCriterion("revert_fine_num not in", values, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumBetween(Integer value1, Integer value2) {
            addCriterion("revert_fine_num between", value1, value2, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andRevertFineNumNotBetween(Integer value1, Integer value2) {
            addCriterion("revert_fine_num not between", value1, value2, "revertFineNum");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andDelUserIdIsNull() {
            addCriterion("del_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDelUserIdIsNotNull() {
            addCriterion("del_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelUserIdEqualTo(String value) {
            addCriterion("del_user_id =", value, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdNotEqualTo(String value) {
            addCriterion("del_user_id <>", value, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdGreaterThan(String value) {
            addCriterion("del_user_id >", value, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("del_user_id >=", value, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdLessThan(String value) {
            addCriterion("del_user_id <", value, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdLessThanOrEqualTo(String value) {
            addCriterion("del_user_id <=", value, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdLike(String value) {
            addCriterion("del_user_id like", value, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdNotLike(String value) {
            addCriterion("del_user_id not like", value, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdIn(List<String> values) {
            addCriterion("del_user_id in", values, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdNotIn(List<String> values) {
            addCriterion("del_user_id not in", values, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdBetween(String value1, String value2) {
            addCriterion("del_user_id between", value1, value2, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelUserIdNotBetween(String value1, String value2) {
            addCriterion("del_user_id not between", value1, value2, "delUserId");
            return (Criteria) this;
        }

        public Criteria andDelReasonIsNull() {
            addCriterion("del_reason is null");
            return (Criteria) this;
        }

        public Criteria andDelReasonIsNotNull() {
            addCriterion("del_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDelReasonEqualTo(String value) {
            addCriterion("del_reason =", value, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonNotEqualTo(String value) {
            addCriterion("del_reason <>", value, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonGreaterThan(String value) {
            addCriterion("del_reason >", value, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("del_reason >=", value, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonLessThan(String value) {
            addCriterion("del_reason <", value, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonLessThanOrEqualTo(String value) {
            addCriterion("del_reason <=", value, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonLike(String value) {
            addCriterion("del_reason like", value, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonNotLike(String value) {
            addCriterion("del_reason not like", value, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonIn(List<String> values) {
            addCriterion("del_reason in", values, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonNotIn(List<String> values) {
            addCriterion("del_reason not in", values, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonBetween(String value1, String value2) {
            addCriterion("del_reason between", value1, value2, "delReason");
            return (Criteria) this;
        }

        public Criteria andDelReasonNotBetween(String value1, String value2) {
            addCriterion("del_reason not between", value1, value2, "delReason");
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