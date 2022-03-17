/* Ex02. Ler coeficientes reais a, b e c de uma equação de segundo grau e exibir a(s) raiz(es),
caso exista(m). Lembretes: Calcule o valor de delta. Se ele for negativo, não há
raízes.. Se for igual a zero, há uma única raiz. Se delta for maior do que zero, então
há duas raízes. Equação de Bhaskara que chamremos de raizBhaskara*/

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor;
		leitor = new Scanner (System.in);
		Double a, b, c, delta, x1, x2;

		System.out.println("\n Digite o Valor de a ");
		
		a = leitor.nextDouble();
		// digitando valor 2
		System.out.println("\n Digite o Valor de b ");
		
		b = leitor.nextDouble();
		// sigitando valor3
		System.out.println("\n Digite o Valor de c ");
		
		c = leitor.nextDouble();

		// calculo de delta, conhecida como a equação de Bhaskara
		delta = (b * b) - (4 * a * c );
		/* delta recebe meu valor de (b*b),que e B ao
		quadrado - 4* valor de A * valor de C */
		if (delta > 0) {// se condicao for verdadeira executa
			x1 = ((-b + Math.sqrt(delta)) / (2 * a));// x'calculo
			// de
			// x= -b +/-
			// Raiz de delta
			// (div/) por 2 * a

			x2 = ((-b - Math.sqrt(delta)) / (2 * a));// x"
			// Math.sqrt
			// calcula a
			// raiz, raiz do
			// reaultado de
			// delta

			System.out.println("\n Valor de X1 e = " + x1
					+ "\n Valor de X2 e = " + x2);

		} 
		else System.out.println("Não e possivel calcular esta Raiz, não e um numero real ");
		

	}

}


    
    

