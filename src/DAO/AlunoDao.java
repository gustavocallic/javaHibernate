/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Gustavo
 */
public class AlunoDao {
    EntityManagerFactory emf;
    EntityManager em;
    
    public AlunoDao(){
        emf = Persistence.createEntityManagerFactory("tcc");
        em = emf.createEntityManager();
    }
    public void Salvar(Aluno aln){
        em.getTransaction().begin();//inicia transação no banco
        em.merge(aln);//salva objeto no banco
        em.getTransaction().commit();
        emf.close();
    }
    
    public void Remover(int id){
        em.getTransaction().begin();//inicia transação no banco
        Query q = em.createNamedQuery("delete aluno from aluno where matricula = "+ id );
        em.getTransaction().commit();
        emf.close();
    }
    
}
