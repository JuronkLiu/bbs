package com.bbs.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostInfoExample() {
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

        public Criteria andPostTitleIsNull() {
            addCriterion("post_title is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("post_title is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("post_title =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("post_title <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("post_title >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("post_title >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("post_title <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("post_title <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("post_title like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("post_title not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("post_title in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("post_title not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("post_title between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("post_title not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostClickNumIsNull() {
            addCriterion("post_click_num is null");
            return (Criteria) this;
        }

        public Criteria andPostClickNumIsNotNull() {
            addCriterion("post_click_num is not null");
            return (Criteria) this;
        }

        public Criteria andPostClickNumEqualTo(Integer value) {
            addCriterion("post_click_num =", value, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumNotEqualTo(Integer value) {
            addCriterion("post_click_num <>", value, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumGreaterThan(Integer value) {
            addCriterion("post_click_num >", value, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_click_num >=", value, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumLessThan(Integer value) {
            addCriterion("post_click_num <", value, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("post_click_num <=", value, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumIn(List<Integer> values) {
            addCriterion("post_click_num in", values, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumNotIn(List<Integer> values) {
            addCriterion("post_click_num not in", values, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumBetween(Integer value1, Integer value2) {
            addCriterion("post_click_num between", value1, value2, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_click_num not between", value1, value2, "postClickNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumIsNull() {
            addCriterion("post_revert_num is null");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumIsNotNull() {
            addCriterion("post_revert_num is not null");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumEqualTo(Integer value) {
            addCriterion("post_revert_num =", value, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumNotEqualTo(Integer value) {
            addCriterion("post_revert_num <>", value, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumGreaterThan(Integer value) {
            addCriterion("post_revert_num >", value, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_revert_num >=", value, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumLessThan(Integer value) {
            addCriterion("post_revert_num <", value, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumLessThanOrEqualTo(Integer value) {
            addCriterion("post_revert_num <=", value, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumIn(List<Integer> values) {
            addCriterion("post_revert_num in", values, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumNotIn(List<Integer> values) {
            addCriterion("post_revert_num not in", values, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumBetween(Integer value1, Integer value2) {
            addCriterion("post_revert_num between", value1, value2, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostRevertNumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_revert_num not between", value1, value2, "postRevertNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumIsNull() {
            addCriterion("post_fine_num is null");
            return (Criteria) this;
        }

        public Criteria andPostFineNumIsNotNull() {
            addCriterion("post_fine_num is not null");
            return (Criteria) this;
        }

        public Criteria andPostFineNumEqualTo(Integer value) {
            addCriterion("post_fine_num =", value, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumNotEqualTo(Integer value) {
            addCriterion("post_fine_num <>", value, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumGreaterThan(Integer value) {
            addCriterion("post_fine_num >", value, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_fine_num >=", value, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumLessThan(Integer value) {
            addCriterion("post_fine_num <", value, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumLessThanOrEqualTo(Integer value) {
            addCriterion("post_fine_num <=", value, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumIn(List<Integer> values) {
            addCriterion("post_fine_num in", values, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumNotIn(List<Integer> values) {
            addCriterion("post_fine_num not in", values, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumBetween(Integer value1, Integer value2) {
            addCriterion("post_fine_num between", value1, value2, "postFineNum");
            return (Criteria) this;
        }

        public Criteria andPostFineNumNotBetween(Integer value1, Integer value2) {
            addCriterion("post_fine_num not between", value1, value2, "postFineNum");
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

        public Criteria andIsOffIsNull() {
            addCriterion("is_off is null");
            return (Criteria) this;
        }

        public Criteria andIsOffIsNotNull() {
            addCriterion("is_off is not null");
            return (Criteria) this;
        }

        public Criteria andIsOffEqualTo(Integer value) {
            addCriterion("is_off =", value, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffNotEqualTo(Integer value) {
            addCriterion("is_off <>", value, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffGreaterThan(Integer value) {
            addCriterion("is_off >", value, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_off >=", value, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffLessThan(Integer value) {
            addCriterion("is_off <", value, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffLessThanOrEqualTo(Integer value) {
            addCriterion("is_off <=", value, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffIn(List<Integer> values) {
            addCriterion("is_off in", values, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffNotIn(List<Integer> values) {
            addCriterion("is_off not in", values, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffBetween(Integer value1, Integer value2) {
            addCriterion("is_off between", value1, value2, "isOff");
            return (Criteria) this;
        }

        public Criteria andIsOffNotBetween(Integer value1, Integer value2) {
            addCriterion("is_off not between", value1, value2, "isOff");
            return (Criteria) this;
        }

        public Criteria andOffReasonIsNull() {
            addCriterion("off_reason is null");
            return (Criteria) this;
        }

        public Criteria andOffReasonIsNotNull() {
            addCriterion("off_reason is not null");
            return (Criteria) this;
        }

        public Criteria andOffReasonEqualTo(String value) {
            addCriterion("off_reason =", value, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonNotEqualTo(String value) {
            addCriterion("off_reason <>", value, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonGreaterThan(String value) {
            addCriterion("off_reason >", value, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonGreaterThanOrEqualTo(String value) {
            addCriterion("off_reason >=", value, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonLessThan(String value) {
            addCriterion("off_reason <", value, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonLessThanOrEqualTo(String value) {
            addCriterion("off_reason <=", value, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonLike(String value) {
            addCriterion("off_reason like", value, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonNotLike(String value) {
            addCriterion("off_reason not like", value, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonIn(List<String> values) {
            addCriterion("off_reason in", values, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonNotIn(List<String> values) {
            addCriterion("off_reason not in", values, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonBetween(String value1, String value2) {
            addCriterion("off_reason between", value1, value2, "offReason");
            return (Criteria) this;
        }

        public Criteria andOffReasonNotBetween(String value1, String value2) {
            addCriterion("off_reason not between", value1, value2, "offReason");
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