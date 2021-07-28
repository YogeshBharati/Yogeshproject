package Vending;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProductList {
	public static int zai1 = 5;
	public static int zai2 = 5;
	public static int zai3 = 5;
	public static int zai4 = 5;
	public static int zai5 = 5;
	public static int price1 = 110;
	public static int price2 = 120;
	public static int price3 = 130;
	public static int price4 = 140;
	public static int price5 = 150;

	public static void syouhin() throws Exception {
		// int zaiko1;
		int total = 0;
		int otsuri;
		int b;
		// System.out.println(total);
		// System.out.println(price1);

		total = SlectProduct.goukei;
		// System.out.println(total);
		

		while (true) {
			System.out.println("購入商品を選択してください。");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str1 = br.readLine();
			String input = str1.intern();

			if (input == "1" && zai1 > 0) {
				System.out.println("コーラですね！");
				otsuri = total - price1;
				
				// b = zai1 - 1;
				// System.out.println("xaiko"+b);
				System.out.println("----------------------------");


				System.out.println("お釣りは = " + otsuri + "円 です。");
				System.out.println("------------------------------");

				System.out.println("商品また買いますか？[Y/N]");


				break;
			} else if (input == "2" && zai2 > 0) {
				System.out.println("オレンジですね！");
				otsuri = total - price2;
				System.out.println("----------------------------");

				System.out.println("お釣りは = " + otsuri + "円 です。");
				System.out.println("----------------------------");

				System.out.println("商品また買いますか？[Y/N]");


				break;
			} else if (input == "3" && zai3 > 0) {
				System.out.println("リンゴですね！");
				otsuri = total - price3;
				System.out.println("----------------------------");

				System.out.println("お釣りは = " + otsuri + "円 です。");
				System.out.println("----------------------------");

				System.out.println("商品また買いますか？[Y/N]");


				break;

			} else if (input == "4" && zai4 > 0) {
				System.out.println("お茶ですね！");
				otsuri = total - price4;
				System.out.println("----------------------------");

				System.out.println("お釣りは = " + otsuri + "円 です。");
				System.out.println("----------------------------");

				System.out.println("商品また買いますか？[Y/N]");


				break;
			} else if (input == "5" && zai5 > 0) {
				System.out.println("サイダ-ですね！");
				otsuri = total - price5;
				System.out.println("----------------------------");

				System.out.println("お釣りは = " + otsuri + "円 です。");
				System.out.println("----------------------------");


				break;
			} else if (input != "1" && input != "2" && input != "3" && input != "4" && input != "5") {
				System.out.println("１から5までの数字を入力してください。");
				System.out.println();

				continue;
			} else {

				break;
			}
		}

	}

}
