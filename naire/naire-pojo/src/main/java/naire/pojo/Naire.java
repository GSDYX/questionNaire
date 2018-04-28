package naire.pojo;

public class Naire {
    private Integer naireid;

    private String nairename;

    private String naireadderss;

    public Integer getNaireid() {
        return naireid;
    }

    public void setNaireid(Integer naireid) {
        this.naireid = naireid;
    }

    public String getNairename() {
        return nairename;
    }

    public void setNairename(String nairename) {
        this.nairename = nairename == null ? null : nairename.trim();
    }

    public String getNaireadderss() {
        return naireadderss;
    }

    public void setNaireadderss(String naireadderss) {
        this.naireadderss = naireadderss == null ? null : naireadderss.trim();
    }
}