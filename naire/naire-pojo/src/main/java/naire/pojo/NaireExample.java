package naire.pojo;

import java.util.ArrayList;
import java.util.List;

public class NaireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NaireExample() {
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

        public Criteria andNaireidIsNull() {
            addCriterion("naireId is null");
            return (Criteria) this;
        }

        public Criteria andNaireidIsNotNull() {
            addCriterion("naireId is not null");
            return (Criteria) this;
        }

        public Criteria andNaireidEqualTo(Integer value) {
            addCriterion("naireId =", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidNotEqualTo(Integer value) {
            addCriterion("naireId <>", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidGreaterThan(Integer value) {
            addCriterion("naireId >", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidGreaterThanOrEqualTo(Integer value) {
            addCriterion("naireId >=", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidLessThan(Integer value) {
            addCriterion("naireId <", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidLessThanOrEqualTo(Integer value) {
            addCriterion("naireId <=", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidIn(List<Integer> values) {
            addCriterion("naireId in", values, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidNotIn(List<Integer> values) {
            addCriterion("naireId not in", values, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidBetween(Integer value1, Integer value2) {
            addCriterion("naireId between", value1, value2, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidNotBetween(Integer value1, Integer value2) {
            addCriterion("naireId not between", value1, value2, "naireid");
            return (Criteria) this;
        }

        public Criteria andNairenameIsNull() {
            addCriterion("naireName is null");
            return (Criteria) this;
        }

        public Criteria andNairenameIsNotNull() {
            addCriterion("naireName is not null");
            return (Criteria) this;
        }

        public Criteria andNairenameEqualTo(String value) {
            addCriterion("naireName =", value, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameNotEqualTo(String value) {
            addCriterion("naireName <>", value, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameGreaterThan(String value) {
            addCriterion("naireName >", value, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameGreaterThanOrEqualTo(String value) {
            addCriterion("naireName >=", value, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameLessThan(String value) {
            addCriterion("naireName <", value, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameLessThanOrEqualTo(String value) {
            addCriterion("naireName <=", value, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameLike(String value) {
            addCriterion("naireName like", value, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameNotLike(String value) {
            addCriterion("naireName not like", value, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameIn(List<String> values) {
            addCriterion("naireName in", values, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameNotIn(List<String> values) {
            addCriterion("naireName not in", values, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameBetween(String value1, String value2) {
            addCriterion("naireName between", value1, value2, "nairename");
            return (Criteria) this;
        }

        public Criteria andNairenameNotBetween(String value1, String value2) {
            addCriterion("naireName not between", value1, value2, "nairename");
            return (Criteria) this;
        }

        public Criteria andNaireadderssIsNull() {
            addCriterion("naireAdderss is null");
            return (Criteria) this;
        }

        public Criteria andNaireadderssIsNotNull() {
            addCriterion("naireAdderss is not null");
            return (Criteria) this;
        }

        public Criteria andNaireadderssEqualTo(String value) {
            addCriterion("naireAdderss =", value, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssNotEqualTo(String value) {
            addCriterion("naireAdderss <>", value, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssGreaterThan(String value) {
            addCriterion("naireAdderss >", value, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssGreaterThanOrEqualTo(String value) {
            addCriterion("naireAdderss >=", value, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssLessThan(String value) {
            addCriterion("naireAdderss <", value, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssLessThanOrEqualTo(String value) {
            addCriterion("naireAdderss <=", value, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssLike(String value) {
            addCriterion("naireAdderss like", value, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssNotLike(String value) {
            addCriterion("naireAdderss not like", value, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssIn(List<String> values) {
            addCriterion("naireAdderss in", values, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssNotIn(List<String> values) {
            addCriterion("naireAdderss not in", values, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssBetween(String value1, String value2) {
            addCriterion("naireAdderss between", value1, value2, "naireadderss");
            return (Criteria) this;
        }

        public Criteria andNaireadderssNotBetween(String value1, String value2) {
            addCriterion("naireAdderss not between", value1, value2, "naireadderss");
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