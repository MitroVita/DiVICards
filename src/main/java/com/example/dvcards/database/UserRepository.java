package com.example.dvcards.database;

import com.example.dvcards.exeption.UserException;
import com.example.dvcards.model.AuthorizationRequest;
import com.example.dvcards.model.UserInfo;
import com.example.dvcards.model.table.Users;
import jakarta.persistence.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_catalog");
    @PersistenceContext
    private EntityManager em = emf.createEntityManager();

    public UserInfo authorization(AuthorizationRequest authReq) throws UserException {
        em.getTransaction().begin();
        List<Long> cnt = em.createQuery("""
                SELECT COUNT(*) 
                FROM Users 
                WHERE Login = :login
                """).setParameter("login", authReq.login()).getResultList();
        System.out.print(cnt);
        if (cnt.get(0) == 1L) {
            throw new UserException("This login already used");
        }
        UUID uuid = UUID.randomUUID();
        Users user = new Users();
        user.setId(uuid.toString());
        user.setLogin(authReq.login());
        user.setPassword(authReq.password());
        em.persist(user);
        em.getTransaction().commit();
        return new UserInfo(uuid);
    }
}
