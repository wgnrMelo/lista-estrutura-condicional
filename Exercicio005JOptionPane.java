import javax.swing.JOptionPane;

public class Exercicio005JOptionPane{
    public static void main(String[] args){
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Numero"));

        if (numero %2 != 0 && numero!= 0){
            JOptionPane.showMessageDialog(null, "Este Numero é Impar");
        }else{
            JOptionPane.showMessageDialog(null, "Este Numero Não é Impar");
        }
    }
}