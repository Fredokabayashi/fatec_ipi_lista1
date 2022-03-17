/* Ex04. Ler um inteiro no intervalo [1, 7] e exibir o dia da semana associado a ele, como a
seguir: 1: Domingo, 2: Segunda, 3: Terça. E assim por diante.*/

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
     Scanner input;
     input = new Scanner(System.in);
     int i;
     do{
         System.out.println("Digite um numero entre 1 a 7 inclusive");
         i = input.nextInt();
         if(i<1 | i>7) System.out.println("Valor fora do intervalo aceito");

     } while (i<1 | i>7);
     switch (i){
         case 1: System.out.println("Domingo"); break;
         case 2: System.out.println("Segunda"); break;
         case 3: System.out.println("Terça"); break;
         case 4: System.out.println("Quarta"); break;
         case 5: System.out.println("Quinta"); break;
         case 6: System.out.println("Sexta"); break;
         case 7: System.out.println("Sabado"); break;


     }
     input.close();

    }
    
}
