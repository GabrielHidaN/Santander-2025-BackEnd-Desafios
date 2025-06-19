package Ex_POO_Abstract_Encapsulation.Bank;

public class UserBank extends Bank{
    public UserBank(String nome,  double saldo) {
        super(nome, saldo);
    }


    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public boolean isChequeDisponivel() {
        return super.isChequeDisponivel();
    }

    @Override
    public void depositar() {
         System.out.println("Digite o Valor que Deseja Depositar: ");
         double valor = scanner.nextDouble();
         double valorDepositado = getSaldo() + valor;
         setSaldo(valorDepositado);
        System.out.println(ANSI_GREEN + "Valor Depositado com Sucesso"+ ANSI_RESET );

    }
}
