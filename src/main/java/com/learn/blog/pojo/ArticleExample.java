package com.learn.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSummeryIsNull() {
            addCriterion("summery is null");
            return (Criteria) this;
        }

        public Criteria andSummeryIsNotNull() {
            addCriterion("summery is not null");
            return (Criteria) this;
        }

        public Criteria andSummeryEqualTo(Integer value) {
            addCriterion("summery =", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryNotEqualTo(Integer value) {
            addCriterion("summery <>", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryGreaterThan(Integer value) {
            addCriterion("summery >", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryGreaterThanOrEqualTo(Integer value) {
            addCriterion("summery >=", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryLessThan(Integer value) {
            addCriterion("summery <", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryLessThanOrEqualTo(Integer value) {
            addCriterion("summery <=", value, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryIn(List<Integer> values) {
            addCriterion("summery in", values, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryNotIn(List<Integer> values) {
            addCriterion("summery not in", values, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryBetween(Integer value1, Integer value2) {
            addCriterion("summery between", value1, value2, "summery");
            return (Criteria) this;
        }

        public Criteria andSummeryNotBetween(Integer value1, Integer value2) {
            addCriterion("summery not between", value1, value2, "summery");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentIsNull() {
            addCriterion("htmlContent is null");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentIsNotNull() {
            addCriterion("htmlContent is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentEqualTo(String value) {
            addCriterion("htmlContent =", value, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentNotEqualTo(String value) {
            addCriterion("htmlContent <>", value, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentGreaterThan(String value) {
            addCriterion("htmlContent >", value, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentGreaterThanOrEqualTo(String value) {
            addCriterion("htmlContent >=", value, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentLessThan(String value) {
            addCriterion("htmlContent <", value, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentLessThanOrEqualTo(String value) {
            addCriterion("htmlContent <=", value, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentLike(String value) {
            addCriterion("htmlContent like", value, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentNotLike(String value) {
            addCriterion("htmlContent not like", value, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentIn(List<String> values) {
            addCriterion("htmlContent in", values, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentNotIn(List<String> values) {
            addCriterion("htmlContent not in", values, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentBetween(String value1, String value2) {
            addCriterion("htmlContent between", value1, value2, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andHtmlcontentNotBetween(String value1, String value2) {
            addCriterion("htmlContent not between", value1, value2, "htmlcontent");
            return (Criteria) this;
        }

        public Criteria andReadsizeIsNull() {
            addCriterion("readSize is null");
            return (Criteria) this;
        }

        public Criteria andReadsizeIsNotNull() {
            addCriterion("readSize is not null");
            return (Criteria) this;
        }

        public Criteria andReadsizeEqualTo(String value) {
            addCriterion("readSize =", value, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeNotEqualTo(String value) {
            addCriterion("readSize <>", value, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeGreaterThan(String value) {
            addCriterion("readSize >", value, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeGreaterThanOrEqualTo(String value) {
            addCriterion("readSize >=", value, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeLessThan(String value) {
            addCriterion("readSize <", value, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeLessThanOrEqualTo(String value) {
            addCriterion("readSize <=", value, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeLike(String value) {
            addCriterion("readSize like", value, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeNotLike(String value) {
            addCriterion("readSize not like", value, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeIn(List<String> values) {
            addCriterion("readSize in", values, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeNotIn(List<String> values) {
            addCriterion("readSize not in", values, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeBetween(String value1, String value2) {
            addCriterion("readSize between", value1, value2, "readsize");
            return (Criteria) this;
        }

        public Criteria andReadsizeNotBetween(String value1, String value2) {
            addCriterion("readSize not between", value1, value2, "readsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeIsNull() {
            addCriterion("commentSize is null");
            return (Criteria) this;
        }

        public Criteria andCommentsizeIsNotNull() {
            addCriterion("commentSize is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsizeEqualTo(Integer value) {
            addCriterion("commentSize =", value, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeNotEqualTo(Integer value) {
            addCriterion("commentSize <>", value, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeGreaterThan(Integer value) {
            addCriterion("commentSize >", value, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentSize >=", value, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeLessThan(Integer value) {
            addCriterion("commentSize <", value, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeLessThanOrEqualTo(Integer value) {
            addCriterion("commentSize <=", value, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeIn(List<Integer> values) {
            addCriterion("commentSize in", values, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeNotIn(List<Integer> values) {
            addCriterion("commentSize not in", values, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeBetween(Integer value1, Integer value2) {
            addCriterion("commentSize between", value1, value2, "commentsize");
            return (Criteria) this;
        }

        public Criteria andCommentsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("commentSize not between", value1, value2, "commentsize");
            return (Criteria) this;
        }

        public Criteria andLikesizeIsNull() {
            addCriterion("likeSize is null");
            return (Criteria) this;
        }

        public Criteria andLikesizeIsNotNull() {
            addCriterion("likeSize is not null");
            return (Criteria) this;
        }

        public Criteria andLikesizeEqualTo(Integer value) {
            addCriterion("likeSize =", value, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeNotEqualTo(Integer value) {
            addCriterion("likeSize <>", value, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeGreaterThan(Integer value) {
            addCriterion("likeSize >", value, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeSize >=", value, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeLessThan(Integer value) {
            addCriterion("likeSize <", value, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeLessThanOrEqualTo(Integer value) {
            addCriterion("likeSize <=", value, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeIn(List<Integer> values) {
            addCriterion("likeSize in", values, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeNotIn(List<Integer> values) {
            addCriterion("likeSize not in", values, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeBetween(Integer value1, Integer value2) {
            addCriterion("likeSize between", value1, value2, "likesize");
            return (Criteria) this;
        }

        public Criteria andLikesizeNotBetween(Integer value1, Integer value2) {
            addCriterion("likeSize not between", value1, value2, "likesize");
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