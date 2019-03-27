package com.bbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CatetoryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CatetoryInfoExample() {
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

        public Criteria andCatetoryIdIsNull() {
            addCriterion("catetory_id is null");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdIsNotNull() {
            addCriterion("catetory_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdEqualTo(String value) {
            addCriterion("catetory_id =", value, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdNotEqualTo(String value) {
            addCriterion("catetory_id <>", value, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdGreaterThan(String value) {
            addCriterion("catetory_id >", value, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("catetory_id >=", value, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdLessThan(String value) {
            addCriterion("catetory_id <", value, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdLessThanOrEqualTo(String value) {
            addCriterion("catetory_id <=", value, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdLike(String value) {
            addCriterion("catetory_id like", value, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdNotLike(String value) {
            addCriterion("catetory_id not like", value, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdIn(List<String> values) {
            addCriterion("catetory_id in", values, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdNotIn(List<String> values) {
            addCriterion("catetory_id not in", values, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdBetween(String value1, String value2) {
            addCriterion("catetory_id between", value1, value2, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryIdNotBetween(String value1, String value2) {
            addCriterion("catetory_id not between", value1, value2, "catetoryId");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameIsNull() {
            addCriterion("catetory_name is null");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameIsNotNull() {
            addCriterion("catetory_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameEqualTo(String value) {
            addCriterion("catetory_name =", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameNotEqualTo(String value) {
            addCriterion("catetory_name <>", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameGreaterThan(String value) {
            addCriterion("catetory_name >", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("catetory_name >=", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameLessThan(String value) {
            addCriterion("catetory_name <", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameLessThanOrEqualTo(String value) {
            addCriterion("catetory_name <=", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameLike(String value) {
            addCriterion("catetory_name like", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameNotLike(String value) {
            addCriterion("catetory_name not like", value, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameIn(List<String> values) {
            addCriterion("catetory_name in", values, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameNotIn(List<String> values) {
            addCriterion("catetory_name not in", values, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameBetween(String value1, String value2) {
            addCriterion("catetory_name between", value1, value2, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andCatetoryNameNotBetween(String value1, String value2) {
            addCriterion("catetory_name not between", value1, value2, "catetoryName");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andIsDownIsNull() {
            addCriterion("is_down is null");
            return (Criteria) this;
        }

        public Criteria andIsDownIsNotNull() {
            addCriterion("is_down is not null");
            return (Criteria) this;
        }

        public Criteria andIsDownEqualTo(Integer value) {
            addCriterion("is_down =", value, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownNotEqualTo(Integer value) {
            addCriterion("is_down <>", value, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownGreaterThan(Integer value) {
            addCriterion("is_down >", value, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_down >=", value, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownLessThan(Integer value) {
            addCriterion("is_down <", value, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownLessThanOrEqualTo(Integer value) {
            addCriterion("is_down <=", value, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownIn(List<Integer> values) {
            addCriterion("is_down in", values, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownNotIn(List<Integer> values) {
            addCriterion("is_down not in", values, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownBetween(Integer value1, Integer value2) {
            addCriterion("is_down between", value1, value2, "isDown");
            return (Criteria) this;
        }

        public Criteria andIsDownNotBetween(Integer value1, Integer value2) {
            addCriterion("is_down not between", value1, value2, "isDown");
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