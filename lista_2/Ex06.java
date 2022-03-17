/* Ler um número inteiro e responder se ele é bissexto ou não. Um ano bissexto tem as
seguintes características:
- é múltiplo de quatro e não é múltiplo de 100 ou
- é múltiplo de 400*/

import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
    Scanner input;
    input = new Scanner (System.in);
    int ano;
    System.out.println ("Digite o ano para saber se e bissexto ou nao");
    ano = input.nextInt();
    if ( ( ( ano % 4 == 0 ) && ( ano % 100 != 0 ) ) || ( ano % 400 == 0 ) ) {
        System.out.println( "O ano e bissexto");
     }

    
    else System.out.println("O ano nao e bissexto");
    input.close();
    }
}
