import javax.swing.JOptionPane;

public class ExemploJOptionPaneCaixaSelecao{
    public static void main(String[] args){

        String opcaoSelecionada = JOptionPane.showInputDialog(null,
        "Selecione um estado",
        "SISTEMA - DA Vovó",
        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{
            "","PR", "RS", "SC", "SP"
        },
         ""
        ).toString();
        System.out.println(opcaoSelecionada);
        if(opcaoSelecionada.equals("SC")){
            System.out.println("Santa catarina");
        }else if(opcaoSelecionada.equals("PR")) {
            System.out.println("Parana");
        }else if(opcaoSelecionada.equals("RS")){
            System.out.println("Rio Grande do Sul");
        }else if(opcaoSelecionada.equals("SP")){
            System.out.println("Sao Paulo");
        }
    }
}