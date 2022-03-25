package controlador;


import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JugadorJpaController implements Serializable {

    public JugadorJpaController() {
        this.emf = Persistence.createEntityManagerFactory("prueba_sofkaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
