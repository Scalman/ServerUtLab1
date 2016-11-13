package UI;

import BO.UserManager;
import UI.ViewModels.UserViewModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Marthin on 2016-11-11.
 */
@ManagedBean(name="userBean")
@SessionScoped
public class UserBean {
    private UserViewModel user;
    private UserManager userManager;
    public UserBean() {
        this.user = new UserViewModel();
        userManager = new UserManager();
    }

    public UserViewModel getUser() {
        return this.user;
    }
    public void setUser(UserViewModel user) {
        this.user = user;
    }

    public void register(){
        userManager.register(this.user);
    }
}
