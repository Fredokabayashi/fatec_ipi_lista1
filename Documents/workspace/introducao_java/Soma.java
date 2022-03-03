import javax.swing.JOptionPane;

public class Soma {
    public static void main(String[] args) {
        //declaracao de variaiveis
        double op1, op2, res;

        //entrada de dados
          op1 = Double.parseDouble (JOptionPane.showInputDialog("Digite o primeiro operando"));
          op2 = Double.parseDouble (JOptionPane.showInputDialog("Digite o segundo operando"));

        //processamento 
           res = op1 + op2;
        //saida
        JOptionPane.showMessageDialog(null, res);


    }
}