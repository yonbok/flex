package sample;

public class JavaSampleClass {

	private String name;

	public static void main(String[] args) {
		//クラスのオブジェクトを生成
		JavaSampleClass cl = new JavaSampleClass();
		
		//メンバ変数を参照する
		String str1 = cl.name;
		
		//メソッドの呼び出し
		String str2 = cl.JavaSampleMethod();
		
		//結果を出力
		System.out.println(str1 + str2);
		
	}

	private String JavaSampleMethod() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}

