package Exercicios;

import java.util.Scanner;

public class EstruturasdeControle04 {
    public static void main(String[] args) {
        /*
        Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução
        do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
        números menores que o primeiro número devem ser ignorados
         */

        var scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero");
        int numberOne = scanner.nextInt();

        while (true){
            System.out.println("Digite o Segundo numero:");
            int numbertwo = scanner.nextInt();

            if(numbertwo < numberOne) continue;
            boolean isDifferent = numbertwo % numberOne != 0;
            if (isDifferent) break;
        }
        System.out.println("uhuull Encontrei o Numero \\o/");
    }
}
