import javax.swing.JOptionPane;

import com.sun.corba.se.impl.orbutil.StackImpl;
import com.sun.org.apache.xerces.internal.impl.xs.util.ObjectListImpl;

 public class ExemploJOptionPaneshowMessageDialog{

    public static void main(String[] args) { 
        int opcao = JOptionPane.showOptionDialog(null,
         "Selecione o meu desejo!",
         "MENU DO SISTEMA",
         0,
         JOptionPane.INFORMATION_MESSAGE,
         null,
         new Object[] {
             "Cadastro", "Edição", "Lista"
         },
         "Edição"
         );
         if(opcao == 1) {
             JOptionPane.showMessageDialog(null, 
             "Ediação selecionada");
         }else if(opcao == 0){
             JOptionPane.showMessageDialog(null,
             "Cadastro selecionado");
         }else if(opcao == 2){
             JOptionPane.showMessageDialog(null,
             "Lista selecionada");
         }
         }
           System.out.println(opcao);   
         }
 