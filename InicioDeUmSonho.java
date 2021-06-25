package iniciodeumsonho;

import javax.swing.JOptionPane;

public class InicioDeUmSonho {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
            null,
            "Boas vindas ao Sistema do Restaurante Flamboyant!",
            "Mensagem",
            JOptionPane.INFORMATION_MESSAGE
        );
        String menuInicial = "";

        while (true) {
            while (!(
                menuInicial.equals("0")
                || menuInicial.equals("1")
                || menuInicial.equals("2")
                || menuInicial.equals("3")
                || menuInicial.equals("4")
            )) {
                menuInicial = JOptionPane.showInputDialog(
                    null,
                    "Digite a opção desejada\n"
                    + "1- Cadastrar\n"
                    + "2- Consultar\n"
                    + "3- Alterar\n"
                    + "4- Excluir\n"
                    + "0- Finalizar",
                    "Menu",
                    JOptionPane.QUESTION_MESSAGE
                );
            }
    
            switch (menuInicial) {
                case "1":
                    // caso seja 1 mostre:.. depois "quebre"//
                    Produto.cadastraProduto();
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

            menuInicial = "";
        }
    }
}
