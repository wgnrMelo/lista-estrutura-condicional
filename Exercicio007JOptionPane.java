import javax.swing.JOptionPane;

public class Exercicio007JOptionPane{
    public static void main(String[] args){
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Numero"));
        String texto = "";

        if (numero %2 == 0 && numero != 0 ){
            texto += "Par";
        }else if (numero %2 != 0){
            texto += "Impar";
        }else if (numero == 0){
            texto += "\" numero neutro\"";
        }
        if (numero > 0 ){
            texto += "\nPositivo";
        }else if (numero < 0 ){
            texto += "\nNegativo";
        }
        if (numero > 10){
            texto += "\nMaior que 10";
        }else {
            texto += "\n";
        }
        if (numero <= 50){
            texto += "\nMenor ou igual a 50";
        }else {
            texto += "\n";
        }
        if (numero < - 10){
            texto += "\nMenor que - 10";
        }else {
            texto += "\n";
        }
        if (numero != 1){
            texto += "\nDiferente de 1";
        }
        JOptionPane.showMessageDialog(null, texto);
        
    }
}