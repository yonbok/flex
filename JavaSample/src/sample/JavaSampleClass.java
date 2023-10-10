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
		
		
		int member = (int)(Math.random()*100)+1;
		System.out.println("メンバー数：" + member);
		if(member < 50) {
			System.out.println("50未満です。");
		}else {
			System.out.println("範囲外です。");
		}
		
		
		for(int i = 1;i <= 5;i++) { //for(初期化処理；条件式；増分処理)
			System.out.println(i+" ");
		}
		System.out.println();
		
		
		for(int i = 0;i < 10;i += 2) {
			System.out.println(i+ "");
		}
		System.out.println();
		
		
		
		for(int i = 1;i <= 2;i++) {
			for(int j = 1; j <= 3 ; j++) {
				int k = i + j;
				System.out.print(i+"+" + j + "="+ k + "");
			}
			System.out.println();
		}
		
		
		int i = 0;
		while(i <= 5) {
			System.out.print(i+ "");
			i++;
		}
		System.out.println();
		
		
		int u = 0;
		do {
			System.out.print(u+"");
			u++;
		}while(u <= 5); //セミコロン忘れずに！
		System.out.println();
		
		
//		int y,sum;
//		sum = 1;
		//whileループで実行
//		System.out.print("whileで実行:");
//		y = 1;
//		while(y < sum) {
//			System.out.print("*");
//			y++;
//		}
//		System.out.println();
		//do～whileループで実行
//		System.out.print("do～whileで実行;");
//		y = 1;
//		do {
//			System.out.print("*");
//			y++;
//		}while(y < sum);
//		
		
//		double one,two,three;
//		double sum,avg;
//		one = 1.2;
//		two = 3.7;
//		three = 4.1;
//		System.out.println(one + "" + two + "" + three);
//		sum = one + two + three;
//		avg = sum / 3.0;
//		System.out.println("合計値：" + sum);
//		System.out.println("平均値：" + avg);
//		
//		
//	    for(int r=0;r <=10;r++) {
//	      if(r%2==0) {
//	    	  System.out.println(r);
//	      }
//	    }
		
	    
	    int sum = 0;
	    int count = 0;
	    for(int e=1;e <= 10;e++) {
	    	if(e%2==0) {
	    		sum += e;
	    		count++;
	    	}
	    }
	    System.out.println("1～10までの偶数の合計は" + sum);
    	System.out.println("1～10までの偶数の数は" + count);
		
    	
    	
    	int [] people = {1,2,3,4,5,6,7,8,9,10};
    	for (int t=0;t < people.length; t++) {
    		System.out.print(people[t]);
    		if(people[t] != 10)
    			System.out.print(",");
    	}
    	
    	
    	int year[] = new int[20];
    	String str = "";
    	year[0] = 0;
    	for(int k = 1;k < year.length; k++) {
    		year[k] = year[k - 1] + 5;
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


