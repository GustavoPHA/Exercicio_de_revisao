import java.util.Scanner;

   public class Exercicio {
     public static void main ( String[] args ) {

          Scanner ler = new Scanner (System.in) ;

          double base, altura, area;
          System.out.println("Insira o valor da base:");
          base= ler.nextDouble();

          System.out.println("Insira o valor da Altura:");
          altura= ler.nextDouble();

		  area = (base * altura)/2;
          System.out.println("O valor da area é:"+ area);
     }
   }