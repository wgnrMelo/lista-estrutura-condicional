import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOtionPaneIcon{
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Olá Mundo",
        "Sistema da Vovó", JOptionPane.WARNING_MESSAGE,
         new ImageIcon(
             ExemploJOtionPaneIcon.class.getResource
             ("/Image/bug.png")
         )
        );
    }
}