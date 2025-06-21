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
        System.out.printf(ANSI_GREEN + "Valor Depositado com Sucesso, Você Depositou R$ %.2f. \n"+ ANSI_RESET , valorDepositado);

    }
    public void sacar() {
        System.out.printf(ANSI_BLUE+ "Olá %s, Seu Saldo Disponível é: R$ %.2f \n" +ANSI_RESET , getNome(),getSaldo());
        System.out.println(ANSI_Yellow + "Digite o Valor que Deseja Sacar: " + ANSI_RESET);
        double valor = scanner.nextDouble();
        if (valor > getSaldo()){
            System.out.println(ANSI_RED +"O Saque Falhou , Saldo Insuficiente Para completar a Operação. " + ANSI_RESET);
            return;
        }
        double valorSacado = getSaldo() - valor;
        setSaldo(valorSacado);
        System.out.printf(ANSI_GREEN + "Valor Sacado com Sucesso , Você Sacou R$ %.2f. \n"+ ANSI_RESET  , valorSacado);

    }
}
