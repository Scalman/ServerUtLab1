package DB.DAL;

import DB.Entities.UserEntity;
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
    private UserEntity user;

    public UserDb() {
        entityManagerFactory = Persistence.createEntityManagerFactory("test");

    }

    public void register(UserViewModel user){
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        this.user = new UserEntity();
        this.user.setUsername(user.getUsername());
        this.user.setPassword(user.getPassword());
        System.out.println(this.user.getPassword() + this.user.getUsername());
        entityManager.persist(this.user);
        entityManager.getTransaction().commit();
        entityManager.close();
        //entityManagerFactory.close();
    }
}
