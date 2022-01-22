/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 20171TIIMI0238
 */
public class Funcionario {
    protected String nome;
    protected String CPF;
    protected double salario;
    protected Data dtNasc;
    protected Data dtContr;

    public Funcionario(String nome, String CPF, double salario, Data dtNasc, Data dtContr) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.dtNasc = dtNasc;
        this.dtContr = dtContr;
    }
    
    public String getCusto(){
        String salario = String.format("%.2f", this.salario);
        return this.nome + " - CPF: " + this.CPF + "-  Salário: R$"  + this.salario + "\n";
    }
        
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the dtNasc
     */
    public Data getDtNasc() {
        return dtNasc;
    }

    /**
     * @param dtNasc the dtNasc to set
     */
    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    /**
     * @return the dtContr
     */
    public Data getDtContr() {
        return dtContr;
    }

    /**
     * @param dtContr the dtContr to set
     */
    public void setDtContr(Data dtContr) {
        this.dtContr = dtContr;
    }
    
    public void salvarArq() throws IOException{
        FileWriter arq = new FileWriter("funcionarios.txt", true);
        
        BufferedWriter buf = new BufferedWriter(arq);
        
        buf.write(this.nome + "\n");
        buf.write(this.CPF + "\n");
        buf.write(this.salario + "\n");
        buf.write(this.dtNasc.getDia() + "\n");
        buf.write(this.dtNasc.getMes() + "\n");
        buf.write(this.dtNasc.getAno() + "\n");
        buf.write(this.dtContr.getAno() + "\n");
        buf.write(this.dtContr.getAno() + "\n");
        buf.write(this.dtContr.getAno() + "\n");
        buf.close();
   
        
        
    }
    
    
}
