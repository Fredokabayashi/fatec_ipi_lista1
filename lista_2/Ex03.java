/* Ex03. Ler três valores reais e exibir o maior valor entre eles. 
Suponha que eles sejam diferentes. */

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        
	
            //chama e/ou cria Scanner para obter dados a partir da janela de comando
            Scanner input;
            input = new Scanner(System.in);
            
            Double numero1, numero2, numero3, maior;
            
            System.out.println("Digite o primeiro numero:   \n");
            numero1 = input.nextDouble();
            
            System.out.println("Digite o segundo numero:    \n");
            numero2 = input.nextDouble();
            
            System.out.println("Digite o terceiro numero:   \n");
            numero3 = input.nextDouble();
            
            maior = numero1;

             if (numero2 > maior) maior = numero2;
             if (numero3 > maior) maior = numero3;
                
            System.out.printf("Maior numero = %.1f!", maior);
            input.close();
            
        
        }
    }
    
