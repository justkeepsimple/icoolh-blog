package m.icoolh.blog.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticleMetaExample {
    /**
     * t_blog_article_meta
     */
    protected String orderByClause;

    /**
     * t_blog_article_meta
     */
    protected boolean distinct;

    /**
     * t_blog_article_meta
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public ArticleMetaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * t_blog_article_meta null
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

        public Criteria andArtIdIsNull() {
            addCriterion("art_id is null");
            return (Criteria) this;
        }

        public Criteria andArtIdIsNotNull() {
            addCriterion("art_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtIdEqualTo(Long value) {
            addCriterion("art_id =", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotEqualTo(Long value) {
            addCriterion("art_id <>", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThan(Long value) {
            addCriterion("art_id >", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("art_id >=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThan(Long value) {
            addCriterion("art_id <", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThanOrEqualTo(Long value) {
            addCriterion("art_id <=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdIn(List<Long> values) {
            addCriterion("art_id in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotIn(List<Long> values) {
            addCriterion("art_id not in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdBetween(Long value1, Long value2) {
            addCriterion("art_id between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotBetween(Long value1, Long value2) {
            addCriterion("art_id not between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andLikesIsNull() {
            addCriterion("likes_ is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes_ is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Integer value) {
            addCriterion("likes_ =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Integer value) {
            addCriterion("likes_ <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Integer value) {
            addCriterion("likes_ >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes_ >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Integer value) {
            addCriterion("likes_ <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Integer value) {
            addCriterion("likes_ <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Integer> values) {
            addCriterion("likes_ in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Integer> values) {
            addCriterion("likes_ not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Integer value1, Integer value2) {
            addCriterion("likes_ between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("likes_ not between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views_ is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views_ is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views_ =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views_ <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views_ >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views_ >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views_ <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views_ <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views_ in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views_ not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views_ between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views_ not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments_ is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments_ is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(Integer value) {
            addCriterion("comments_ =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(Integer value) {
            addCriterion("comments_ <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(Integer value) {
            addCriterion("comments_ >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_ >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(Integer value) {
            addCriterion("comments_ <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(Integer value) {
            addCriterion("comments_ <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<Integer> values) {
            addCriterion("comments_ in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<Integer> values) {
            addCriterion("comments_ not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(Integer value1, Integer value2) {
            addCriterion("comments_ between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_ not between", value1, value2, "comments");
            return (Criteria) this;
        }
    }

    /**
     * t_blog_article_meta
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * t_blog_article_meta null
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