/* Ex05. Ler um número inteiro no intervalo [1, 12]. Considerando que cada número
representa um mês da seguinte forma: 1: Janeiro, 2: Fevereiro e assim por diante,
exiba o número de dias que o mês cujo respectivo número digitado possui.*/

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner input;
        int n;
        input = new Scanner (System.in);
        do{
            System.out.println("Digite um numero entre 1 e 12: ");
            n = input.nextInt();
            if(n<1 | n>12) System.out.println("Numero fora do intervalo. Digite numero valido");

        }while (n<1 | n>12);
        switch (n){
            case 1: System.out.println("janeiro"); break;
            case 2: System.out.println("fevereio"); break;
            case 3: System.out.println("marco"); break;
            case 4: System.out.println("abril"); break;
            case 5: System.out.println("maio"); break;
            case 6: System.out.println("junho"); break;
            case 7: System.out.println("julho"); break;
            case 8: System.out.println("agosto"); break;
            case 9: System.out.println("setembro"); break;
            case 10: System.out.println("outubro"); break;
            case 11: System.out.println("novembro"); break;
            case 12: System.out.println("dezembro"); break;
        }
    }
}
