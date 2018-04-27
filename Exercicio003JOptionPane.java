import javax.swing.JOptionPane;

public class Exercicio003JOptionPane{
    public static void main(String[] args){

    double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um Numero"));
    double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Segundo Numero"));

    int soma = 1;
    int subtrair = 2;
    int multiplicar = 3;
    int dividir = 4;
     
    int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "                   Menu" + "\n1                 |Somar" +
    "\n2                 |Subtrair" +
    "\n3                 |Multiplicar" +
    "\n4                 |dividir" + "\nDigite s Sua Escolha: "));
    if (escolha == 1){
        JOptionPane.showMessageDialog(null, "A Soma dos dois Numeros Sera: " + (numero1 + numero2));
    }else if ( escolha == 2){
        JOptionPane.showMessageDialog(null, "A Subtracao desses Numeros Sera: " + (numero1 - numero2));
    }else if (escolha == 3){
        JOptionPane.showMessageDialog(null, "A Multiplicação desses Numeros Sera" + (numero1 * numero2));
    }else if (escolha == 4){
        JOptionPane.showMessageDialog(null, "A Divisão desse Numeros sera" + (numero1 / numero2));
    }else {
        JOptionPane.showMessageDialog(null, "Escolha Invalida...");
    }


        
    }
}