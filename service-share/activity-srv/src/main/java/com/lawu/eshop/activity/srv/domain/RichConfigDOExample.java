package com.lawu.eshop.activity.srv.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RichConfigDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public RichConfigDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rich_config
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rich_config
     *
     * @mbg.generated
     */
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

        public Criteria andDiamondEffectiveTimeIsNull() {
            addCriterion("diamond_effective_time is null");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeIsNotNull() {
            addCriterion("diamond_effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeEqualTo(Date value) {
            addCriterion("diamond_effective_time =", value, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeNotEqualTo(Date value) {
            addCriterion("diamond_effective_time <>", value, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeGreaterThan(Date value) {
            addCriterion("diamond_effective_time >", value, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("diamond_effective_time >=", value, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeLessThan(Date value) {
            addCriterion("diamond_effective_time <", value, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("diamond_effective_time <=", value, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeIn(List<Date> values) {
            addCriterion("diamond_effective_time in", values, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeNotIn(List<Date> values) {
            addCriterion("diamond_effective_time not in", values, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeBetween(Date value1, Date value2) {
            addCriterion("diamond_effective_time between", value1, value2, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andDiamondEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("diamond_effective_time not between", value1, value2, "diamondEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeIsNull() {
            addCriterion("power_effective_time is null");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeIsNotNull() {
            addCriterion("power_effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeEqualTo(Date value) {
            addCriterion("power_effective_time =", value, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeNotEqualTo(Date value) {
            addCriterion("power_effective_time <>", value, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeGreaterThan(Date value) {
            addCriterion("power_effective_time >", value, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("power_effective_time >=", value, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeLessThan(Date value) {
            addCriterion("power_effective_time <", value, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("power_effective_time <=", value, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeIn(List<Date> values) {
            addCriterion("power_effective_time in", values, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeNotIn(List<Date> values) {
            addCriterion("power_effective_time not in", values, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeBetween(Date value1, Date value2) {
            addCriterion("power_effective_time between", value1, value2, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andPowerEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("power_effective_time not between", value1, value2, "powerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeIsNull() {
            addCriterion("merchant_power_effective_time is null");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeIsNotNull() {
            addCriterion("merchant_power_effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeEqualTo(Date value) {
            addCriterion("merchant_power_effective_time =", value, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeNotEqualTo(Date value) {
            addCriterion("merchant_power_effective_time <>", value, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeGreaterThan(Date value) {
            addCriterion("merchant_power_effective_time >", value, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_power_effective_time >=", value, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeLessThan(Date value) {
            addCriterion("merchant_power_effective_time <", value, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("merchant_power_effective_time <=", value, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeIn(List<Date> values) {
            addCriterion("merchant_power_effective_time in", values, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeNotIn(List<Date> values) {
            addCriterion("merchant_power_effective_time not in", values, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeBetween(Date value1, Date value2) {
            addCriterion("merchant_power_effective_time between", value1, value2, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andMerchantPowerEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("merchant_power_effective_time not between", value1, value2, "merchantPowerEffectiveTime");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("notice is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("notice is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(String value) {
            addCriterion("notice =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(String value) {
            addCriterion("notice <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(String value) {
            addCriterion("notice >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("notice >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(String value) {
            addCriterion("notice <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(String value) {
            addCriterion("notice <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLike(String value) {
            addCriterion("notice like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotLike(String value) {
            addCriterion("notice not like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<String> values) {
            addCriterion("notice in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<String> values) {
            addCriterion("notice not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(String value1, String value2) {
            addCriterion("notice between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(String value1, String value2) {
            addCriterion("notice not between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeIsNull() {
            addCriterion("merchant_notice is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeIsNotNull() {
            addCriterion("merchant_notice is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeEqualTo(String value) {
            addCriterion("merchant_notice =", value, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeNotEqualTo(String value) {
            addCriterion("merchant_notice <>", value, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeGreaterThan(String value) {
            addCriterion("merchant_notice >", value, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_notice >=", value, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeLessThan(String value) {
            addCriterion("merchant_notice <", value, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeLessThanOrEqualTo(String value) {
            addCriterion("merchant_notice <=", value, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeLike(String value) {
            addCriterion("merchant_notice like", value, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeNotLike(String value) {
            addCriterion("merchant_notice not like", value, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeIn(List<String> values) {
            addCriterion("merchant_notice in", values, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeNotIn(List<String> values) {
            addCriterion("merchant_notice not in", values, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeBetween(String value1, String value2) {
            addCriterion("merchant_notice between", value1, value2, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andMerchantNoticeNotBetween(String value1, String value2) {
            addCriterion("merchant_notice not between", value1, value2, "merchantNotice");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rich_config
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rich_config
     *
     * @mbg.generated
     */
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