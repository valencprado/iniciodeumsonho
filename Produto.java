package iniciodeumsonho;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Produto {
    String NomeProduto;
    int CodProduto;
    static ArrayList<Produto> arrayProduto = new ArrayList();
    public static int indice;
    static String op;
    static int TotalProduto;

    public static void cadastraProduto() 
    {
        Produto p1 = new Produto();

        String NomeProduto = JOptionPane.showInputDialog("Digite o nome do produto.");
        int CodProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto."));
        arrayProduto.add(p1);

    }

    static void consultaProduto() 
    {
        JOptionPane.showMessageDialog(
            null,
            "Nome: " + Produto.arrayProduto.get(indice).NomeProduto + "\n"
            + "Código: " + Produto.arrayProduto.get(indice).CodProduto);
    }

    static void consultaParaAlterar() {
        op = JOptionPane.showInputDialog(
            null,
            "Nome: " + Produto.arrayProduto.get(indice).NomeProduto + "\n"
            + "Código\n"
            + "O que deseja alterar?\n"
            + "1- Nome\n"
            + "2- Código"
        );

        if (op.equals("1")) {
            JOptionPane.showInputDialog("Digite o nome do produto.");

            //diminui o índice pra não ir pro último espaço do vetor
            indice = -1;
        }
    }

    static void Excluir() {
    }
}
