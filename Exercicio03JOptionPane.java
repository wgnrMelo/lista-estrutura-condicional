import  javax.swing.JOptionPane;

public class Exercicio03JOptionPane{
    public static void main(String[] args){

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero"));

        double soma = (numero1 + numero2);
        double subtracao = (numero1 - numero2);
        double divisao = (numero1 / numero2);
        double multiplicacao = (numero1 * numero2);
        double produto1 = (numero1 * numero1);
        double produto2 = (numero2 * numero2);

        JOptionPane.showMessageDialog(null,
         "\nSoma:" + soma +
         "\nSubtracao:" + subtracao +
         "\nDivisao:" + divisao +
         "\nMultiplicaco:" + multiplicacao +
         "\nProduto:" + produto1 +
         "\nProduto:" + produto2 
        );
        
        



    } 
    
}