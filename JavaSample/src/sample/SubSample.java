package sample;

public class SubSample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("ナンバー：" + num);
			if(num >= 5) {
				System.out.println("5以上です。");
			}else
				System.out.println("範囲外です。");
			
			
			
		int team = (int)(Math.random()*100)+1;
		System.out.println("チーム数：" + team);
		if(team <= 10 || team >= 90) {
			System.out.println("10以下か90以上の値です。");
		}else
			System.out.println("範囲外です。");
		
		
		
		int book = (int)(Math.random()*10)+1;
		int text = (int)(Math.random()*10)+1;
		System.out.println("本の数：" + book);
		System.out.println("教科書の数：" + text);
		if(book > text) {
			System.out.println("本の数の方が多いです。");
		}else if(text > book){
			System.out.println("教科書の数の方が多いです。");
		}else{
			System.out.println("本の数と教科書の数は同じです。");
		}
		System.out.println();
		
		
		
		int group = (int)(Math.random()*100)+1;
		System.out.println("グループ数：" + group);
		if(group % 2 == 0) {
			System.out.println("2の倍数です。");
		}else if(group % 3 == 0) {
			System.out.println("3の倍数です。");
		}else if(group % 2 ==0 && group % 3 == 0) {
			System.out.println("2と3の公倍数です。");
		}else
			System.out.println("範囲外です。");
		System.out.println();
		
		
		
		int month = (int)(Math.random()*100)+1;
		System.out.println("月数：" + month);
		if(month <= 50) {
			System.out.println("50以下です。");
		}else if(month % 2 == 0) {
			System.out.println("偶数です。");
		}else if(month <= 50 && month % 2 == 0) {
			System.out.println("50以下の偶然です。");
		}else {
			System.out.println("範囲外です。");
		}
		System.out.println();
		
		
		
        int day = (int)(Math.random()*10)+1;
        System.out.println("日にち：" + day);
        for(int d = 1; d <= day; d++) {
        	System.out.print("■");
        }
	}

}
