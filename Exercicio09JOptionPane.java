import javax.swing.JOptionPane;

public class Exercicio09JOptionPane{
    public static void main(String[] args){

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite o Primeiro numero")), numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, 
        "Digite o Segundo numero"));

        double inverso = 0;

        inverso = numero2;
         numero2 = numero1;
         numero1 = inverso;

         JOptionPane.showMessageDialog(null, 
         "\nNumero 1: " + numero1 +
         "\nNumero 2: " + numero2 
         );
        
    }
}