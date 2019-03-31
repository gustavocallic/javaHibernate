/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateteste;

import DAO.AlunoDao;
import Model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Aluno a1 = new Aluno();
        a1.setNome("gustavo");
        a1.setIdade(18);
        a1.setMatricula("1");
        Aluno a2 = new Aluno();
        
        AlunoDao dao = new AlunoDao();
        dao.Salvar(a1);
        
        
        
        
        System.out.println("Entre com o nome do Aluno");
        a2.setNome(leitor.next());
        dao.Salvar(a2);
        
        
        
    }
    
}
