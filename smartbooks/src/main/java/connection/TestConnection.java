package connection;

import br.edu.unibratec.smartbooks.dao.BookDAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import br.edu.unibratec.smartbooks.model.*;

public class TestConnection {

	public static void main (String...args) {
		ConnectionFactory.getConnection();
		BookDAO bkd = new BookDAO();
		
		bkd.readBook();
	}
	
}
