/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincrm;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import quincrm.exceptions.NonexistentEntityException;

/**
 *
 * @author cuong
 */
public class UserDatJpaController implements Serializable {

    public UserDatJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(UserDat userDat) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(userDat);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(UserDat userDat) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            userDat = em.merge(userDat);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = userDat.getUserID();
                if (findUserDat(id) == null) {
                    throw new NonexistentEntityException("The userDat with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            UserDat userDat;
            try {
                userDat = em.getReference(UserDat.class, id);
                userDat.getUserID();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The userDat with id " + id + " no longer exists.", enfe);
            }
            em.remove(userDat);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<UserDat> findUserDatEntities() {
        return findUserDatEntities(true, -1, -1);
    }

    public List<UserDat> findUserDatEntities(int maxResults, int firstResult) {
        return findUserDatEntities(false, maxResults, firstResult);
    }

    private List<UserDat> findUserDatEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from UserDat as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public UserDat findUserDat(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UserDat.class, id);
        } finally {
            em.close();
        }
    }

    public int getUserDatCount() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select count(o) from UserDat as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
