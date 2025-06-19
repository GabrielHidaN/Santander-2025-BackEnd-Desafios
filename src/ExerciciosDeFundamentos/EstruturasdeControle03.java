package ExerciciosDeFundamentos;

import java.util.Scanner;

public class EstruturasdeControle03 {
    public static void main(String[] args) {
    /*Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre
     a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
     no intervalo de números informados, incluindo os números informados e em ordem decrescente;*/
        var scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro Numero:");
        int numberOne = scanner.nextInt();
        System.out.printf("Digite o segundo Numero ( Maior que %d ):\n" , numberOne);
        int numberTwo = scanner.nextInt();

        if(numberOne >= 0 && numberTwo > numberOne){
            System.out.println("Escolha entre Impar (i) e Par (p) :");
            var imparOuPar = scanner.next().equalsIgnoreCase("i") ? "impar" : "par";
            switch (imparOuPar){
                case "impar" -> {
                    for (int i = numberOne; i <= numberTwo ; numberTwo --){
                        if (!(numberTwo % 2 == 0)){
                            System.out.println(numberTwo);
                        }
                    }
                }
                case "par" -> {
                    for (int i = numberOne; i <= numberTwo ; numberTwo --){
                        if ((numberTwo % 2 == 0)){
                            System.out.println(numberTwo);
                        }
                    }
                }
                default -> System.out.println("Opcao Invalida");
            }
        }else {
            System.out.println("Voce Deve Inserir Numeros maior que 0 e o Segundo Numero deve ser maior que o Primeiro ");
        }
    }
}
