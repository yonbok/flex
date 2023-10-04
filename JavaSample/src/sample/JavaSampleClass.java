package sample;

public class JavaSampleClass {

	public static void main(String[] args) {
		//クラスのオブジェクトを生成
		TestClass cl = new TestClass();
		
		//メンバ変数を参照する
		String str1 = cl.name;
		
		//メソッドの呼び出し
		String str2 = cl.TestMethod();
		
		//結果を出力
		System.out.println(str1 + str2);
		
	}

}

