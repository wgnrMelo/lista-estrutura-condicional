import javax.swing.JOptionPane;

public class Exercicio05JOptionPane{
    public static void main(String[] args){

        String carro = JOptionPane.showInputDialog("Digite o Nome do Carro");
        double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Carro"));

        double parcela = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da Parcela"));
        double quantidadesParcelas = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite a Quantidades de Parcelas"));
        double financiamentoTotal = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o valor Financiado"));
        double diferenca = financiamentoTotal - valorCarro;

        JOptionPane.showMessageDialog(null,
        "\nCarro:" + carro +
        "\nValorCarro:" + valorCarro +
        "\nParcela:" + parcela +
        "\nQuantidadesParcelas:" + quantidadesParcelas +
        "\nFinanciamentoTotal:" + financiamentoTotal +
        "\nDiferenca:" + diferenca
        );

        
    }

}