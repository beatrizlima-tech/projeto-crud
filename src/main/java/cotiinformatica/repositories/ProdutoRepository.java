package cotiinformatica.repositories;

import cotiinformatica.entities.Produto;
import cotiinformatica.factories.ConnectionFactory;

import java.sql.DriverManager;

public class ProdutoRepository {

    //Atributo
    private ConnectionFactory connectionFactory;

    //Método construtor
    public ProdutoRepository() {
        //Incializando o atributo da classe ConnectionFactory
        connectionFactory = new ConnectionFactory();
    }

    /*
        Método para inserir um produto no banco de dados
     */
    public void inserir(Produto produto) {
        try {

            var connection = connectionFactory.getConnection();

            //Escrevendo o script SQL para inserir um produto no banco de dados
            var statement = connection.prepareStatement("insert into produtos(nome, preco, quantidade) values(?,?,?)");
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPreco());
            statement.setInt(3, produto.getQuantidade());
            statement.execute(); //Executando o comando SQL no banco de dados

            connection.close(); //fechando a conexão com o banco de dados

            System.out.println("\nProduto inserido com sucesso!");
        }
        catch(Exception e) {
            System.out.println("\nErro: " + e.getMessage());
        }
    }

    /*
        Método para atualizar um produto no banco de dados
     */
    public void atualizar(Produto produto) {
        try {

            var connection = connectionFactory.getConnection();

            var statement = connection.prepareStatement("update produtos set nome=?, preco=?, quantidade=? where id=?");
            statement.setString(1, produto.getNome());
            statement.setDouble(2, produto.getPreco());
            statement.setInt(3, produto.getQuantidade());
            statement.setInt(4, produto.getId());

            if(statement.executeUpdate() > 0) {
                System.out.println("\nProduto atualizado com sucesso.");
            }
            else {
                System.out.println("\nNenhum produto foi atualizado. Verifique os dados informados.");
            }

            connection.close();
        }
        catch(Exception e) {
            System.out.println("\nErro: " + e.getMessage());
        }
    }

    /*
        Método para excluir um produto no banco de dados
     */
    public void excluir(Integer id) {
        try {

            var connection = connectionFactory.getConnection();

            var statement = connection.prepareStatement("delete from produtos where id=?");
            statement.setInt(1, id);

            if(statement.executeUpdate() > 0) {
                System.out.println("\nProduto excluído com sucesso.");
            }
            else {
                System.out.println("\nNenhum produto foi excluído. Verifique os dados informados.");
            }

            connection.close();
        }
        catch(Exception e) {
            System.out.println("\nErro: " + e.getMessage());
        }
    }

    /*
        Método para consultar um produto no banco de dados
     */
    public void consultar(){

        try{
            var connection = connectionFactory.getConnection();

            var statement = connection.prepareStatement("select id, nome, preco, quantidade from produtos");
            var result = statement.executeQuery();

            System.out.println("\nConsulta de produtos: \n");

            while(result.next()) {
                System.out.println("Id do produto...: " + result.getInt("id"));
                System.out.println("Nome............: " + result.getString("nome"));
                System.out.println("Preço...........: " + result.getDouble("preco"));
                System.out.println("Quantidade......: " + result.getInt("quantidade"));
                System.out.println("....");

            }

            connection.close();
        }
        catch (Exception e) {
            System.out.println("\nErro: " + e.getMessage());
        }

    }

}