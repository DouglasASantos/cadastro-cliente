package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJPA {

	 private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("cadastro-cliente-jpa");
	 
	 public static EntityManager getEntityManager() {
		 return FACTORY.createEntityManager();
	 }
}
