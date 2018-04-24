import javax.swing.JOptionPane;

public class ExemploString01{
    public static void main(String[] args){

        String nome = "Curso de Java";
        System.out.println("Tamanho da String");
        // retorna a quantidade de caracteres da String
        System.out.println(nome);
        System.out.println("Tamanho da String: "
         + nome.length());

         String nick = JOptionPane.showInputDialog(null, "Informe o nick do seu pager");
         
         if(nick.equals("")){
             JOptionPane.showMessageDialog(null,
            "Filho eu pedi pra voce digitar o seu nick, ta difil?");

            String jogoDoAno = " League of lengends   ";
            // remove espaços do começo e do fim
            jogoDoAno = jogoDoAno.trim();

            String sistemaOperacional = "LiNUX";
            System.out.println(sistemaOperacional);

            //colocar o texto todo em caixa alta
            sistemaOperacional = sistemaOperacional.toUpperCase();
            System.out.println(sistemaOperacional);

            //colocar o texto todo em caixa baixa
            sistemaOperacional = sistemaOperacional.toLowerCase();
            System.out.println(sistemaOperacional);

            //pegar um caracter em determinado índece
            char letra = sistemaOperacional.charAt(2);
            
         }
        
    }
}