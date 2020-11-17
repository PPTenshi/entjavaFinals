package apc.entjava.finalsProject;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Named
@ConversationScoped
public class sign_up_delete_bean implements Serializable {

    private Long userId;

    private signup_users user;

    @Inject
    private sign_up_form_bean signUpFormBean;


    public void fetchUser() {
        List<signup_users> users = this.signUpFormBean.getUsers().stream().filter(i -> {
            return i.getUserId() == userId;
        }).collect(Collectors.toList());

        if (users.isEmpty()) {
            this.user = null;
        } else {
            this.user = users.get(0);
        }

    }

    public String removeUser(){
        this.signUpFormBean.getUsers().removeIf(user ->{
            return user.getUserId().equals(this.userId);
        });
        return "signup_success?faces-redirect=true";
    }

//    @Inject
//    private user_Catalog UserCatalog;
//
//    @Inject
//    private Conversation conversation;
//
//    public void fetchUser(){
//        conversation.begin();
//        this.user = UserCatalog.findUser(this.userId);
//    }
//
//    public String removeUser(){
//        this.UserCatalog.deleteUser(this.user);
//        conversation.end();
//        return "signup_success?faces-redirect=true";
//    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public signup_users getUser() {
        return user;
    }

    public void setUser(signup_users user) {
        this.user = user;
    }

    public sign_up_form_bean getSignUpFormBean() {
        return signUpFormBean;
    }

    public void setSignUpFormBean(sign_up_form_bean signUpFormBean) {
        this.signUpFormBean = signUpFormBean;
    }
}
