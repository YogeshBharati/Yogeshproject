package Vending;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SlectProduct {

	public static int goukei = 0;

	public static void Product() throws Exception {

		int sen, gohyaku, hyaku, gojyu, jyu;
		System.out.println("商品を選択してください。");

		System.out.println("-----------------------");
		System.out.println("1:コーラ      :110円");
		System.out.println("2:オレンジ    :120円 ");
		System.out.println("3:リンゴ      :130円 ");
		System.out.println("4:お茶        :140円 ");
		System.out.println("5:サイダー    :150円");
		System.out.println("-------------------------");

		System.out.println("お金を入れてください。");
		System.out.println("------------------------");
		System.out.println("上限金額1990円です。");

		while (true) {
			System.out.print("\n 1000円  = ");

			BufferedReader sen1 = new BufferedReader(new InputStreamReader(System.in));
			String st = sen1.readLine();
			// String st = sen1.readLine();
			try {
				sen = Integer.parseInt(st);
			} catch (Exception e) {
				System.out.println("入力に誤りがあります。");
				continue;

			}
			System.out.print("\n 500円   = ");
			BufferedReader gohyaku1 = new BufferedReader(new InputStreamReader(System.in));
			String st1 = gohyaku1.readLine();
			try {
				gohyaku = Integer.parseInt(st1);
			} catch (Exception e) {
				System.out.print("入力に誤りがあります。");
				continue;
			}
			System.out.print("\n 100円   = ");
			BufferedReader hyaku1 = new BufferedReader(new InputStreamReader(System.in));
			String st2 = hyaku1.readLine();
			try {
				hyaku = Integer.parseInt(st2);
			} catch (Exception e) {
				System.out.println("入力に誤りがあります。");
				continue;
			}
			System.out.print("\n 50円    = ");
			BufferedReader gojyu1 = new BufferedReader(new InputStreamReader(System.in));
			String st3 = gojyu1.readLine();
			try {
				gojyu = Integer.parseInt(st3);
			} catch (Exception e) {
				System.out.print("入力に誤りがあります。");
				continue;
			}
			System.out.print("\n 10円    = ");
			BufferedReader jyu1 = new BufferedReader(new InputStreamReader(System.in));
			String st4 = jyu1.readLine();
			try {
				jyu = Integer.parseInt(st4);
			} catch (Exception e) {
				System.out.println("入力に誤りがあります。");
				continue;
			}
			goukei = (1000 * sen + 500 * gohyaku + 100 * hyaku + 50 * gojyu + 10 * jyu);
			System.out.println("-------------------");
			if (goukei > 1990) {
				System.out.println("上限金額(1990)超えています。");
				continue;
			} else if (sen < 0 || gohyaku < 0 || hyaku < 0 || gojyu < 0 || jyu < 0) {
				System.out.println("入力に誤りがあります。");
				continue;
			} else if (goukei < 110) {
				System.out.println("お金が足りない。");
				continue;
			}

			System.out.println("合計は = " + goukei + "円です。");
			System.out.println("商品買いますか？[Y/N]");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str1 = br.readLine();
			String input = str1.intern();
			if (input == "Y") {
				break;

			}
			if(input == "N") {
				System.out.println(goukei+"円返却します。");
				
			}

			break;

		}

	}

}
