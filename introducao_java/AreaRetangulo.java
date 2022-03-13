import javax.swing.JOptionPane;
public class Retangulo {
    public static void main(String[] args) {
        //declaracao de variaiveis
        double a,b, Area;
         //entrada de dados
         a = Double.parseDouble (JOptionPane.showInputDialog("Digite o primeiro operando"));
         b = Double.parseDouble (JOptionPane.showInputDialog("Digite o segundo operando"));
        
        //processamento 
        Area = a*b;

        //saida
        
        System.out.println("Area do retangulo: " Area);     
    }
}



