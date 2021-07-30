package Bharati;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Arraylist {
	public static ArrayList<Person> personlist = new ArrayList<Person>();
	static int a = 0;
	static int b =0;

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

		int i = 0;
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
		while(true) {
				try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("購入番号入力");
			int num = Integer.parseInt(br.readLine());
				b =personlist.get(num - 1).getStock();
				if(b>0) {
				if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5) {
					System.out.println(personlist.get(num - 1).getItem() + "購入しました。");
					System.out.println(personlist.get(num - 1).getItem()+"在庫1を減らす");
					a = personlist.get(num - 1).getStock();
					
					Statement stmt = c.createStatement();
					String sql1 = "UPDATE `goods` SET `stock`= " + (a -1) + " WHERE id = "+personlist.get(num-1).getId();
					int num1 = stmt.executeUpdate(sql1);
					break;
				}
				else {
					System.out.println("ちゃんと入力しろ");
					continue;
				}
				}else {
					System.out.println("選択した商品売り切れ");
					continue;
				}
					}catch(Exception e) {
						System.out.println("ちゃんと入力しろ");
						continue;
					}
				
				}
		
		}
}
