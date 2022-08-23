/*Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma  dos números 
positivos e a soma dos números negativos. */
 

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        double somNegativos=0, somPositivos=0, i=0, num;

        while (i<=9) {
            System.out.println("Digite um número: ");
            num = ler.nextDouble();
            if (num == 0){
                System.out.println("Este é um número nulo, Digite ouro número :");
                num = ler.nextDouble();
            }else if (num < 0){
                somNegativos += num;
            }else if (num > 0){
                somPositivos += num;
            } 
            i +=1;   
        }
        ler.close();
        System.out.println("A soma total dos números negativos é "+somNegativos+" e dos números positivos "+somPositivos+".");

    }
}