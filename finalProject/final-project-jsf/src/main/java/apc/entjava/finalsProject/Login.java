package apc.entjava.finalsProject;

import java.io.IOException;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class Login {

    private String email;
    private String password;


    public void login() {

        FacesContext context = FacesContext.getCurrentInstance();

        if(this.email.equals("admin") && this.password.equals("admin")){
            context.getExternalContext().getSessionMap().put("user", email);
            try {
                context.getExternalContext().redirect("main_page.xhtml");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else  {
            //Send an error message on Login Failure
            context.addMessage(null, new FacesMessage("Authentication Failed. Check username or password."));

        }
    }

    public void logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        try {
            context.getExternalContext().redirect("landing_page.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}