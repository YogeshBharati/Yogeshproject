package Vending;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static Connection main(String[] args) throws Exception {
		Connection c = null;
		String url = "jdbc:mysql://localhost:3306/vending";
		String username = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 c =DriverManager.getConnection(url,username,password);
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
		
		public static void screen() throws Exception {
			Connection c = main(null);
		String str = "select *from goods";
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(str);
	
//			String name = "商品番号　:"+rs.getInt(1)+" 商品名　:" + rs.getString(2)+"\n値段 : "+rs.getInt(3)+"円\n";
//			System.out.println(name);
//		}
	
		}
	
}
