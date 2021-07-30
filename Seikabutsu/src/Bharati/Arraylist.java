package Bharati;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Arraylist {
	public static ArrayList<Person> personlist = new ArrayList<Person>();

	public static void main(String[] args) throws Exception {

		Connection c = null;
		String url = "jdbc:mysql://localhost:3306/vending";
		String user = "root";
		String pass = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "select *from goods";
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(sql);

		
		int i=0;
		while (rs.next()) {
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setItem(rs.getString("item"));
			person.setPrice(rs.getInt("price"));
			person.setStock(rs.getInt("stock"));
			
			personlist.add(person);
			
			System.out.print("商品番号 :" + personlist.get(i).getId() + " ");
			System.out.print("商品名 :" + personlist.get(i).getItem() + " ");
			System.out.print("商品価格 :" + personlist.get(i).getPrice() + " ");
			System.out.print("在庫数 :" + personlist.get(i).getStock() + " ");
			System.out.println("");
			i++;
			

		}
		

	}

}
