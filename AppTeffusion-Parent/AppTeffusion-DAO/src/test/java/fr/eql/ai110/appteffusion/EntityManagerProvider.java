package fr.eql.ai110.appteffusion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EntityManagerProvider {
	 
    private EntityManager em;
    private EntityTransaction tx;
 
    private EntityManagerProvider(String unitName) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(unitName);
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }
 
    public static EntityManagerProvider withUnit(String unitName) {
        return new EntityManagerProvider(unitName);
    }
 
    public void begin() {
        this.tx.begin();
    }
 
    public void commit() {
        this.tx.commit();
    }
 
    public EntityTransaction tx() {
        return this.tx;
    }
 
    public EntityManager em() {
        return this.em;
    }

//	@Override
//	public org.junit.runners.model.Statement apply(org.junit.runners.model.Statement base,
//	        return new org.junit.runners.model.Statement() {
//			 
//			            @Override
//			            public void evaluate() throws Throwable {
//			                base.evaluate();
//			                em.clear();
//			            }
//			 
//			        };
//		return null;
//	}
 
   
//    public Statement apply(Statement base, Description description) {
//        return new Statement() {
// 
//            @Override
//            public void evaluate() throws Throwable {
//                base.evaluate();
//                em.clear();
//            }
// 
//        };
//    }
 
}
