package com.learn.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIsNull() {
            addCriterion("article_status is null");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIsNotNull() {
            addCriterion("article_status is not null");
            return (Criteria) this;
        }

        public Criteria andArticleStatusEqualTo(String value) {
            addCriterion("article_status =", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotEqualTo(String value) {
            addCriterion("article_status <>", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusGreaterThan(String value) {
            addCriterion("article_status >", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("article_status >=", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusLessThan(String value) {
            addCriterion("article_status <", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusLessThanOrEqualTo(String value) {
            addCriterion("article_status <=", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusLike(String value) {
            addCriterion("article_status like", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotLike(String value) {
            addCriterion("article_status not like", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIn(List<String> values) {
            addCriterion("article_status in", values, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotIn(List<String> values) {
            addCriterion("article_status not in", values, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusBetween(String value1, String value2) {
            addCriterion("article_status between", value1, value2, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotBetween(String value1, String value2) {
            addCriterion("article_status not between", value1, value2, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedIsNull() {
            addCriterion("article_created is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedIsNotNull() {
            addCriterion("article_created is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedEqualTo(Date value) {
            addCriterion("article_created =", value, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedNotEqualTo(Date value) {
            addCriterion("article_created <>", value, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedGreaterThan(Date value) {
            addCriterion("article_created >", value, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("article_created >=", value, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedLessThan(Date value) {
            addCriterion("article_created <", value, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedLessThanOrEqualTo(Date value) {
            addCriterion("article_created <=", value, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedIn(List<Date> values) {
            addCriterion("article_created in", values, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedNotIn(List<Date> values) {
            addCriterion("article_created not in", values, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedBetween(Date value1, Date value2) {
            addCriterion("article_created between", value1, value2, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleCreatedNotBetween(Date value1, Date value2) {
            addCriterion("article_created not between", value1, value2, "articleCreated");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryIsNull() {
            addCriterion("article_summery is null");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryIsNotNull() {
            addCriterion("article_summery is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryEqualTo(Integer value) {
            addCriterion("article_summery =", value, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryNotEqualTo(Integer value) {
            addCriterion("article_summery <>", value, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryGreaterThan(Integer value) {
            addCriterion("article_summery >", value, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_summery >=", value, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryLessThan(Integer value) {
            addCriterion("article_summery <", value, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryLessThanOrEqualTo(Integer value) {
            addCriterion("article_summery <=", value, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryIn(List<Integer> values) {
            addCriterion("article_summery in", values, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryNotIn(List<Integer> values) {
            addCriterion("article_summery not in", values, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryBetween(Integer value1, Integer value2) {
            addCriterion("article_summery between", value1, value2, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleSummeryNotBetween(Integer value1, Integer value2) {
            addCriterion("article_summery not between", value1, value2, "articleSummery");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNull() {
            addCriterion("article_content is null");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNotNull() {
            addCriterion("article_content is not null");
            return (Criteria) this;
        }

        public Criteria andArticleContentEqualTo(String value) {
            addCriterion("article_content =", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotEqualTo(String value) {
            addCriterion("article_content <>", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThan(String value) {
            addCriterion("article_content >", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThanOrEqualTo(String value) {
            addCriterion("article_content >=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThan(String value) {
            addCriterion("article_content <", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThanOrEqualTo(String value) {
            addCriterion("article_content <=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLike(String value) {
            addCriterion("article_content like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotLike(String value) {
            addCriterion("article_content not like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentIn(List<String> values) {
            addCriterion("article_content in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotIn(List<String> values) {
            addCriterion("article_content not in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentBetween(String value1, String value2) {
            addCriterion("article_content between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotBetween(String value1, String value2) {
            addCriterion("article_content not between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentIsNull() {
            addCriterion("article_htmlContent is null");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentIsNotNull() {
            addCriterion("article_htmlContent is not null");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentEqualTo(String value) {
            addCriterion("article_htmlContent =", value, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentNotEqualTo(String value) {
            addCriterion("article_htmlContent <>", value, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentGreaterThan(String value) {
            addCriterion("article_htmlContent >", value, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentGreaterThanOrEqualTo(String value) {
            addCriterion("article_htmlContent >=", value, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentLessThan(String value) {
            addCriterion("article_htmlContent <", value, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentLessThanOrEqualTo(String value) {
            addCriterion("article_htmlContent <=", value, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentLike(String value) {
            addCriterion("article_htmlContent like", value, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentNotLike(String value) {
            addCriterion("article_htmlContent not like", value, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentIn(List<String> values) {
            addCriterion("article_htmlContent in", values, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentNotIn(List<String> values) {
            addCriterion("article_htmlContent not in", values, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentBetween(String value1, String value2) {
            addCriterion("article_htmlContent between", value1, value2, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleHtmlcontentNotBetween(String value1, String value2) {
            addCriterion("article_htmlContent not between", value1, value2, "articleHtmlcontent");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNull() {
            addCriterion("article_url is null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNotNull() {
            addCriterion("article_url is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlEqualTo(String value) {
            addCriterion("article_url =", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotEqualTo(String value) {
            addCriterion("article_url <>", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThan(String value) {
            addCriterion("article_url >", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("article_url >=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThan(String value) {
            addCriterion("article_url <", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThanOrEqualTo(String value) {
            addCriterion("article_url <=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLike(String value) {
            addCriterion("article_url like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotLike(String value) {
            addCriterion("article_url not like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIn(List<String> values) {
            addCriterion("article_url in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotIn(List<String> values) {
            addCriterion("article_url not in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlBetween(String value1, String value2) {
            addCriterion("article_url between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotBetween(String value1, String value2) {
            addCriterion("article_url not between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleReadingIsNull() {
            addCriterion("article_reading is null");
            return (Criteria) this;
        }

        public Criteria andArticleReadingIsNotNull() {
            addCriterion("article_reading is not null");
            return (Criteria) this;
        }

        public Criteria andArticleReadingEqualTo(Integer value) {
            addCriterion("article_reading =", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingNotEqualTo(Integer value) {
            addCriterion("article_reading <>", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingGreaterThan(Integer value) {
            addCriterion("article_reading >", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_reading >=", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingLessThan(Integer value) {
            addCriterion("article_reading <", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingLessThanOrEqualTo(Integer value) {
            addCriterion("article_reading <=", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingIn(List<Integer> values) {
            addCriterion("article_reading in", values, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingNotIn(List<Integer> values) {
            addCriterion("article_reading not in", values, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingBetween(Integer value1, Integer value2) {
            addCriterion("article_reading between", value1, value2, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingNotBetween(Integer value1, Integer value2) {
            addCriterion("article_reading not between", value1, value2, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountIsNull() {
            addCriterion("article_commentscount is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountIsNotNull() {
            addCriterion("article_commentscount is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountEqualTo(Integer value) {
            addCriterion("article_commentscount =", value, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountNotEqualTo(Integer value) {
            addCriterion("article_commentscount <>", value, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountGreaterThan(Integer value) {
            addCriterion("article_commentscount >", value, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_commentscount >=", value, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountLessThan(Integer value) {
            addCriterion("article_commentscount <", value, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountLessThanOrEqualTo(Integer value) {
            addCriterion("article_commentscount <=", value, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountIn(List<Integer> values) {
            addCriterion("article_commentscount in", values, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountNotIn(List<Integer> values) {
            addCriterion("article_commentscount not in", values, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountBetween(Integer value1, Integer value2) {
            addCriterion("article_commentscount between", value1, value2, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentscountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_commentscount not between", value1, value2, "articleCommentscount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountIsNull() {
            addCriterion("article_likescount is null");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountIsNotNull() {
            addCriterion("article_likescount is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountEqualTo(Integer value) {
            addCriterion("article_likescount =", value, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountNotEqualTo(Integer value) {
            addCriterion("article_likescount <>", value, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountGreaterThan(Integer value) {
            addCriterion("article_likescount >", value, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_likescount >=", value, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountLessThan(Integer value) {
            addCriterion("article_likescount <", value, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountLessThanOrEqualTo(Integer value) {
            addCriterion("article_likescount <=", value, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountIn(List<Integer> values) {
            addCriterion("article_likescount in", values, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountNotIn(List<Integer> values) {
            addCriterion("article_likescount not in", values, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountBetween(Integer value1, Integer value2) {
            addCriterion("article_likescount between", value1, value2, "articleLikescount");
            return (Criteria) this;
        }

        public Criteria andArticleLikescountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_likescount not between", value1, value2, "articleLikescount");
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