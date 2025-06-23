package Ex_POO_Abstract_Encapsulation.Bank;


import java.util.Scanner;


public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_Yellow = "\u001B[33m";



    public static void main(String[] args) {
        /*
            Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
            Consultar saldo
            consultar cheque especial
            Depositar dinheiro;
            Sacar dinheiro;
            Pagar um boleto.
            Verificar se a conta está usando cheque especial.
            Siga as seguintes regras para implementar

            A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
            O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
            Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
            Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
            TODO: Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.*/





        var scanner = new Scanner(System.in);
        String nome;
        double saldo;
        String option = "";

         System.out.println("======================================");
         System.out.println(ANSI_Yellow + "        Digital BANK" + ANSI_RESET);
         System.out.println("======================================");
         System.out.println(ANSI_BLUE + "Registro " + ANSI_RESET);
         System.out.print(ANSI_Yellow + "Digite o Seu Nome \n=>" );
         nome = scanner.next();
         System.out.print(ANSI_Yellow + "Digite o Seu Saldo \n=>" + ANSI_RESET);
         saldo = scanner.nextDouble();
         UserBank userBank = new UserBank(nome , saldo);
         double setChequeEspecial = userBank.getSaldo() <= 500 ? 50 : (userBank.getSaldo() /2);
         userBank.setChequeEspecial(setChequeEspecial);
         System.out.println(ANSI_GREEN + "Usuário Registrado com Sucesso." + ANSI_RESET);


         do {
             System.out.println("======================================");
             System.out.println(ANSI_Yellow + "        Digital BANK" + ANSI_RESET);
             System.out.println("======================================");
             System.out.println("1. Consultar Saldo");
             System.out.println("2. Consultar Cheque Especial");
             System.out.println("3. Depositar");
             System.out.println("4. Sacar");
             System.out.println("5. Usar Cheque Especial");
             System.out.println("0. Sair");

             option = scanner.next();


             switch (option){
                 case "0" -> {continue;}
                 case "1"-> userBank.consultarSaldo();
                 case "2"-> userBank.consultarChequeEspecial();
                 case "3"-> userBank.depositar();
                 case "4"->  userBank.sacar();
                 case "5"-> userBank.usarChequeEspecial();
                 default -> System.out.println(ANSI_RED + "Opção Invalida" + ANSI_RESET);

             }

         }while (!option.equals("0"));
        scanner.close();
    }
}
