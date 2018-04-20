import javax.swing.JOptionPane;

public class Exercicio06JOptionPane{
    public static void main(String[] args){

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1")); 
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("digite a nota 4"));
     
        double soma = nota1 + nota2 + nota3 + nota4;
        double mediaFinal = soma/2;

        JOptionPane.showConfirmDialog(null,
        "\nNota1:" + nota1 +
        "\nNota2:" + nota2 +
        "\nNota3:" + nota3 +
        "\nNota4:" + nota4 +
        "\nMediaFinal:" + mediaFinal
        );

    }
}