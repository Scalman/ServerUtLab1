package DB.DAL;

import DB.Entities.User;
import UI.ViewModels.UserViewModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Marthin on 2016-11-11.
 */
public class UserDb {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private User user;

    public UserDb() {
        entityManagerFactory = Persistence.createEntityManagerFactory("test");
    }

    public void register(UserViewModel user){
        this.user = new User();
        this.user.setUsername(user.getUsername());
        this.user.setPassword(user.getPassword());

        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(this.user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
