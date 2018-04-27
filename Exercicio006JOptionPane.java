import javax.swing.JOptionPane;

public class Exercicio006JOptionPane{
    public static void main(String[] args){

        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um Numero"));

        if (numero != 1){
            JOptionPane.showMessageDialog(null, "Este Numero é Diferente de 1");
        }else{
            JOptionPane.showMessageDialog(null, "Este Numero é Igual a 1");
        }
        
    }
}