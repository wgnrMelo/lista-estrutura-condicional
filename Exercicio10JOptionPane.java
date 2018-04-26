import javax.swing.JOptionPane;

public class Exercicio10JOptionPane{
    public static void main(String[] args){
        
        int anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite o Ano de Nascimento"));

            int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano Atual"));
            int idade = anoAtual - anoDeNascimento ; 

       
        

        JOptionPane.showInputDialog(null,
        "\nAno de Nascimento: " + anoDeNascimento +
        "\nAno Atual: " + anoAtual +
        "\nIdade: " + idade
        ); 




        
    }
}