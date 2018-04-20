import javax.swing.JOptionPane;

public class Exercicio04JOptionPane{

    public static void main(String[] args){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));

        JOptionPane.showMessageDialog(null,
        "\n" + numero + " x 0 = " + numero * 0 +
        "\n" + numero + " x 1 = " + numero * 1 +
        "\n" + numero + " x 2 = " + numero * 2 +
        "\n" + numero + " x 3 = " + numero * 3 +
        "\n" + numero + " x 4 = " + numero * 4 +
        "\n" + numero + " x 5 = " + numero * 5 +
        "\n" + numero + " x 6 = " + numero * 6 +
        "\n" + numero + " x 7 = " + numero * 7 +
        "\n" + numero + " x 8 = " + numero * 8 +
        "\n" + numero + " x 9 = " + numero * 9 +
        "\n" + numero + " x 10 = " + numero * 10);
       

    }
}