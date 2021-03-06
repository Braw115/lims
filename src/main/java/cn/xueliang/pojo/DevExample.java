package cn.xueliang.pojo;

import java.util.ArrayList;
import java.util.List;

public class DevExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevExample() {
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

        public Criteria andDevNumIsNull() {
            addCriterion("dev_num is null");
            return (Criteria) this;
        }

        public Criteria andDevNumIsNotNull() {
            addCriterion("dev_num is not null");
            return (Criteria) this;
        }

        public Criteria andDevNumEqualTo(String value) {
            addCriterion("dev_num =", value, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumNotEqualTo(String value) {
            addCriterion("dev_num <>", value, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumGreaterThan(String value) {
            addCriterion("dev_num >", value, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumGreaterThanOrEqualTo(String value) {
            addCriterion("dev_num >=", value, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumLessThan(String value) {
            addCriterion("dev_num <", value, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumLessThanOrEqualTo(String value) {
            addCriterion("dev_num <=", value, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumLike(String value) {
            addCriterion("dev_num like", value, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumNotLike(String value) {
            addCriterion("dev_num not like", value, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumIn(List<String> values) {
            addCriterion("dev_num in", values, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumNotIn(List<String> values) {
            addCriterion("dev_num not in", values, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumBetween(String value1, String value2) {
            addCriterion("dev_num between", value1, value2, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNumNotBetween(String value1, String value2) {
            addCriterion("dev_num not between", value1, value2, "devNum");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNull() {
            addCriterion("dev_name is null");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNotNull() {
            addCriterion("dev_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevNameEqualTo(String value) {
            addCriterion("dev_name =", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotEqualTo(String value) {
            addCriterion("dev_name <>", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThan(String value) {
            addCriterion("dev_name >", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThanOrEqualTo(String value) {
            addCriterion("dev_name >=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThan(String value) {
            addCriterion("dev_name <", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThanOrEqualTo(String value) {
            addCriterion("dev_name <=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLike(String value) {
            addCriterion("dev_name like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotLike(String value) {
            addCriterion("dev_name not like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameIn(List<String> values) {
            addCriterion("dev_name in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotIn(List<String> values) {
            addCriterion("dev_name not in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameBetween(String value1, String value2) {
            addCriterion("dev_name between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotBetween(String value1, String value2) {
            addCriterion("dev_name not between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevAttributeIsNull() {
            addCriterion("dev_attribute is null");
            return (Criteria) this;
        }

        public Criteria andDevAttributeIsNotNull() {
            addCriterion("dev_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andDevAttributeEqualTo(String value) {
            addCriterion("dev_attribute =", value, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeNotEqualTo(String value) {
            addCriterion("dev_attribute <>", value, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeGreaterThan(String value) {
            addCriterion("dev_attribute >", value, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("dev_attribute >=", value, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeLessThan(String value) {
            addCriterion("dev_attribute <", value, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeLessThanOrEqualTo(String value) {
            addCriterion("dev_attribute <=", value, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeLike(String value) {
            addCriterion("dev_attribute like", value, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeNotLike(String value) {
            addCriterion("dev_attribute not like", value, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeIn(List<String> values) {
            addCriterion("dev_attribute in", values, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeNotIn(List<String> values) {
            addCriterion("dev_attribute not in", values, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeBetween(String value1, String value2) {
            addCriterion("dev_attribute between", value1, value2, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevAttributeNotBetween(String value1, String value2) {
            addCriterion("dev_attribute not between", value1, value2, "devAttribute");
            return (Criteria) this;
        }

        public Criteria andDevStatusIsNull() {
            addCriterion("dev_status is null");
            return (Criteria) this;
        }

        public Criteria andDevStatusIsNotNull() {
            addCriterion("dev_status is not null");
            return (Criteria) this;
        }

        public Criteria andDevStatusEqualTo(Integer value) {
            addCriterion("dev_status =", value, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusNotEqualTo(Integer value) {
            addCriterion("dev_status <>", value, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusGreaterThan(Integer value) {
            addCriterion("dev_status >", value, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_status >=", value, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusLessThan(Integer value) {
            addCriterion("dev_status <", value, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dev_status <=", value, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusIn(List<Integer> values) {
            addCriterion("dev_status in", values, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusNotIn(List<Integer> values) {
            addCriterion("dev_status not in", values, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusBetween(Integer value1, Integer value2) {
            addCriterion("dev_status between", value1, value2, "devStatus");
            return (Criteria) this;
        }

        public Criteria andDevStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_status not between", value1, value2, "devStatus");
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