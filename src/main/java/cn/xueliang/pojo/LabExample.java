package cn.xueliang.pojo;

import java.util.ArrayList;
import java.util.List;

public class LabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabExample() {
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

        public Criteria andLabNumIsNull() {
            addCriterion("lab_num is null");
            return (Criteria) this;
        }

        public Criteria andLabNumIsNotNull() {
            addCriterion("lab_num is not null");
            return (Criteria) this;
        }

        public Criteria andLabNumEqualTo(String value) {
            addCriterion("lab_num =", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumNotEqualTo(String value) {
            addCriterion("lab_num <>", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumGreaterThan(String value) {
            addCriterion("lab_num >", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumGreaterThanOrEqualTo(String value) {
            addCriterion("lab_num >=", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumLessThan(String value) {
            addCriterion("lab_num <", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumLessThanOrEqualTo(String value) {
            addCriterion("lab_num <=", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumLike(String value) {
            addCriterion("lab_num like", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumNotLike(String value) {
            addCriterion("lab_num not like", value, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumIn(List<String> values) {
            addCriterion("lab_num in", values, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumNotIn(List<String> values) {
            addCriterion("lab_num not in", values, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumBetween(String value1, String value2) {
            addCriterion("lab_num between", value1, value2, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNumNotBetween(String value1, String value2) {
            addCriterion("lab_num not between", value1, value2, "labNum");
            return (Criteria) this;
        }

        public Criteria andLabNameIsNull() {
            addCriterion("lab_name is null");
            return (Criteria) this;
        }

        public Criteria andLabNameIsNotNull() {
            addCriterion("lab_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabNameEqualTo(String value) {
            addCriterion("lab_name =", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotEqualTo(String value) {
            addCriterion("lab_name <>", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameGreaterThan(String value) {
            addCriterion("lab_name >", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameGreaterThanOrEqualTo(String value) {
            addCriterion("lab_name >=", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLessThan(String value) {
            addCriterion("lab_name <", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLessThanOrEqualTo(String value) {
            addCriterion("lab_name <=", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameLike(String value) {
            addCriterion("lab_name like", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotLike(String value) {
            addCriterion("lab_name not like", value, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameIn(List<String> values) {
            addCriterion("lab_name in", values, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotIn(List<String> values) {
            addCriterion("lab_name not in", values, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameBetween(String value1, String value2) {
            addCriterion("lab_name between", value1, value2, "labName");
            return (Criteria) this;
        }

        public Criteria andLabNameNotBetween(String value1, String value2) {
            addCriterion("lab_name not between", value1, value2, "labName");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyIsNull() {
            addCriterion("lab_catagroy is null");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyIsNotNull() {
            addCriterion("lab_catagroy is not null");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyEqualTo(String value) {
            addCriterion("lab_catagroy =", value, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyNotEqualTo(String value) {
            addCriterion("lab_catagroy <>", value, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyGreaterThan(String value) {
            addCriterion("lab_catagroy >", value, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyGreaterThanOrEqualTo(String value) {
            addCriterion("lab_catagroy >=", value, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyLessThan(String value) {
            addCriterion("lab_catagroy <", value, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyLessThanOrEqualTo(String value) {
            addCriterion("lab_catagroy <=", value, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyLike(String value) {
            addCriterion("lab_catagroy like", value, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyNotLike(String value) {
            addCriterion("lab_catagroy not like", value, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyIn(List<String> values) {
            addCriterion("lab_catagroy in", values, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyNotIn(List<String> values) {
            addCriterion("lab_catagroy not in", values, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyBetween(String value1, String value2) {
            addCriterion("lab_catagroy between", value1, value2, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabCatagroyNotBetween(String value1, String value2) {
            addCriterion("lab_catagroy not between", value1, value2, "labCatagroy");
            return (Criteria) this;
        }

        public Criteria andLabStatusIsNull() {
            addCriterion("lab_status is null");
            return (Criteria) this;
        }

        public Criteria andLabStatusIsNotNull() {
            addCriterion("lab_status is not null");
            return (Criteria) this;
        }

        public Criteria andLabStatusEqualTo(Integer value) {
            addCriterion("lab_status =", value, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusNotEqualTo(Integer value) {
            addCriterion("lab_status <>", value, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusGreaterThan(Integer value) {
            addCriterion("lab_status >", value, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_status >=", value, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusLessThan(Integer value) {
            addCriterion("lab_status <", value, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lab_status <=", value, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusIn(List<Integer> values) {
            addCriterion("lab_status in", values, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusNotIn(List<Integer> values) {
            addCriterion("lab_status not in", values, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusBetween(Integer value1, Integer value2) {
            addCriterion("lab_status between", value1, value2, "labStatus");
            return (Criteria) this;
        }

        public Criteria andLabStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_status not between", value1, value2, "labStatus");
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