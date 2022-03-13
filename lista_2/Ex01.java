//Ex.01. Ler um número inteiro e exibir se ele é positivo, negativo ou neutro (0).
import javax.swing.JOptionPane;
public class Ex01 {
    public static void main(String[] args) {
// declaração de variáveis

double numero;
numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero"));
if (numero > 0) {
JOptionPane.showMessageDialog(null,"Positivo");
}
else (numero < 0 ) {
    JOptionPane.showMessageDialog(null, "Negativo");
}
else {
    JOptionPane.showMessageDialog(null, "Neutro");
        }
      }
    }
