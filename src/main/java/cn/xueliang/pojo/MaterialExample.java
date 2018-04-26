package cn.xueliang.pojo;

import java.util.ArrayList;
import java.util.List;

public class MaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialExample() {
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

        public Criteria andMatNumIsNull() {
            addCriterion("mat_num is null");
            return (Criteria) this;
        }

        public Criteria andMatNumIsNotNull() {
            addCriterion("mat_num is not null");
            return (Criteria) this;
        }

        public Criteria andMatNumEqualTo(String value) {
            addCriterion("mat_num =", value, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumNotEqualTo(String value) {
            addCriterion("mat_num <>", value, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumGreaterThan(String value) {
            addCriterion("mat_num >", value, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumGreaterThanOrEqualTo(String value) {
            addCriterion("mat_num >=", value, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumLessThan(String value) {
            addCriterion("mat_num <", value, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumLessThanOrEqualTo(String value) {
            addCriterion("mat_num <=", value, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumLike(String value) {
            addCriterion("mat_num like", value, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumNotLike(String value) {
            addCriterion("mat_num not like", value, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumIn(List<String> values) {
            addCriterion("mat_num in", values, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumNotIn(List<String> values) {
            addCriterion("mat_num not in", values, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumBetween(String value1, String value2) {
            addCriterion("mat_num between", value1, value2, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNumNotBetween(String value1, String value2) {
            addCriterion("mat_num not between", value1, value2, "matNum");
            return (Criteria) this;
        }

        public Criteria andMatNameIsNull() {
            addCriterion("mat_name is null");
            return (Criteria) this;
        }

        public Criteria andMatNameIsNotNull() {
            addCriterion("mat_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatNameEqualTo(String value) {
            addCriterion("mat_name =", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotEqualTo(String value) {
            addCriterion("mat_name <>", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameGreaterThan(String value) {
            addCriterion("mat_name >", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameGreaterThanOrEqualTo(String value) {
            addCriterion("mat_name >=", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLessThan(String value) {
            addCriterion("mat_name <", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLessThanOrEqualTo(String value) {
            addCriterion("mat_name <=", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameLike(String value) {
            addCriterion("mat_name like", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotLike(String value) {
            addCriterion("mat_name not like", value, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameIn(List<String> values) {
            addCriterion("mat_name in", values, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotIn(List<String> values) {
            addCriterion("mat_name not in", values, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameBetween(String value1, String value2) {
            addCriterion("mat_name between", value1, value2, "matName");
            return (Criteria) this;
        }

        public Criteria andMatNameNotBetween(String value1, String value2) {
            addCriterion("mat_name not between", value1, value2, "matName");
            return (Criteria) this;
        }

        public Criteria andMatAttributeIsNull() {
            addCriterion("mat_attribute is null");
            return (Criteria) this;
        }

        public Criteria andMatAttributeIsNotNull() {
            addCriterion("mat_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andMatAttributeEqualTo(String value) {
            addCriterion("mat_attribute =", value, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeNotEqualTo(String value) {
            addCriterion("mat_attribute <>", value, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeGreaterThan(String value) {
            addCriterion("mat_attribute >", value, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("mat_attribute >=", value, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeLessThan(String value) {
            addCriterion("mat_attribute <", value, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeLessThanOrEqualTo(String value) {
            addCriterion("mat_attribute <=", value, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeLike(String value) {
            addCriterion("mat_attribute like", value, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeNotLike(String value) {
            addCriterion("mat_attribute not like", value, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeIn(List<String> values) {
            addCriterion("mat_attribute in", values, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeNotIn(List<String> values) {
            addCriterion("mat_attribute not in", values, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeBetween(String value1, String value2) {
            addCriterion("mat_attribute between", value1, value2, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatAttributeNotBetween(String value1, String value2) {
            addCriterion("mat_attribute not between", value1, value2, "matAttribute");
            return (Criteria) this;
        }

        public Criteria andMatRemainIsNull() {
            addCriterion("mat_remain is null");
            return (Criteria) this;
        }

        public Criteria andMatRemainIsNotNull() {
            addCriterion("mat_remain is not null");
            return (Criteria) this;
        }

        public Criteria andMatRemainEqualTo(Double value) {
            addCriterion("mat_remain =", value, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainNotEqualTo(Double value) {
            addCriterion("mat_remain <>", value, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainGreaterThan(Double value) {
            addCriterion("mat_remain >", value, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainGreaterThanOrEqualTo(Double value) {
            addCriterion("mat_remain >=", value, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainLessThan(Double value) {
            addCriterion("mat_remain <", value, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainLessThanOrEqualTo(Double value) {
            addCriterion("mat_remain <=", value, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainIn(List<Double> values) {
            addCriterion("mat_remain in", values, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainNotIn(List<Double> values) {
            addCriterion("mat_remain not in", values, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainBetween(Double value1, Double value2) {
            addCriterion("mat_remain between", value1, value2, "matRemain");
            return (Criteria) this;
        }

        public Criteria andMatRemainNotBetween(Double value1, Double value2) {
            addCriterion("mat_remain not between", value1, value2, "matRemain");
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