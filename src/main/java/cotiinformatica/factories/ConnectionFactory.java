package cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    /*
        Método para retornar uma conexão com o banco de dados
     */
    public Connection getConnection(){
        try{
            //Definindo as variáveis para conexão com o banco de dados
            var host = "jdbc:mysql://localhost:3307/bd_produtos" //endereço do servidor e o nome do banco de dados
                    + "?useSSL=false" //não usar conexão SSL (Criptografia de rede)
                    + "&serverTimezone=America/Sao_Paulo" //fuso horário de São Paulo
                    + "&allowPublicKeyRetrieval=true"; //autenticação padrão (usuário e senha)
            var user = "coti";
            var pass = "coti";

            //Abrindo conexão com o banco de dados
            var connection = DriverManager.getConnection(host, user, pass);

             //Retornando a conexão com o banco de dados
            return connection;
        }
        catch (Exception e) {
            System.out.println("\nFalha ao abrir conexão com o MySQL");
            return null; //vazio
        }
    }
}
