package Ex_POO_Abstract_Encapsulation.Bank;

public class UserBank extends Bank{
    public UserBank(String nome,  double saldo) {
        super(nome, saldo);
    }


    @Override
    public void consultarSaldo() {
        System.out.printf(ANSI_BLUE + "Olá %s, Seu Saldo é de R$ %.2f.\n" + ANSI_RESET , getNome() , getSaldo());
    }

    @Override
    public void depositar() {
         System.out.println("Digite o Valor que Deseja Depositar: ");
         double valorDoDeposito = scanner.nextDouble();
         setSaldo(getSaldo() + valorDoDeposito);
        System.out.printf(ANSI_GREEN + "Valor Depositado com Sucesso, Você Depositou R$ %.2f. \n"+ ANSI_RESET , valorDoDeposito);

    }
    public void sacar() {
        System.out.printf(ANSI_BLUE+ "Olá %s, Seu Saldo Disponível é: R$ %.2f \n" +ANSI_RESET , getNome(),getSaldo());
        System.out.println(ANSI_Yellow + "Digite o Valor que Deseja Sacar: " + ANSI_RESET);
        double valorDoSaque = scanner.nextDouble();
        if (valorDoSaque > getSaldo()){
            System.out.println(ANSI_RED +"O Saque Falhou , Saldo Insuficiente Para completar a Operação. " + ANSI_RESET);
            return;
        }
        setSaldo(getSaldo() - valorDoSaque);
        System.out.printf(ANSI_GREEN + "Valor Sacado com Sucesso , Você Sacou R$ %.2f. \n"+ ANSI_RESET  , valorDoSaque);

    }


    @Override
    public void consultarChequeEspecial() {
        final double chequeEspecialRecebido = getChequeEspecial();
        if (getChequeEspecial() <= 0){
            System.out.println(ANSI_RED + "Cheque Especial Indisponível" + ANSI_RESET);
            return;
        }
        System.out.printf(ANSI_BLUE+ "Cheque Especial Disponível de R$ %.2f \n"+ ANSI_RESET , getChequeEspecial());
    }

    @Override
    public void usarChequeEspecial() {
        if(getChequeEspecial() <= 0){
            System.out.println(ANSI_RED +"Cheque especial Indisponível"+ANSI_RESET);
        }else {
            System.out.printf(ANSI_Yellow +"Você Tem R$ %.2f Disponível Para Uso \nDigite a Quantidade que deseja usar :" +  ANSI_RESET, getChequeEspecial() );
            double valorChequeEspecial = scanner.nextDouble();
            if (valorChequeEspecial > getChequeEspecial()){
                System.out.println(ANSI_RED + "Valor Indisponível" + ANSI_RESET);
                return;
            }setChequeEspecial(getChequeEspecial() - valorChequeEspecial);
            System.out.println(ANSI_GREEN+ "Cheque especial resgatado com Sucesso"+ANSI_RESET);
        }
    }
}
