package apc.entjava.finalsProject;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
@LocalBean
public class user_Catalog implements user_CatalogLocal {

    private List<signup_users> users = new ArrayList<>();

    public user_Catalog() {

    }

    @Override
    public List<signup_users> getUsers() {
        return this.users;
    }

    @Override
    public void addUser(signup_users user) {
        this.users.add(user);

    }
}