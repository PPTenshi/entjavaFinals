package apc.entjava.finalsProject;

import javax.ejb.Local;
import java.util.List;

@Local
public interface user_CatalogLocal {

    public List<signup_users> getUsers();

    public void addUser(signup_users item);

    public signup_users findUser(Long userId);

    public void deleteUser(signup_users user);

    public List<signup_users> searchByName(String name);
}
