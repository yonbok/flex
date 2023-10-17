package sample;

public class TestClass {

	public static void main(String[] args) {
		// 数値の表示
//		System.out.print(123);
//		System.out.println(456);
		//　文字列の表示
//		System.out.print("abc");
//		System.out.println("def");
		
		// print()では、()内のものを表示した後改行しない
		// println()はその逆
		
		
//		System.out.println(1 + " + " + 1 + " = " + (1+1));
//		System.out.println(2 + "+" + 3 + "=" + (2+3));
//		System.out.println(1 + "+" + 2 + "=" + (1+2));
//	}
//	

		double[] d = new double[3];
		double sum,avg;
		d[0] = 1.2;
		d[1] = 3.7;
		d[2] = 4.1;
		sum = 0.0;
		for(int i = 0; i < d.length; i++) {
			System.out.println(d[i] + "");
			sum += d[i];
		}
		System.out.println();
		avg = sum / 3.0;
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + avg);
		
		
		int n[] = { 5,4,3,2,1 };
		String s[] = {"ABC", "DEF", "GHI"};
		int i;
		//整数型配列変数nの成分表示
		for(i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		//文字列型配列変数nの成分表示
		for(i = 0;i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		
		
		// 多次元配列
		int a[][] = new int[3][4];
		int m,b;
		//二次元配列に値を代入
		for(m = 0; m < a.length; m++) {
			for(b = 0; b < a[m].length; b++) {
				a[m][b] = m + b;
			}
		}
		//成分の表示
		for(m = 0; m < a.length; m++) {
			for(b = 0; b < a[m].length; b++) {
				System.out.print(a[m][b] + " ");
			}
			System.out.println();
		}
		
		
		int c[][] = { {0,1}, {2}, {3,4,5,6} };
		//成分の表示
		for(int v = 0; v < c.length; v++) {
			for(int x = 0; x < c[v].length; x++) {
				System.out.print(c[v][x] + " ");
			}
			System.out.println();
		}
		
		
		int j = 10;
		String k = "field";
		//メソッド
       record add(int t, int u) {
			return t + u;
		}
		add(String k) {
			return this.k + k;
		}
		void showNum() {
			System.out.println("j = " + j);
		}
	
	}

	public int add(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public void showNum() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
