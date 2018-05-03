import javax.swing.JOptionPane;
public class Questao02JOtionPane{
    public static void main(String[] args){
        
      int numero = Integer.parseInt(JOptionPane.showInputDialog(
          "\n1 Fonte de Energia R$ 25.00" +
          "\n2 Placa Mae R$ 85.00" +
          "\n3 Hard Disc 820GB R$ 35.00" +
          "\n4 Cabo Sata R$ 10.00" +
          "\n5 Gravador de CD R$ 10.00" +
          "\n6 Placa de Video R$ 25.00" +
          "\n7  - Sair"));
          double preco = 0, precoTotal = 0;
            while(numero != 7){
              if (numero == 1){
                  preco = 25.00;
              }else if (numero == 2){
                  preco = 85.00;
              }else if (numero == 3){
                  preco = 35.00;
              }else if (numero == 4){
                  preco = 10.00;
              }else if (numero == 5){
                  preco = 10.00;
              }else if (numero == 6){
                  preco = 25.00;
              }

              JOptionPane.showMessageDialog(null, "Preco é R$" + preco);
             precoTotal = precoTotal + preco;
             numero = Integer.parseInt(JOptionPane.showInputDialog(
                "\n1 Fonte de Energia R$ 25.00" +
                "\n2 Placa Mae R$ 85.00" +
                "\n3 Hard Disc 820GB R$ 35.00" +
                "\n4 Cabo Sata R$ 10.00" +
                "\n5 Gravador de CD R$ 10.00" +
                "\n6 Placa de Video R$ 25.00" +
                "\n7 - Sair"));
        }
    }

}