package user.pojo;

import naire.pojo.Naire;

import java.util.List;

public class UserCustom {
    private List<Naire> naires;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Naire> getNaires() {
        return naires;
    }

    public void setNaires(List<Naire> naires) {
        this.naires = naires;
    }
}
