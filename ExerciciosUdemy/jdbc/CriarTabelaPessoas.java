package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
					+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
					+ "nome VARCHAR(80) NOT NULL)";
		
		String sql2 = "INSERT INTO pessoas"
					+ "(nome)"
					+ "VALUES "
					+ "('J�o');";
				
		Statement stmt = conexao.createStatement();
		stmt.execute(sql2);
		
		System.out.println("Tabela criada com sucesso!!!");
		conexao.close();
	}

}