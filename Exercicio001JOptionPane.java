import javax.swing.JOptionPane;

public class Exercicio001JOptionPane{
    public static void main(String[] args){

 int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numero"));
 
if (numero>0){
    System.out.println("Positivo");

}else{
    System.out.println("Não é Positivo");

    }

        
  }
}