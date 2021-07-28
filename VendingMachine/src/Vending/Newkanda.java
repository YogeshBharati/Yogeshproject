package Vending;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Newkanda {
	static Vector vec = new Vector();
	public static Connection connect() throws Exception {
		Connection k= null;
		String url = "jdbc:mysql://localhost:3306/jdouki";
		String username = "root";
		String password = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 k =DriverManager.getConnection(url,username,password);
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return k;
	}
	public static void gamen() throws Exception {
		Connection k = connect();
		String str = "select *from goods";
		Statement st = k.createStatement();
		ResultSet rs = st.executeQuery(str);
		while(rs.next()) {
			vec.add(rs.getInt(1));
			vec.add(rs.getString(2));
			vec.add(rs.getInt(3));
			vec.add(rs.getInt(4));
			String name = "商品番号　:"+rs.getInt(1)+"商品名："+rs.getString(2)+"価格　:"+rs.getInt(3)+"在庫　:"+rs.getInt(4);
			System.out.println(name);
			
		}
	}

}
