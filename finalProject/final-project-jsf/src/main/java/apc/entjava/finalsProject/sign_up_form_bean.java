package apc.entjava.finalsProject;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@Named
public class sign_up_form_bean implements Serializable {

    @EJB
    private user_CatalogLocal user_catalogLocalBean;

    private List<signup_users> users = new ArrayList<>();

    private signup_users user = new signup_users();


    public String addUser(){
        long userId = this.user_catalogLocalBean.getUsers().size()+ 1;

        this.user_catalogLocalBean.addUser(new signup_users(this.user.getFirstname(), this.user.getLastname(), this.user.getMobile_number(),
                this.user.getPassword(), this.user.getEmail()) );

        this.user_catalogLocalBean.getUsers().stream().forEach(user ->{
            System.out.println(user.toString());
        });
        return "signup_success?faces-redirect=true";
    }
    public void init(){
        this.users = this.user_catalogLocalBean.getUsers();
    }

    public signup_users getUser() {
        return user;
    }

    public void setUser(signup_users user) {
        this.user = user;
    }

    public List<signup_users> getUsers() {
        return users;
    }

}
