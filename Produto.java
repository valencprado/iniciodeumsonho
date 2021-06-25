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

    public static void cadastraProduto() {
        Produto p1 = new Produto();

        p1.NomeProduto = JOptionPane.showInputDialog("Digite o nome do produto.");
        p1.CodProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto."));
        arrayProduto.add(p1);

    }

    static void consultaProduto() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto."));
        Produto produtoAchado = null;
        for (Produto p : Produto.arrayProduto) {
            if (p.CodProduto == codigo) {
                produtoAchado = p;
                break;
            }
        }
        if (produtoAchado == null) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar!");
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Nome: " + produtoAchado.NomeProduto + "\n"
                    + "Código: " + produtoAchado.CodProduto);
        }
    }

    static void consultaParaAlterar() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto."));
        Produto produtoAchado = null;
        for (Produto p : Produto.arrayProduto) {
            if (p.CodProduto == codigo) {
                produtoAchado = p;
                break;
            }
        }
        if (produtoAchado == null) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar!");
        } else {
            String op = JOptionPane.showInputDialog("O que deseja alterar?\n"
                    + "1- Alterar nome\n"
                    + "2- Alterar código");
            switch (op) {
                case "1":
                    produtoAchado.NomeProduto = JOptionPane.showInputDialog("Digite o nome do produto.");
                    break;
                case "2":
                    produtoAchado.CodProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto."));
            }

        }

    }

    static void Excluir() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto."));
        Produto produtoAchado = null;
        for (Produto p : Produto.arrayProduto) {
            if (p.CodProduto == codigo) {
                produtoAchado = p;
                break;
            }
        }
        if (produtoAchado == null) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar!");
        } else {
            Produto.arrayProduto.remove(produtoAchado);
        }
    }
}
