package Exercicios;

import java.util.Scanner;

public class EstruturasdeControle01 {
    public static void main(String[] args) {
        //Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

        var scanner = new Scanner(System.in);

        System.out.print("==== Tabuada ==== \nVoce deseja ver a Tabuada de Qual Numero?\n=>");
        int number = scanner.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            int res = number * i;
            System.out.printf("%d x %d = %d \n" , i , number , res);
        }
    }
}
