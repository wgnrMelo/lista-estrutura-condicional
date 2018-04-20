import javax.swing.JOptionPane;
 
 public class Exercicio02JOptionPane{
  
  public static void main(String[] args){

    double litros =  Double.parseDouble(JOptionPane.showInputDialog("Digite o numero"));
    int anoDeConsumo = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
    double valorPorLitros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));

    double quantidadesLitros =  anoDeConsumo*365*litros;
    double totalLitrosConsumidos = quantidadesLitros*valorPorLitros;

      JOptionPane.showMessageDialog(null,
        "\nLitros:" + litros + 
        "\nAnos de consumo:" + anoDeConsumo + 
        "\nValor por litros:" + valorPorLitros +
        "\nQuantidades litros:" + quantidadesLitros +
        "\nTotal Litros Consumidos:" + totalLitrosConsumidos 
        );
  }

 }