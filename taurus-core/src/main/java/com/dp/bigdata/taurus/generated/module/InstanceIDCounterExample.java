package com.dp.bigdata.taurus.generated.module;

import java.util.ArrayList;
import java.util.List;

public class InstanceIDCounterExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public InstanceIDCounterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
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
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
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

        public Criteria andInstanceidIsNull() {
            addCriterion("instanceID is null");
            return (Criteria) this;
        }

        public Criteria andInstanceidIsNotNull() {
            addCriterion("instanceID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceidEqualTo(String value) {
            addCriterion("instanceID =", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotEqualTo(String value) {
            addCriterion("instanceID <>", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThan(String value) {
            addCriterion("instanceID >", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("instanceID >=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThan(String value) {
            addCriterion("instanceID <", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThanOrEqualTo(String value) {
            addCriterion("instanceID <=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLike(String value) {
            addCriterion("instanceID like", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotLike(String value) {
            addCriterion("instanceID not like", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidIn(List<String> values) {
            addCriterion("instanceID in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotIn(List<String> values) {
            addCriterion("instanceID not in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidBetween(String value1, String value2) {
            addCriterion("instanceID between", value1, value2, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotBetween(String value1, String value2) {
            addCriterion("instanceID not between", value1, value2, "instanceid");
            return (Criteria) this;
        }

        public Criteria andCounterIsNull() {
            addCriterion("counter is null");
            return (Criteria) this;
        }

        public Criteria andCounterIsNotNull() {
            addCriterion("counter is not null");
            return (Criteria) this;
        }

        public Criteria andCounterEqualTo(Integer value) {
            addCriterion("counter =", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterNotEqualTo(Integer value) {
            addCriterion("counter <>", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterGreaterThan(Integer value) {
            addCriterion("counter >", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterGreaterThanOrEqualTo(Integer value) {
            addCriterion("counter >=", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterLessThan(Integer value) {
            addCriterion("counter <", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterLessThanOrEqualTo(Integer value) {
            addCriterion("counter <=", value, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterIn(List<Integer> values) {
            addCriterion("counter in", values, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterNotIn(List<Integer> values) {
            addCriterion("counter not in", values, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterBetween(Integer value1, Integer value2) {
            addCriterion("counter between", value1, value2, "counter");
            return (Criteria) this;
        }

        public Criteria andCounterNotBetween(Integer value1, Integer value2) {
            addCriterion("counter not between", value1, value2, "counter");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 19 17:03:27 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TaurusInstanceIDCounter
     *
     * @mbggenerated Mon Aug 19 17:03:27 CST 2013
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