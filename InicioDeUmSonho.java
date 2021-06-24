package iniciodeumsonho;

import javax.swing.JOptionPane;

public class InicioDeUmSonho {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Boas vindas ao Sistema do Restaurante Flamboyant!", "Mensagem",
                JOptionPane.INFORMATION_MESSAGE);
        String menuInicial = "";

        while (!(menuInicial.equals("0") || menuInicial.equals("1") || menuInicial.equals("2")
                || menuInicial.equals("3") || menuInicial.equals("4"))) {
            menuInicial = JOptionPane
                    .showInputDialog(
                            null, "Digite a opção desejada \n" + "1- Cadastrar \n" + "2- Consultar \n"
                            + "3- Alterar  \n" + "4- Excluir  \n" + "0- Finalizar",
                            "Menu", JOptionPane.QUESTION_MESSAGE);
            // JOptionPane.showMessageDialog(null, "A opção escolhida é: " +
            // menuInicial);//acho desnecessário
        }
        switch (menuInicial) { 
            case "1":
                 Produto.cadastraProduto();// caso seja 1 mostre:.. depois "quebre"//
                break;
            case "2":
            Produto.consultaProduto();
                break;
            case "3":
              Produto.consultaParaAlterar();
                break;
            case "4":
               Produto.Excluir();
                break;
            default:
                break;
        }

    }

}
