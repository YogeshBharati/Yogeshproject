package Vending;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gamen {
	public static void kanri() throws Exception {
		System.out.println("********************");

		System.out.println("いらっしゃいませ！");
		System.out.println("********************");
		System.out.println("----------------------------");
		System.out.println("\t" + "商品一覧表");
		System.out.println("----------------------------");
		Newkanda.gamen();
		
		System.out.println("購入者画面 [1]" + "\t" + "管理者画面 [2]");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		String num = st.intern();
		String num2 = st.intern();
		while (true) {
			if (num == "1") {
				System.out.println("-------------------------");
				System.out.println("購入画面へ移動しました。");
				System.out.println("-------------------------");

				break;

			}
			if (num == "2") {

				KanriSya.zai();

				}

				break;

			}

		}

	}

