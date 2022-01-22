/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 20171TIIMI0238
 */
public class Empresa {

    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Gerente> gerentes;
    
    public Empresa(){
        this.funcionarios = new ArrayList<Funcionario>();
        this.gerentes = new ArrayList<Gerente>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public void setGerentes(ArrayList<Gerente> gerentes) {
        this.gerentes = gerentes;
    }
    
    public void inserirFuncionrio(Funcionario f ){
        this.funcionarios.add(f);
    }
    
    public void inserirGerente(Gerente g){
        this.gerentes.add(g);
    }    
        
    public Funcionario getFuncionario(int index){
        return this.funcionarios.get(index);
    }
        
    public Gerente getGerente(int index){
        return this.gerentes.get(index);
    }
    
    public double CustoMensal(){
        double total = 0;
        for(Gerente g: this.getGerentes()){
            total += g.getSalario();
        }
        for(Funcionario f : this.getFuncionarios()){
            total += f.getSalario();
        }
        return total;
    } 
    
    public void lerFuncionarios()throws FileNotFoundException, IOException{
        FileReader arq = new FileReader("funcionarios.txt");
        BuferredReader buf = new BuferredReader(arq);
        
        while(buf.ready()){
            String nome = buf.readLine();
            String cpf = buf.readLine();
            double salario = Double.parseDouble(buf.readLine());
            int dia1 = Integer.parseInt(buf.readLine());
            int mes1 = Integer.parseInt(buf.readLine());
            int ano1 = Integer.parseInt(buf.readLine());
            Data d1 = new Data(dia1, mes1, ano1);
            int dia2 = Integer.parseInt(buf.readLine());
            int mes2 = Integer.parseInt(buf.readLine());
            int ano2 = Integer.parseInt(buf.readLine());
            Data d2 = new Data(dia2, mes2, ano2);

        }
    }
    
}
