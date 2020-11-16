package apc.entjava.finalsProject;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Singleton
@LocalBean
public class user_Catalog implements user_CatalogLocal {

//    private List<signup_users> users = new ArrayList<>();
    @PersistenceContext
    private EntityManager entityManager;

    public user_Catalog() {

    }

    @Override
    public List<signup_users> getUsers() {
        return this.entityManager.createQuery("select c from signup_users c", signup_users.class).getResultList();
    }

    @Override
    public void addUser(signup_users user) {this.entityManager.persist(user);}

    @Override
    public signup_users findUser(Long userId) {
        return this.entityManager.find(signup_users.class, userId);
    }

    @Override
    public void deleteUser(signup_users user) {
        this.entityManager.remove(this.entityManager.contains(user) ? user:this.entityManager.merge(user));
    }

    @Override
    public List<signup_users> searchByName(String name) {
        return this.entityManager.createQuery("select c from signup_users c"+
                " where c.firstname like :name", signup_users.class).setParameter("name", "%" + name +"%").getResultList();
    }
}