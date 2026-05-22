package cotiinformatica;

import cotiinformatica.controllers.ProdutoController;

import java.util.Scanner;

public class Main {

    static void main() {

        var produtoController = new ProdutoController();
        var scanner = new Scanner(System.in);

        System.out.println("(1) Cadastrar produto");
        System.out.println("(2) Atualizar produto");
        System.out.println("(3) Excluir produto");

        System.out.print("\nInforme a opção desejada: ");
        var opcao = Integer.parseInt(scanner.nextLine());

        switch(opcao) {
            case 1:
                produtoController.cadastrarProduto();
                break;
            case 2:
                produtoController.atualizarProduto();
                break;
            case 3:
                produtoController.excluirProduto();
                break;
            default:
                System.out.println("\nOpção inválida!");
        }
    }
}
