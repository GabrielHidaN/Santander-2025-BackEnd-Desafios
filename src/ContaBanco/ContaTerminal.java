package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args ) throws Exception{

        Scanner sc = new Scanner(System.in);
        sc.useLocale(new Locale("pt", "BR"));
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.print("Por favor, digite o Nome do Cliente \n=> ");
        nomeCliente = sc.next();
        System.out.print("Por favor, digite o Numero da Conta \n=> ");
        numeroConta = sc.nextInt();
        System.out.print("Por favor, digite o Numero da Agencia \n=> ");
        agencia = sc.next();
        System.out.print("Por favor, digite o Saldo Disponível na Conta \n=> ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque" , nomeCliente , agencia , numeroConta , saldo);
    }
}
