package cotiinformatica.controllers;

import cotiinformatica.entities.Produto;
import cotiinformatica.repositories.ProdutoRepository;

import java.util.Scanner;

public class ProdutoController {

    /*
        Método para que o usuário possa cadastrar um produto
        preenchendo os dados através do console / terminal
     */
    public void cadastrarProduto() {

        var scanner = new Scanner(System.in);
        var produto = new Produto();

        System.out.print("Informe o nome do produto..: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Informe o preço............: ");
        produto.setPreco(Double.parseDouble(scanner.nextLine()));

        System.out.print("Informe a quantidade.......: ");
        produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

        var produtoRepository = new ProdutoRepository();

        produtoRepository.inserir(produto);
        produtoRepository.consultar();
    }


    /*
        Método para que o usuário possa consultar um produto
        preenchendo os dados através do console / terminal
     */
    public void atualizarProduto() {

        var scanner = new Scanner(System.in);
        var produto = new Produto();

        System.out.print("Informe o id do produto.......: ");
        produto.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Informe o nome do produto...: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Informe o preço................: ");
        produto.setPreco(Double.parseDouble(scanner.nextLine()));

        System.out.print("Informe a quantidade...........: ");
        produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

        var produtoRepository = new ProdutoRepository();

        produtoRepository.atualizar(produto);
        produtoRepository.consultar();
    }

    /*
    Método para que o usuário possa exclusão de um produto
    preenchendo os dados através do console / terminal
 */
    public void excluirProduto() {

        var scanner = new Scanner(System.in);

        System.out.print("Informe o id do produto.......: ");
        var id = (Integer.parseInt(scanner.nextLine()));

        var produtoRepository = new ProdutoRepository();

        produtoRepository.excluir(id);
        produtoRepository.consultar();
    }

}
