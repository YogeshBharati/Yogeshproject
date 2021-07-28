package arraylst;

public class Mondai_4 {

	public static void main(String[] args) {
		 //0～9までのランダムな値をaに代入してくれる命令ですo
		//for(int a1 = 0;a1<10;a1++) {
		
        int a = new java.util.Random().nextInt(10);
        System.out.println("a = " + a);
        //ここからプログラムを書いていきます。
        if(a%2==0) {
        	System.out.println("a は偶数です。");
        }
        else {
        	System.out.println("a 奇数です。");

        }

	}
}
