/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;
import java.util.ArrayList;

/**
 *
 * @author 20171TIIMI0238
 */
public class Gerente extends Funcionario {
    protected String senha;
    protected ArrayList<Funcionario> equipe;
    //private ArrayList<Gerente> gerentes;

    public ArrayList<Funcionario> getEquipe() {
        return equipe;
    }
    
    public Gerente(ArrayList<Funcionario> equipe, String senha, String nome, String CPF, double salario, Data dtNasc, Data dtContr) {
        super(nome, CPF, salario, dtNasc, dtContr);
        this.senha = senha;
        this.equipe = equipe;
    }
    
    public double custoEquipe(){
        double custo = this.salario;
        for(Funcionario f: this.equipe){
            custo += f.getSalario();
        }
        return custo;
    }
    
    public String getCusto() {
    return this.nome + " ­ CPF: " + this.CPF + 
           " ­ Salário: R$ " + String.format("%.2f", this.salario) + 
           " ­ Custo da equipe: R$ " + 
           String.format("%.2f", this.custoEquipe()) + "\n";
    }
    
    
    
}

    

    

