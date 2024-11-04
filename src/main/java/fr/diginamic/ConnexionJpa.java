package fr.diginamic;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;

import java.util.Map;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();
        System.out.println(em);
        em.close();
        emf.close();
    }




}
