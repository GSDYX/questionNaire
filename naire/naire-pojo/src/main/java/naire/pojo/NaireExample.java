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

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
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

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRelaxEqualTo(Integer value) {
            addCriterion("relax =", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxNotEqualTo(Integer value) {
            addCriterion("relax <>", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxGreaterThan(Integer value) {
            addCriterion("relax >", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("relax >=", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxLessThan(Integer value) {
            addCriterion("relax <", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxLessThanOrEqualTo(Integer value) {
            addCriterion("relax <=", value, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxIn(List<Integer> values) {
            addCriterion("relax in", values, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxNotIn(List<Integer> values) {
            addCriterion("relax not in", values, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxBetween(Integer value1, Integer value2) {
            addCriterion("relax between", value1, value2, "relax");
            return (Criteria) this;
        }

        public Criteria andRelaxNotBetween(Integer value1, Integer value2) {
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

        public Criteria andAttractEqualTo(String value) {
            addCriterion("attract =", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractNotEqualTo(String value) {
            addCriterion("attract <>", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractGreaterThan(String value) {
            addCriterion("attract >", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractGreaterThanOrEqualTo(String value) {
            addCriterion("attract >=", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractLessThan(String value) {
            addCriterion("attract <", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractLessThanOrEqualTo(String value) {
            addCriterion("attract <=", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractLike(String value) {
            addCriterion("attract like", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractNotLike(String value) {
            addCriterion("attract not like", value, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractIn(List<String> values) {
            addCriterion("attract in", values, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractNotIn(List<String> values) {
            addCriterion("attract not in", values, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractBetween(String value1, String value2) {
            addCriterion("attract between", value1, value2, "attract");
            return (Criteria) this;
        }

        public Criteria andAttractNotBetween(String value1, String value2) {
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

        public Criteria andHoursEqualTo(Integer value) {
            addCriterion("hours =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(Integer value) {
            addCriterion("hours <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(Integer value) {
            addCriterion("hours >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("hours >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(Integer value) {
            addCriterion("hours <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(Integer value) {
            addCriterion("hours <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<Integer> values) {
            addCriterion("hours in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<Integer> values) {
            addCriterion("hours not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(Integer value1, Integer value2) {
            addCriterion("hours between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPressureEqualTo(Integer value) {
            addCriterion("pressure =", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotEqualTo(Integer value) {
            addCriterion("pressure <>", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThan(Integer value) {
            addCriterion("pressure >", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThanOrEqualTo(Integer value) {
            addCriterion("pressure >=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThan(Integer value) {
            addCriterion("pressure <", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThanOrEqualTo(Integer value) {
            addCriterion("pressure <=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureIn(List<Integer> values) {
            addCriterion("pressure in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotIn(List<Integer> values) {
            addCriterion("pressure not in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureBetween(Integer value1, Integer value2) {
            addCriterion("pressure between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotBetween(Integer value1, Integer value2) {
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

        public Criteria andVentEqualTo(Integer value) {
            addCriterion("vent =", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotEqualTo(Integer value) {
            addCriterion("vent <>", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentGreaterThan(Integer value) {
            addCriterion("vent >", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentGreaterThanOrEqualTo(Integer value) {
            addCriterion("vent >=", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentLessThan(Integer value) {
            addCriterion("vent <", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentLessThanOrEqualTo(Integer value) {
            addCriterion("vent <=", value, "vent");
            return (Criteria) this;
        }

        public Criteria andVentIn(List<Integer> values) {
            addCriterion("vent in", values, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotIn(List<Integer> values) {
            addCriterion("vent not in", values, "vent");
            return (Criteria) this;
        }

        public Criteria andVentBetween(Integer value1, Integer value2) {
            addCriterion("vent between", value1, value2, "vent");
            return (Criteria) this;
        }

        public Criteria andVentNotBetween(Integer value1, Integer value2) {
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

        public Criteria andConfidenceEqualTo(Integer value) {
            addCriterion("confidence =", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotEqualTo(Integer value) {
            addCriterion("confidence <>", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceGreaterThan(Integer value) {
            addCriterion("confidence >", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("confidence >=", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceLessThan(Integer value) {
            addCriterion("confidence <", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceLessThanOrEqualTo(Integer value) {
            addCriterion("confidence <=", value, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceIn(List<Integer> values) {
            addCriterion("confidence in", values, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotIn(List<Integer> values) {
            addCriterion("confidence not in", values, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceBetween(Integer value1, Integer value2) {
            addCriterion("confidence between", value1, value2, "confidence");
            return (Criteria) this;
        }

        public Criteria andConfidenceNotBetween(Integer value1, Integer value2) {
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

        public Criteria andLonelyEqualTo(Integer value) {
            addCriterion("lonely =", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyNotEqualTo(Integer value) {
            addCriterion("lonely <>", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyGreaterThan(Integer value) {
            addCriterion("lonely >", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyGreaterThanOrEqualTo(Integer value) {
            addCriterion("lonely >=", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyLessThan(Integer value) {
            addCriterion("lonely <", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyLessThanOrEqualTo(Integer value) {
            addCriterion("lonely <=", value, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyIn(List<Integer> values) {
            addCriterion("lonely in", values, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyNotIn(List<Integer> values) {
            addCriterion("lonely not in", values, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyBetween(Integer value1, Integer value2) {
            addCriterion("lonely between", value1, value2, "lonely");
            return (Criteria) this;
        }

        public Criteria andLonelyNotBetween(Integer value1, Integer value2) {
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

        public Criteria andForecastEqualTo(Integer value) {
            addCriterion("forecast =", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastNotEqualTo(Integer value) {
            addCriterion("forecast <>", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastGreaterThan(Integer value) {
            addCriterion("forecast >", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastGreaterThanOrEqualTo(Integer value) {
            addCriterion("forecast >=", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastLessThan(Integer value) {
            addCriterion("forecast <", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastLessThanOrEqualTo(Integer value) {
            addCriterion("forecast <=", value, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastIn(List<Integer> values) {
            addCriterion("forecast in", values, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastNotIn(List<Integer> values) {
            addCriterion("forecast not in", values, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastBetween(Integer value1, Integer value2) {
            addCriterion("forecast between", value1, value2, "forecast");
            return (Criteria) this;
        }

        public Criteria andForecastNotBetween(Integer value1, Integer value2) {
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

        public Criteria andStopEqualTo(String value) {
            addCriterion("stop =", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotEqualTo(String value) {
            addCriterion("stop <>", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThan(String value) {
            addCriterion("stop >", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThanOrEqualTo(String value) {
            addCriterion("stop >=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThan(String value) {
            addCriterion("stop <", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThanOrEqualTo(String value) {
            addCriterion("stop <=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLike(String value) {
            addCriterion("stop like", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotLike(String value) {
            addCriterion("stop not like", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopIn(List<String> values) {
            addCriterion("stop in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotIn(List<String> values) {
            addCriterion("stop not in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopBetween(String value1, String value2) {
            addCriterion("stop between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotBetween(String value1, String value2) {
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