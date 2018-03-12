package com.learn.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LablesExample() {
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

        public Criteria andLablesIdIsNull() {
            addCriterion("lables_id is null");
            return (Criteria) this;
        }

        public Criteria andLablesIdIsNotNull() {
            addCriterion("lables_id is not null");
            return (Criteria) this;
        }

        public Criteria andLablesIdEqualTo(Integer value) {
            addCriterion("lables_id =", value, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdNotEqualTo(Integer value) {
            addCriterion("lables_id <>", value, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdGreaterThan(Integer value) {
            addCriterion("lables_id >", value, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lables_id >=", value, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdLessThan(Integer value) {
            addCriterion("lables_id <", value, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdLessThanOrEqualTo(Integer value) {
            addCriterion("lables_id <=", value, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdIn(List<Integer> values) {
            addCriterion("lables_id in", values, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdNotIn(List<Integer> values) {
            addCriterion("lables_id not in", values, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdBetween(Integer value1, Integer value2) {
            addCriterion("lables_id between", value1, value2, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lables_id not between", value1, value2, "lablesId");
            return (Criteria) this;
        }

        public Criteria andLablesStatusIsNull() {
            addCriterion("lables_status is null");
            return (Criteria) this;
        }

        public Criteria andLablesStatusIsNotNull() {
            addCriterion("lables_status is not null");
            return (Criteria) this;
        }

        public Criteria andLablesStatusEqualTo(Integer value) {
            addCriterion("lables_status =", value, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusNotEqualTo(Integer value) {
            addCriterion("lables_status <>", value, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusGreaterThan(Integer value) {
            addCriterion("lables_status >", value, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("lables_status >=", value, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusLessThan(Integer value) {
            addCriterion("lables_status <", value, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusLessThanOrEqualTo(Integer value) {
            addCriterion("lables_status <=", value, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusIn(List<Integer> values) {
            addCriterion("lables_status in", values, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusNotIn(List<Integer> values) {
            addCriterion("lables_status not in", values, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusBetween(Integer value1, Integer value2) {
            addCriterion("lables_status between", value1, value2, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("lables_status not between", value1, value2, "lablesStatus");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedIsNull() {
            addCriterion("lables_created is null");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedIsNotNull() {
            addCriterion("lables_created is not null");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedEqualTo(Date value) {
            addCriterion("lables_created =", value, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedNotEqualTo(Date value) {
            addCriterion("lables_created <>", value, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedGreaterThan(Date value) {
            addCriterion("lables_created >", value, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("lables_created >=", value, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedLessThan(Date value) {
            addCriterion("lables_created <", value, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedLessThanOrEqualTo(Date value) {
            addCriterion("lables_created <=", value, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedIn(List<Date> values) {
            addCriterion("lables_created in", values, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedNotIn(List<Date> values) {
            addCriterion("lables_created not in", values, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedBetween(Date value1, Date value2) {
            addCriterion("lables_created between", value1, value2, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesCreatedNotBetween(Date value1, Date value2) {
            addCriterion("lables_created not between", value1, value2, "lablesCreated");
            return (Criteria) this;
        }

        public Criteria andLablesContentIsNull() {
            addCriterion("lables_content is null");
            return (Criteria) this;
        }

        public Criteria andLablesContentIsNotNull() {
            addCriterion("lables_content is not null");
            return (Criteria) this;
        }

        public Criteria andLablesContentEqualTo(String value) {
            addCriterion("lables_content =", value, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentNotEqualTo(String value) {
            addCriterion("lables_content <>", value, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentGreaterThan(String value) {
            addCriterion("lables_content >", value, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentGreaterThanOrEqualTo(String value) {
            addCriterion("lables_content >=", value, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentLessThan(String value) {
            addCriterion("lables_content <", value, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentLessThanOrEqualTo(String value) {
            addCriterion("lables_content <=", value, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentLike(String value) {
            addCriterion("lables_content like", value, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentNotLike(String value) {
            addCriterion("lables_content not like", value, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentIn(List<String> values) {
            addCriterion("lables_content in", values, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentNotIn(List<String> values) {
            addCriterion("lables_content not in", values, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentBetween(String value1, String value2) {
            addCriterion("lables_content between", value1, value2, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesContentNotBetween(String value1, String value2) {
            addCriterion("lables_content not between", value1, value2, "lablesContent");
            return (Criteria) this;
        }

        public Criteria andLablesDescIsNull() {
            addCriterion("lables_desc is null");
            return (Criteria) this;
        }

        public Criteria andLablesDescIsNotNull() {
            addCriterion("lables_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLablesDescEqualTo(String value) {
            addCriterion("lables_desc =", value, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescNotEqualTo(String value) {
            addCriterion("lables_desc <>", value, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescGreaterThan(String value) {
            addCriterion("lables_desc >", value, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescGreaterThanOrEqualTo(String value) {
            addCriterion("lables_desc >=", value, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescLessThan(String value) {
            addCriterion("lables_desc <", value, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescLessThanOrEqualTo(String value) {
            addCriterion("lables_desc <=", value, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescLike(String value) {
            addCriterion("lables_desc like", value, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescNotLike(String value) {
            addCriterion("lables_desc not like", value, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescIn(List<String> values) {
            addCriterion("lables_desc in", values, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescNotIn(List<String> values) {
            addCriterion("lables_desc not in", values, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescBetween(String value1, String value2) {
            addCriterion("lables_desc between", value1, value2, "lablesDesc");
            return (Criteria) this;
        }

        public Criteria andLablesDescNotBetween(String value1, String value2) {
            addCriterion("lables_desc not between", value1, value2, "lablesDesc");
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