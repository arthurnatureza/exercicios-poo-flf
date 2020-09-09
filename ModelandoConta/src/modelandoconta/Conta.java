/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelandoconta;

/**
 *
 * @author arthurnatureza
 */
public class Conta {
    
//atributos
    String nome;
    int numero;
    String agencia;
    double saldo;
    Data abertura;
    
    //metodos
    boolean sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return false;
        }else{
            System.out.println("Saldo suficiente");
            this.saldo = this.saldo - valor;
            //this.saldo -= valor; //a linha de cima pode ser feita assim tbm
            return true;
        }
    }
    
    void depositar(double valor){
        this.saldo += valor;
    }
    
    double calcularRendimento(){
        return this.saldo * 0.1;
    }
    
    String recuperaDadosParaImpressao(){
        return "Nome: " + this.nome + 
               "\nNumero: " + this.numero +
               "\nAgencia: " + this.agencia +
               "\nSaldo: " + this.saldo +
               "\nAbertura: " + this.abertura.dia + "/" + this.abertura.mes +
                "/" + this.abertura.ano;
        
    }
    
}