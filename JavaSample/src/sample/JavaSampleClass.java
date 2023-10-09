package sample;

public class JavaSampleClass {

	private String name;

	public static void main(String[] args) {
//		int a;
//		double b,c,d;
//		a = (int)1.23;
//		b = 1.23;
//		c = 10;
//		d = (double)c;
//		System.out.println("a=" + a + " b=" + b + " c=" + c +" d=" + d);
//		
		
		String s1,s2,s3;
		s1 = "ABC";
		s2 = "DEF";
		s3 = s1 + s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 + s2);
		System.out.println(s3);
		
		
		//int(integer：整数)
		final int NUMBER = 100;
		final String STRING = "hoge";
		System.out.println(NUMBER);
		System.out.println(STRING);
		//finalが付いた変数は値を変えられない（定数）、一般的に大文字にする
		
		
//		int a = 5,b = 3;
//		System.out.println(a + "-" + b + "=" + (a-b));
//		System.out.println(a + "*" + b + "=" + (a*b));
//		System.out.println(a + "/" + b + "=" + (a/b));
//		
		
//		int a = 1,b = 2,c = 3,d = 4,e = 5;
//		a += 2;
//		b -= 1;
//		c *= 3;
//		d /= 2;
//		e %= 2;
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
//		System.out.println("c=" + c);
//		System.out.println("d=" + d);
//		System.out.println("e=" + e);
//		
		
		int a = -10;
		System.out.println("a=" + a);
		if(a > 0) {
			System.out.println("aは正の数です。");
		}else {
			System.out.println("aは正の数ではありません。");
		}
		
		
		int num = 9;
		if(num == 1) {
			System.out.println("one");
		}else if(num == 2) {
			System.out.println("two");
		}else {
			System.out.println("不適切な値です。");
		}
		
		
		int dice = (int)(Math.random()*7)+1;
		System.out.println("サイコロの目："+dice);//1～7までの乱数を発生させる。
		//値がサイコロの目の範囲かどうか調べる
		if(1 <= dice && dice <= 6) {
			//サイコロの目が偶数か奇数かで処理を分ける
			if(dice == 2 || dice == 4 || dice == 6) {
				System.out.println("丁です。");
			}else {
				System.out.println("半です。");
			}
		}else {
			System.out.println("範囲外の数値です。");
		}
		
		
		int number = 1;
		switch(number) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("不適切な値です。");
		}
		
		
		int team = (int)(Math.random()*10)+1;
		System.out.println("チーム数："+ team);
		if(team >= 5) {
			System.out.println("5以上です。");
		}else {
			System.out.println("範囲外です。");
		}
		
		
		//クラスのオブジェクトを生成
//		JavaSampleClass cl = new JavaSampleClass();
		
		//メンバ変数を参照する
//		String str1 = cl.name;
		
		//メソッドの呼び出し
//		String str2 = cl.JavaSampleMethod();
		
		//結果を出力
//		System.out.println(str1 + str2);
		
	}

//	private String JavaSampleMethod() {
//		// TODO 自動生成されたメソッド・スタブ
//		return null;
		
		
	
	}


