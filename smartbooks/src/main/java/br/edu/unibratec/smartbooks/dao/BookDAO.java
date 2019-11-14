package br.edu.unibratec.smartbooks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import br.edu.unibratec.smartbooks.bean.Book;
import connection.ConnectionFactory;

public class BookDAO {

	public void registerBook(Book b) {
		java.sql.Connection con = ConnectionFactory.getConnection();
		java.sql.PreparedStatement stmt = null;
		
		System.out.println("Aguardando valores para ser preenchidos");
			try {
				stmt = con.prepareStatement("INSERT INTO BOOK(TITULO)"
						+ "VALUES ('teste')");

				
				stmt.setString(1, b.getTitulo());
				
				
				stmt.executeUpdate();
				System.out.println("Registro inserido com sucesso no banco!");
				JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
			} catch (SQLException e) {
				System.out.println("Erro apresentado ao inserir informações no banco, acione a TI");
				JOptionPane.showMessageDialog(null, "Erro apresentado ao inserir informações no banco, acione a TI");
				e.printStackTrace();
			}
		
	}
	
	public List<Book> readBook(){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		List<Book> book = new ArrayList<>();
		
		try {
			stmt = con.prepareStatement("SELECT * FROM book");
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				Book bk = new Book();
				bk.setTitulo(rs.getNString("titulo"));
				book.add(bk);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
			System.out.println("Conexão finalizada");
		}

		return book;
		
	}
	
}
