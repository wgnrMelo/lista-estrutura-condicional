import javax.swing.JOptionPane;

public class ExemploJOptionPaneShowConfirmDialog{

    public static void main(String[] args){

     int opcao = JOptionPane.showConfirmDialog(null, 
       "Deseja cadastrar");



     if(opcao == JOptionPane.OK_OPTION){
       JOptioPane.showConfirmDialog(null,
          "Registrado salvo com sucesso!");
     }else if(opcao == JOptionPane.OK_OPTION){
         JOptionPane.showMessageDialog(null,
         "Negado com sucesso");
     }else if(opcao == JOptionPane.CANCEL_OPTION){
       JOptionPane.showMessageDialog(null,
        "Cancelado com sucesso");
     }else {
        JOptionPane.showMessageDialog(null,
        "Fechado com sucesso");
     }

     }
     
}
