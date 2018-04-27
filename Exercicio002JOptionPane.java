import javax.swing.JOptionPane;

public class Exercicio002JOptionPane{
    public static void main(String[] args){

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero"));
    
    if (numero<0){
        JOptionPane.showMessageDialog(null, "Esse numero é Negativo");

    }else{
        JOptionPane.showMessageDialog(null, "Esse Numero é Positivo");
    
     }

        
    }
}