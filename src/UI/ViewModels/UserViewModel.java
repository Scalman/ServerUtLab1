package UI.ViewModels;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

/**
 * Created by Marthin on 2016-11-07.
 */
@ManagedBean(name="userViewModel")
@SessionScoped
public class UserViewModel {
    private String username;
    private String password;

    public UserViewModel() {

    }

    public UserViewModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [ username=" + username + "]";
    }
}
