/*Elaborar um  algoritmo  que  leia 15  valores  inteiros.  O algoritmo não  poderá  aceitar  o numero 
zero. Mostrar: 
a. quantidade de números positivos 
b. quantidade de números negativos 
c. soma de todos os valores positivos 
d. soma de todos os valores negativos */


import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);

        int somNegativos=0, somPositivos=0, i=0, num;

        while (i<=15) {
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            if (num == 0){
                System.out.println("Este é um número nulo, Digite ouro número :");
                num = ler.nextInt();
            }else if (num < 0){
                somNegativos += num;
            }else if (num > 0){
                somPositivos += num;
            } 
            i +=1;   
        }
        ler.close();
        System.out.println("A soma total dos nuémeros positivos é "+somPositivos);
        System.out.println("A soma total dos números negativos é "+somNegativos);
    }
}