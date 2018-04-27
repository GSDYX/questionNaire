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
            addCriterion("naireid is null");
            return (Criteria) this;
        }

        public Criteria andNaireidIsNotNull() {
            addCriterion("naireid is not null");
            return (Criteria) this;
        }

        public Criteria andNaireidEqualTo(Integer value) {
            addCriterion("naireid =", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidNotEqualTo(Integer value) {
            addCriterion("naireid <>", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidGreaterThan(Integer value) {
            addCriterion("naireid >", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidGreaterThanOrEqualTo(Integer value) {
            addCriterion("naireid >=", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidLessThan(Integer value) {
            addCriterion("naireid <", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidLessThanOrEqualTo(Integer value) {
            addCriterion("naireid <=", value, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidIn(List<Integer> values) {
            addCriterion("naireid in", values, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidNotIn(List<Integer> values) {
            addCriterion("naireid not in", values, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidBetween(Integer value1, Integer value2) {
            addCriterion("naireid between", value1, value2, "naireid");
            return (Criteria) this;
        }

        public Criteria andNaireidNotBetween(Integer value1, Integer value2) {
            addCriterion("naireid not between", value1, value2, "naireid");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Boolean value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Boolean value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Boolean value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Boolean value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Boolean value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Boolean> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Boolean> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Boolean value1, Boolean value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Boolean value) {
            addCriterion("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Boolean value) {
            addCriterion("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Boolean value) {
            addCriterion("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Boolean value) {
            addCriterion("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Boolean value) {
            addCriterion("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Boolean> values) {
            addCriterion("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Boolean> values) {
            addCriterion("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Boolean value1, Boolean value2) {
            addCriterion("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andRelaxIsNull() {
            addCriterion("relax is null");
            return (Criteria) this;
        }

        public Criteria andRelaxIsNotNull() {
            addCriterion("relax is not null");
            return (Criteria) this;
        }

        public Criteria andRelaxEqualTo(Boolean value) {
            addCriterion("relax =", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxNotEqualTo(Boolean value) {
            addCriterion("relax <>", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxGreaterThan(Boolean value) {
            addCriterion("relax >", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxGreaterThanOrEqualTo(Boolean value) {
            addCriterion("relax >=", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxLessThan(Boolean value) {
            addCriterion("relax <", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxLessThanOrEqualTo(Boolean value) {
            addCriterion("relax <=", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxIn(List<Boolean> values) {
            addCriterion("relax in", values, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxNotIn(List<Boolean> values) {
            addCriterion("relax not in", values, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxBetween(Boolean value1, Boolean value2) {
            addCriterion("relax between", value1, value2, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxNotBetween(Boolean value1, Boolean value2) {
            addCriterion("relax not between", value1, value2, "relax");
            return (Criteria) this;
        }

        public Criteria andAttractIsNull() {
            addCriterion("attract is null");
            return (Criteria) this;
        }

        public Criteria andAttractIsNotNull() {
            addCriterion("attract is not null");
            return (Criteria) this;
        }

        public Criteria andAttractEqualTo(Integer value) {
            addCriterion("attract =", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractNotEqualTo(Integer value) {
            addCriterion("attract <>", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractGreaterThan(Integer value) {
            addCriterion("attract >", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractGreaterThanOrEqualTo(Integer value) {
            addCriterion("attract >=", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractLessThan(Integer value) {
            addCriterion("attract <", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractLessThanOrEqualTo(Integer value) {
            addCriterion("attract <=", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractIn(List<Integer> values) {
            addCriterion("attract in", values, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractNotIn(List<Integer> values) {
            addCriterion("attract not in", values, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractBetween(Integer value1, Integer value2) {
            addCriterion("attract between", value1, value2, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractNotBetween(Integer value1, Integer value2) {
            addCriterion("attract not between", value1, value2, "attract");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("hours is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("hours is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(Boolean value) {
            addCriterion("hours =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(Boolean value) {
            addCriterion("hours <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(Boolean value) {
            addCriterion("hours >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hours >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(Boolean value) {
            addCriterion("hours <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(Boolean value) {
            addCriterion("hours <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<Boolean> values) {
            addCriterion("hours in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<Boolean> values) {
            addCriterion("hours not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(Boolean value1, Boolean value2) {
            addCriterion("hours between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hours not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andPressureIsNull() {
            addCriterion("pressure is null");
            return (Criteria) this;
        }

        public Criteria andPressureIsNotNull() {
            addCriterion("pressure is not null");
            return (Criteria) this;
        }

        public Criteria andPressureEqualTo(Boolean value) {
            addCriterion("pressure =", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotEqualTo(Boolean value) {
            addCriterion("pressure <>", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThan(Boolean value) {
            addCriterion("pressure >", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pressure >=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThan(Boolean value) {
            addCriterion("pressure <", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThanOrEqualTo(Boolean value) {
            addCriterion("pressure <=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureIn(List<Boolean> values) {
            addCriterion("pressure in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotIn(List<Boolean> values) {
            addCriterion("pressure not in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureBetween(Boolean value1, Boolean value2) {
            addCriterion("pressure between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pressure not between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andVentIsNull() {
            addCriterion("vent is null");
            return (Criteria) this;
        }

        public Criteria andVentIsNotNull() {
            addCriterion("vent is not null");
            return (Criteria) this;
        }

        public Criteria andVentEqualTo(Boolean value) {
            addCriterion("vent =", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotEqualTo(Boolean value) {
            addCriterion("vent <>", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentGreaterThan(Boolean value) {
            addCriterion("vent >", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("vent >=", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentLessThan(Boolean value) {
            addCriterion("vent <", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentLessThanOrEqualTo(Boolean value) {
            addCriterion("vent <=", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentIn(List<Boolean> values) {
            addCriterion("vent in", values, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotIn(List<Boolean> values) {
            addCriterion("vent not in", values, "vent");
            return (Criteria) this;
        }

        public Criteria andVentBetween(Boolean value1, Boolean value2) {
            addCriterion("vent between", value1, value2, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("vent not between", value1, value2, "vent");
            return (Criteria) this;
        }

        public Criteria andConfidenceIsNull() {
            addCriterion("confidence is null");
            return (Criteria) this;
        }

        public Criteria andConfidenceIsNotNull() {
            addCriterion("confidence is not null");
            return (Criteria) this;
        }

        public Criteria andConfidenceEqualTo(Boolean value) {
            addCriterion("confidence =", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotEqualTo(Boolean value) {
            addCriterion("confidence <>", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceGreaterThan(Boolean value) {
            addCriterion("confidence >", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("confidence >=", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceLessThan(Boolean value) {
            addCriterion("confidence <", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceLessThanOrEqualTo(Boolean value) {
            addCriterion("confidence <=", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceIn(List<Boolean> values) {
            addCriterion("confidence in", values, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotIn(List<Boolean> values) {
            addCriterion("confidence not in", values, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceBetween(Boolean value1, Boolean value2) {
            addCriterion("confidence between", value1, value2, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("confidence not between", value1, value2, "confidence");
            return (Criteria) this;
        }

        public Criteria andLonelyIsNull() {
            addCriterion("lonely is null");
            return (Criteria) this;
        }

        public Criteria andLonelyIsNotNull() {
            addCriterion("lonely is not null");
            return (Criteria) this;
        }

        public Criteria andLonelyEqualTo(Boolean value) {
            addCriterion("lonely =", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyNotEqualTo(Boolean value) {
            addCriterion("lonely <>", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyGreaterThan(Boolean value) {
            addCriterion("lonely >", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lonely >=", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyLessThan(Boolean value) {
            addCriterion("lonely <", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyLessThanOrEqualTo(Boolean value) {
            addCriterion("lonely <=", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyIn(List<Boolean> values) {
            addCriterion("lonely in", values, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyNotIn(List<Boolean> values) {
            addCriterion("lonely not in", values, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyBetween(Boolean value1, Boolean value2) {
            addCriterion("lonely between", value1, value2, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lonely not between", value1, value2, "lonely");
            return (Criteria) this;
        }

        public Criteria andForecastIsNull() {
            addCriterion("forecast is null");
            return (Criteria) this;
        }

        public Criteria andForecastIsNotNull() {
            addCriterion("forecast is not null");
            return (Criteria) this;
        }

        public Criteria andForecastEqualTo(Boolean value) {
            addCriterion("forecast =", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastNotEqualTo(Boolean value) {
            addCriterion("forecast <>", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastGreaterThan(Boolean value) {
            addCriterion("forecast >", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastGreaterThanOrEqualTo(Boolean value) {
            addCriterion("forecast >=", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastLessThan(Boolean value) {
            addCriterion("forecast <", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastLessThanOrEqualTo(Boolean value) {
            addCriterion("forecast <=", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastIn(List<Boolean> values) {
            addCriterion("forecast in", values, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastNotIn(List<Boolean> values) {
            addCriterion("forecast not in", values, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastBetween(Boolean value1, Boolean value2) {
            addCriterion("forecast between", value1, value2, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastNotBetween(Boolean value1, Boolean value2) {
            addCriterion("forecast not between", value1, value2, "forecast");
            return (Criteria) this;
        }

        public Criteria andStopIsNull() {
            addCriterion("stop is null");
            return (Criteria) this;
        }

        public Criteria andStopIsNotNull() {
            addCriterion("stop is not null");
            return (Criteria) this;
        }

        public Criteria andStopEqualTo(Integer value) {
            addCriterion("stop =", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotEqualTo(Integer value) {
            addCriterion("stop <>", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThan(Integer value) {
            addCriterion("stop >", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop >=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThan(Integer value) {
            addCriterion("stop <", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThanOrEqualTo(Integer value) {
            addCriterion("stop <=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopIn(List<Integer> values) {
            addCriterion("stop in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotIn(List<Integer> values) {
            addCriterion("stop not in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopBetween(Integer value1, Integer value2) {
            addCriterion("stop between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotBetween(Integer value1, Integer value2) {
            addCriterion("stop not between", value1, value2, "stop");
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