package iniciodeumsonho;

import javax.swing.JOptionPane;

public class InicioDeUmSonho {

    public static void main(String[] args) {

        String menuInicial = "";
        while (!(menuInicial.equals("0")
                || menuInicial.equals("1")
                || menuInicial.equals("2")
                || menuInicial.equals("3")
                || menuInicial.equals("4"))) {
            menuInicial = JOptionPane.showInputDialog(null, "Digite a opção desejada \n"
                    + "1- Cadastrar \n"
                    + "2- Consultar \n"
                    + "3- Alterar  \n"
                    + "4- Excluir  \n"
                    + "0- Finalizar");
            JOptionPane.showMessageDialog(null, "A opção escolhida é: " + menuInicial);
        }
        switch (menuInicial) {
            case "1":
                JOptionPane.showMessageDialog(null, "A opção escolhida é Cadastrar");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "A opção escolhida é Consultar");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "A opção escolhida é Alterar");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "A opção escolhida é Excluir");
                break;
            default:
                break;

        }
    }

}
