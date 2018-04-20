import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Exercicio08JOptionPane{
    public static void main(String[] args){

        double contaOi = Double.parseDouble(JOptionPane.showInputDialog("Valor da Oi"));
        double contaVivo = Double.parseDouble(JOptionPane.showInputDialog("Valor da Vivo"));
        double contaNet = Double.parseDouble(JOptionPane.showInputDialog("Valor da Net"));
        double contaLuz = Double.parseDouble(JOptionPane.showInputDialog("Valor da Luz"));
        double contaAgua = Double.parseDouble(JOptionPane.showInputDialog("Valor da Água"));
        double iptu = Double.parseDouble(JOptionPane.showInputDialog("Valor do IPTU"));
        double ipva = Double.parseDouble(JOptionPane.showInputDialog("Valor do IPVA"));
        double seguroDoCarro = Double.parseDouble(JOptionPane.showInputDialog(
               "Valor do Seguro do Carro"));

        double somaTelefones = contaOi + contaVivo;
        double somaContasDiversas = contaAgua + contaLuz + contaNet;
        double somaImpostos = iptu + ipva + seguroDoCarro;

        JOptionPane.showMessageDialog(null,
            "\nSomaTelefones:" + contaOi + contaVivo +
            "\nSomaContasDiversas:" + contaAgua + contaLuz +
            "\nSomaImpostos:" + iptu + ipva      
        );

  
    }
}