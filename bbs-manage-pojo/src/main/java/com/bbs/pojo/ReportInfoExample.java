package com.bbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportInfoExample() {
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

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(String value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(String value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(String value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(String value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(String value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLike(String value) {
            addCriterion("report_id like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotLike(String value) {
            addCriterion("report_id not like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<String> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<String> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(String value1, String value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(String value1, String value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
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

        public Criteria andReportReasonIsNull() {
            addCriterion("report_reason is null");
            return (Criteria) this;
        }

        public Criteria andReportReasonIsNotNull() {
            addCriterion("report_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReportReasonEqualTo(String value) {
            addCriterion("report_reason =", value, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonNotEqualTo(String value) {
            addCriterion("report_reason <>", value, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonGreaterThan(String value) {
            addCriterion("report_reason >", value, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonGreaterThanOrEqualTo(String value) {
            addCriterion("report_reason >=", value, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonLessThan(String value) {
            addCriterion("report_reason <", value, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonLessThanOrEqualTo(String value) {
            addCriterion("report_reason <=", value, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonLike(String value) {
            addCriterion("report_reason like", value, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonNotLike(String value) {
            addCriterion("report_reason not like", value, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonIn(List<String> values) {
            addCriterion("report_reason in", values, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonNotIn(List<String> values) {
            addCriterion("report_reason not in", values, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonBetween(String value1, String value2) {
            addCriterion("report_reason between", value1, value2, "reportReason");
            return (Criteria) this;
        }

        public Criteria andReportReasonNotBetween(String value1, String value2) {
            addCriterion("report_reason not between", value1, value2, "reportReason");
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

        public Criteria andIsResolveIsNull() {
            addCriterion("is_resolve is null");
            return (Criteria) this;
        }

        public Criteria andIsResolveIsNotNull() {
            addCriterion("is_resolve is not null");
            return (Criteria) this;
        }

        public Criteria andIsResolveEqualTo(Integer value) {
            addCriterion("is_resolve =", value, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveNotEqualTo(Integer value) {
            addCriterion("is_resolve <>", value, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveGreaterThan(Integer value) {
            addCriterion("is_resolve >", value, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_resolve >=", value, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveLessThan(Integer value) {
            addCriterion("is_resolve <", value, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveLessThanOrEqualTo(Integer value) {
            addCriterion("is_resolve <=", value, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveIn(List<Integer> values) {
            addCriterion("is_resolve in", values, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveNotIn(List<Integer> values) {
            addCriterion("is_resolve not in", values, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveBetween(Integer value1, Integer value2) {
            addCriterion("is_resolve between", value1, value2, "isResolve");
            return (Criteria) this;
        }

        public Criteria andIsResolveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_resolve not between", value1, value2, "isResolve");
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