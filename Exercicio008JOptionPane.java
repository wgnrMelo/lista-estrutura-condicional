
import javax.swing.JOptionPane;


public class Exercicio008JOptionPane{
    public static void main(String[] args){

       JOptionPane.showMessageDialog(null, "Faça o Seu Pedido e Escolha 3 Produtos");

       double total = 0;
       

       String pedido1 = JOptionPane.showInputDialog(null,                                                             
        "Tipo                                                 Nome                                                                   valor" +
        "\n Bolos                                           Brigadeiro                                                     R$:29.50" +
        "\n Bolos                                           Floresta Negra                                                  R$:2.00 "+
        "\n Bolos                                           leite com Nutella                                               R$:29.23" +
        "\n Bolos                                           Mousse de Chocolate                                               R$:7.10 "+
        "\n Bolos                                           Nega Maluca                                                    R$:29.50" +
        "\n Doce                                            Bomba de Chocolate                                                R$:4.82 " +
        "\n Doce                                            Bomba de Creme                                                    R$:17.71" +
        "\n Sanduiche                                       Filé-Mignon                                                       R$:21.16" +
        "\n Sanduiche                                       Hamburgue com Queijo                                              R$:12.70 "+
        "\n Sanduiche                                       Provolone com Salame                                              R$:19.70" +
        "\n Sanduiche                                       Vegetarina de Berinjela                                           R$:28.22" +
        "\n Pizza                                           Calabresa                                                       R$:8.98" +
        "\n Pizza                                           Napolitana                                                      R$:0.42 " +
        "\n Pizza                                           Peruana                                                         R$:18.36" +
        "\n Pizza                                           Portuguesa                                                       R$:27.50", 
        "Cardapio",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{
        "","Bolo Brigadeiro","Bolo Floresta Negra", "Bolo Leite com Nutella", "Bolo Mousse de Chocolate", "Nega Maluca", "Bomba de Chocolate", "Bomba de Creme", "Sanduiche File Mignon com Fritas e chedder", "Hamburguer com Queijo", "Provolone com Salame","Sanduiche Vegeteriana de berinjela","Pizza calabresa","Pizza Napolitana","Pizza Peruana","Pizza Portuguesa"
        },
        ""
       ).toString();
       
       double valorPedido1 = 0;
        if(pedido1.equals("Bolo Brigadeiro")){
            valorPedido1 = 29.50;
            total = total + valorPedido1;
        }else if(pedido1.equals("Bolo Floresta Negra")){
            valorPedido1 = 21.50;
            total = total + valorPedido1;
        }else if(pedido1.equals("Bolo Leite com Nutella")){
            valorPedido1 = 29.30;
            total = total + valorPedido1;
        }else if(pedido1.equals("Bolo Mousse de Chocolate")){
            valorPedido1 = 7.10;
            total = total + valorPedido1;
        }else if(pedido1.equals("Bolo Nega Maluca")){
            valorPedido1 = 29.50;
            total = total + valorPedido1;
        }else if(pedido1.equals("Doce Bomba de Chocolate")){
            valorPedido1 = 17.71;
            total = total + valorPedido1;
        }else if(pedido1.equals("Doce Bomba de Creme")){
            valorPedido1 = 4.82;
            total = total + valorPedido1;
        }else if(pedido1.equals("Sanduiche File Mignon")){
            valorPedido1 = 21.16;
            total = total + valorPedido1;
        }else if(pedido1.equals("Sanduiche Hamburgue")){
            valorPedido1 = 12.70;
            total = total + valorPedido1;
        }else if(pedido1.equals("Sanduiche Provolone com Salame")){
            valorPedido1 = 19.70;
            total = total + valorPedido1;
        }else if(pedido1.equals("Sanduiche Vegetariana de Berinjela")){
            valorPedido1 = 28.22;
            total = total + valorPedido1;
        }else if(pedido1.equals("Pizza Calabresa")){
            valorPedido1 = 8.98;
            total = total + valorPedido1;
        }else if(pedido1.equals("Pizza Napolitana")){
            valorPedido1 = 0.42;
            total = total + valorPedido1;
        }else if(pedido1.equals("Pizza Peruana")){
            valorPedido1 = 18.36;
            total = total + valorPedido1;
        }else if(pedido1.equals("Pizza Perguesa")){
            valorPedido1 = 27.50;
            total = total + valorPedido1;
        }
        //
        String  pedido2 = JOptionPane.showInputDialog(null,
        "Tipo                                                 Nome                                                                   valor" +
        "\n Bolos                                           Brigadeiro                                                      R$:29.50" +
        "\n Bolos                                           Floresta Negra                                                  R$:2.00 "+
        "\n Bolos                                           leite com Nutella                                               R$:29.23" +
        "\n Bolos                                           Mousse de Chocolate                                               R$:7.10 "+
        "\n Bolos                                           Nega Maluca                                                      R$:29.50" +
        "\n Doce                                            Bomba de Chocolate                                                 R$:4.82 " +
        "\n Doce                                            Bomba de Creme                                                     R$:17.71" +
        "\n Sanduiche                                       Filé-Mignon                                                        R$:21.16" +
        "\n Sanduiche                                       Hamburgue com Queijo                                               R$:12.70 "+
        "\n Sanduiche                                       Provolone com Salame                                               R$:19.70" +
        "\n Sanduiche                                       Vegetarina de Berinjela                                            R$:28.22" +
        "\n Pizza                                           Calabresa                                                        R$:8.98" +
        "\n Pizza                                           Napolitana                                                       R$:0.42 " +
        "\n Pizza                                           Peruana                                                          R$:18.36" +
        "\n Pizza                                           Portuguesa                                                       R$:27.50" ,
        "Cardapio",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{
            "","Bolo Brigadeiro","Bolo Floresta Negra", "Bolo Leite com Nutella", "Bolo Mousse de Chocolate", "Nega Maluca", "Bomba de Chocolate", "Bomba de Creme", "Sanduiche File Mignon com Fritas e chedder", "Hamburguer com Queijo", "Provolone com Salame","Sanduiche Vegeteriana de berinjela","Pizza calabresa","Pizza Napolitana","Pizza Peruana","Pizza Portuguesa"
        },
        ""
       ).toString();
       double valorPedido2 = 0;

        if(pedido2.equals("Bolo Brigadeiro")){
            valorPedido2 = 29.50;
            total = total + valorPedido2;
        }else if(pedido2.equals("Bolo Floresta Negra")){
            valorPedido2 = 21.50;
            total = total + valorPedido2;
        }else if(pedido2.equals("Bolo Leite com Nutella")){
            valorPedido2 = 29.30;
            total = total + valorPedido2;
        }else if(pedido2.equals("Bolo Mousse de Chocolate")){
            valorPedido2 = 7.10;
            total = total + valorPedido2;
        }else if(pedido2.equals("Bolo Nega Maluca")){
            valorPedido2 = 29.50;
            total = total + valorPedido2;
        }else if(pedido2.equals("Doce Bomba de Chocolate")){
            valorPedido2 = 17.71;
            total = total + valorPedido2;
        }else if(pedido2.equals("Doce Bomba de Creme")){
            valorPedido2 = 4.82;
            total = total + valorPedido2;
        }else if(pedido2.equals("Sanduiche File Mignon")){
            valorPedido2 = 21.16;
            total = total + valorPedido2;
        }else if(pedido2.equals("Sanduiche Hamburgue")){
            valorPedido2 = 12.70;
            total = total + valorPedido2;
        }else if(pedido2.equals("Sanduiche Provolone com Salame")){
            valorPedido2 = 19.70;
            total = total + valorPedido2;
        }else if(pedido2.equals("Sanduiche Vegetariana de Berinjela")){
            valorPedido2 = 28.22;
            total = total + valorPedido2;
        }else if(pedido2.equals("Pizza Calabresa")){
            valorPedido2 = 8.98;
            total = total + valorPedido2;
        }else if(pedido2.equals("Pizza Napolitana")){
            valorPedido2 = 0.42;
            total = total + valorPedido2;
        }else if(pedido2.equals("Pizza Peruana")){
            valorPedido2 = 18.36;
            total = total + valorPedido2;
        }else if(pedido2.equals("Pizza Perguesa")){
            valorPedido2 = 27.50;
            total = total + valorPedido2;
        }
        //

        String pedido3 = JOptionPane.showInputDialog(null,
        "Tipo                                                 Nome                                                                   valor" +
        "\n Bolos                                             Brigadeiro                                                          R$:29.50" +
        "\n Bolos                                             Floresta Negra                                                     R$:2.00 "+
        "\n Bolos                                             leite com Nutella                                                  R$:29.23" +
        "\n Bolos                                             Mousse de Chocolate                                                R$:7.10 "+
        "\n Bolos                                             Nega Maluca                                                         R$:29.50" +
        "\n Doce                                               Bomba de Chocolate                                                 R$:4.82 " +
        "\n Doce                                               Bomba de Creme                                                     R$:17.71" +
        "\n Sanduiche                                    Filé-Mignon                                                             R$:21.16" +
        "\n Sanduiche                                    Hamburgue com Queijo                                                     R$:12.70 "+
        "\n Sanduiche                                    Provolone com Salame                                                     R$:19.70" +
        "\n Sanduiche                                    Vegetarina de Berinjela                                                  R$:28.22" +
        "\n Pizza                                              Calabresa                                                          R$:8.98" +
        "\n Pizza                                              Napolitana                                                         R$:0.42 " +
        "\n Pizza                                              Peruana                                                            R$:18.36" +
        "\n Pizza                                              Portuguesa                                                         R$:27.50",
        "Cardapio",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{
            "","Bolo Brigadeiro","Bolo Floresta Negra", "Bolo Leite com Nutella", "Bolo Mousse de Chocolate", "Nega Maluca", "Bomba de Chocolate", "Bomba de Creme", "Sanduiche File Mignon com Fritas e chedder", "Hamburguer com Queijo", "Provolone com Salame","Sanduiche Vegeteriana de berinjela","Pizza calabresa","Pizza Napolitana","Pizza Peruana","Pizza Portuguesa"
        },
        ""
       ).toString();
        double valorPedido3 = 0;

        if(pedido3.equals("Bolo Brigadeiro")){
            valorPedido3 = 29.50;
            total = total + valorPedido3;
        }else if(pedido3.equals("Bolo Floresta Negra")){
            valorPedido3 = 21.50;
            total = total + valorPedido3;
        }else if(pedido3.equals("Bolo Leite com Nutella")){
            valorPedido3 = 29.30;
            total = total + valorPedido3;
        }else if(pedido3.equals("Bolo Mousse de Chocolate")){
            valorPedido3 = 7.10;
            total = total + valorPedido3;
        }else if(pedido3.equals("Bolo Nega Maluca")){
            valorPedido3 = 29.50;
            total = total + valorPedido3;
        }else if(pedido3.equals("Doce Bomba de Chocolate")){
            valorPedido3 = 17.71;
            total = total + valorPedido3;
        }else if(pedido3.equals("Doce Bomba de Creme")){
            valorPedido3 = 4.82;
            total = total + valorPedido3;
        }else if(pedido3.equals("Sanduiche File Mignon")){
            valorPedido3 = 21.16;
            total = total + valorPedido3;
        }else if(pedido3.equals("Sanduiche Hamburgue")){
            valorPedido3 = 12.70;
            total = total + valorPedido3;
        }else if(pedido3.equals("Sanduiche Provolone com Salame")){
            valorPedido3 = 19.70;
            total = total + valorPedido3;
        }else if(pedido3.equals("Sanduiche Vegetariana de Berinjela")){
            valorPedido3 = 28.22;
            total = total + valorPedido3;
        }else if(pedido3.equals("Pizza Calabresa")){
            valorPedido3 = 8.98;
            total = total + valorPedido3;
        }else if(pedido3.equals("Pizza Napolitana")){
            valorPedido3 = 0.42;
            total = total + valorPedido3;
        }else if(pedido3.equals("Pizza Peruana")){
            valorPedido3 = 18.36;
            total = total + valorPedido3;
        }else if(pedido3.equals("Pizza Perguesa")){
            valorPedido3 = 27.50;
            total = total + valorPedido3;
       }
       JOptionPane.showMessageDialog(null,
       "Pedido:" + pedido1 + ". R$" + valorPedido1
       +"\nPedido:" + pedido2 + ". R$" + valorPedido2
       +"\nPedido:" + pedido3 + ". R$" + valorPedido3
       +"\nValor total da compra:" + ". R$" + total
       );

  }
}