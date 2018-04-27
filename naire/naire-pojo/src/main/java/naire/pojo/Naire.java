package naire.pojo;

public class Naire {
    private Integer naireid;

    private Integer sex;

    private Integer grade;

    private Integer times;

    private Integer relax;

    private String attract;

    private Integer hours;

    private Integer pressure;

    private Integer vent;

    private Integer confidence;

    private Integer lonely;

    private Integer forecast;

    private String stop;

    public Integer getNaireid() {
        return naireid;
    }

    public void setNaireid(Integer naireid) {
        this.naireid = naireid;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getRelax() {
        return relax;
    }

    public void setRelax(Integer relax) {
        this.relax = relax;
    }

    public String getAttract() {
        return attract;
    }

    public void setAttract(String attract) {
        this.attract = attract == null ? null : attract.trim();
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getVent() {
        return vent;
    }

    public void setVent(Integer vent) {
        this.vent = vent;
    }

    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public Integer getLonely() {
        return lonely;
    }

    public void setLonely(Integer lonely) {
        this.lonely = lonely;
    }

    public Integer getForecast() {
        return forecast;
    }

    public void setForecast(Integer forecast) {
        this.forecast = forecast;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop == null ? null : stop.trim();
    }
}