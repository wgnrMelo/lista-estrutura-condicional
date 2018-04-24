import javax.swing.JOptioPane;
import javax.swing.JOptionPane;

public class ExemploWhile04{
    public static void main(String[] args){

        String nome = JOptioPane.showInputDialog("Digite o seu nome");
    /*
    while(!nome.equalsIgnoreCase("Sair") &&
         !nome.equalsIgnoreCase("fim")){
        
        */
        while(nome.equalgnoreCase("Sair")){
            double nota1 = Double.parseDouble(JOptioPane.showInputDialog(
                "Digite a sua nota 1"));
            double nota2 = Double.parseDouble(JOptioPane.showInputDialog(
                "Digite a sua nota 2"));
            double nota3 = Double.parseDouble(JOptioPane.showInputDialog(
                "Digite a sua nota 3"));
            double media = (nota1 + nota2 + nota3)/ 3;
            JOptioPane.showMessageDialog(null, "Média: " + media);
            somaMedia = somaMedia + media;
            quantidadetTotalDeAlunos = quantidadetTotalDeAlunos + 1;

            if(media < 7){
            }else{
            }

            nome.JOptioPane.showInputDialog("Digite seu nome.\nSedesejar sair digite\"Sair\". :)");
        }
        double mediaDasMedias = somaMedia / quantidadetTotalDeAlunos;
        JOptionPane.showMessageDialog(null, "Média das Medias é: " + mediaDasMedias);
           
    }
}
}