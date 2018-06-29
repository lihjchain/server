package com.lawu.eshop.ad.srv.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TakeInviterBountyDetailDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    public TakeInviterBountyDetailDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
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
     * This method corresponds to the database table take_inviter_bounty_detail
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
     * This method corresponds to the database table take_inviter_bounty_detail
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table take_inviter_bounty_detail
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
     * This class corresponds to the database table take_inviter_bounty_detail
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

        public Criteria andUserNumIsNull() {
            addCriterion("user_num is null");
            return (Criteria) this;
        }

        public Criteria andUserNumIsNotNull() {
            addCriterion("user_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumEqualTo(String value) {
            addCriterion("user_num =", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotEqualTo(String value) {
            addCriterion("user_num <>", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumGreaterThan(String value) {
            addCriterion("user_num >", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumGreaterThanOrEqualTo(String value) {
            addCriterion("user_num >=", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLessThan(String value) {
            addCriterion("user_num <", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLessThanOrEqualTo(String value) {
            addCriterion("user_num <=", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLike(String value) {
            addCriterion("user_num like", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotLike(String value) {
            addCriterion("user_num not like", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumIn(List<String> values) {
            addCriterion("user_num in", values, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotIn(List<String> values) {
            addCriterion("user_num not in", values, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumBetween(String value1, String value2) {
            addCriterion("user_num between", value1, value2, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotBetween(String value1, String value2) {
            addCriterion("user_num not between", value1, value2, "userNum");
            return (Criteria) this;
        }

        public Criteria andRegNumIsNull() {
            addCriterion("reg_num is null");
            return (Criteria) this;
        }

        public Criteria andRegNumIsNotNull() {
            addCriterion("reg_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegNumEqualTo(String value) {
            addCriterion("reg_num =", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotEqualTo(String value) {
            addCriterion("reg_num <>", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumGreaterThan(String value) {
            addCriterion("reg_num >", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumGreaterThanOrEqualTo(String value) {
            addCriterion("reg_num >=", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLessThan(String value) {
            addCriterion("reg_num <", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLessThanOrEqualTo(String value) {
            addCriterion("reg_num <=", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLike(String value) {
            addCriterion("reg_num like", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotLike(String value) {
            addCriterion("reg_num not like", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumIn(List<String> values) {
            addCriterion("reg_num in", values, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotIn(List<String> values) {
            addCriterion("reg_num not in", values, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumBetween(String value1, String value2) {
            addCriterion("reg_num between", value1, value2, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotBetween(String value1, String value2) {
            addCriterion("reg_num not between", value1, value2, "regNum");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdIsNull() {
            addCriterion("red_packet_id is null");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdIsNotNull() {
            addCriterion("red_packet_id is not null");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdEqualTo(Long value) {
            addCriterion("red_packet_id =", value, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdNotEqualTo(Long value) {
            addCriterion("red_packet_id <>", value, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdGreaterThan(Long value) {
            addCriterion("red_packet_id >", value, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("red_packet_id >=", value, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdLessThan(Long value) {
            addCriterion("red_packet_id <", value, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdLessThanOrEqualTo(Long value) {
            addCriterion("red_packet_id <=", value, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdIn(List<Long> values) {
            addCriterion("red_packet_id in", values, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdNotIn(List<Long> values) {
            addCriterion("red_packet_id not in", values, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdBetween(Long value1, Long value2) {
            addCriterion("red_packet_id between", value1, value2, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andRedPacketIdNotBetween(Long value1, Long value2) {
            addCriterion("red_packet_id not between", value1, value2, "redPacketId");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(BigDecimal value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(BigDecimal value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(BigDecimal value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(BigDecimal value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<BigDecimal> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<BigDecimal> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point not between", value1, value2, "point");
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
     * This class corresponds to the database table take_inviter_bounty_detail
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
     * This class corresponds to the database table take_inviter_bounty_detail
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