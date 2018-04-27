import javax.swing.JOptionPane;

public class Exercicio008JOptionPane{
    public static void main(String[] args){

       JOptionPane.showMessageDialog(null, "Escolha 3 Produtos");
       double preco1 = (0);
       double preco2 = (0);
       double preco3 = (0);
       double total = (0);

       String cardapio1 = JOptionPane.showInputDialog(null, "Tipo                                            " + "Nome      " + " valor\n" +  
       "Bolos                                           Bolo brigadeiro                                                         R$:29.50\n" +
       "Bolos                                           Bolo Floresta Negra                                                     R$:2.00\n"  +
       "Bolos                                           Bolo Leite com Nutella                                                  R$:29.23\n" +
       "Bolos                                           Bolo Mousse de Chocolate                                                R$:7.10\n" +
       "Bolos                                           Bolo Nega Maluca                                                        R$19.23\n" +
       "Doce                                            Bomba de Creme                                                          R$17.71\n" +
       "Doce                                            Filé-Mignon com Frintas e Chedder                                       R$21.16\n" +
       "Sanduíche                                       Hamburgue com Queijo, champignon e Rucula                               R$12.70\n" +
       "Sanduíche                                       Provolone com Salame                                                    R$19.70\n" +
       "Sanduíche                                       Vegetarina de Berinjela             

       );
    }
}