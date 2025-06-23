package Ex_POO_Abstract_Encapsulation.Bank;

import java.util.Scanner;

public abstract class Bank  implements InterfaceBank{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_Yellow = "\u001B[33m";


    private String nome;
    private double saldo;
    private double chequeEspecial;
    Scanner scanner = new Scanner(System.in);

    //Construtor

    public Bank(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // Getters e setters


    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public String getNome() {
        return nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {return this.saldo;}


    // methods da interface

    @Override
    public void consultarSaldo() {

    }

    @Override
    public void depositar() {

    }

    @Override
    public void sacar() {

    }
    @Override
    public void consultarChequeEspecial(){
    }

    @Override
    public void usarChequeEspecial() {

    }

}
