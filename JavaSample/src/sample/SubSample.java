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
        System.out.println();
        
        
        int year = (int)(Math.random()*10)+1;
        System.out.println("年数：" + year);
        int y = 1;
        while(y <= year) {   //while文はfor文の()の中を分解
        	System.out.print("■");
        	y++;
        }
        System.out.println();
        
        
        int skz = (int)(Math.random()*10)+1;
        System.out.println("すきず：" + skz);
        int s = 1;
        do {       //do~while文はwhileで囲むところをdoで囲む
        	System.out.print("■");
        	s++;
        }while(s <= skz);  //while文の一行目
        System.out.println();
        
        
        int r = 0;
        while(r <= 3) {
        	System.out.println("r=" + r);
        	r++;
        }
        System.out.println();
        
        
        for(int f = 0; f <= 3; f++) {
        	System.out.println("f=" + f);
        }
        System.out.println();
        
        
        
        int g = 3;
        while(0 <= g) {
        	System.out.println("g=" + g);
        	g--;
        }
        System.out.println();
        
        
        
        while(true) {
        	int ship = (int)(Math.random()*10)+1;
        	System.out.println(ship);
        	if(ship == 10) {
        		break;
        	}
        }
        System.out.println("終了します。");
        System.out.println();
        
        
        
        while(true) {
        	int car = (int)(Math.random()*100)+1;
        	System.out.println(car);
        	if(car % 10 == 0) {
        		break;
        	}
        }
        System.out.println("終了します。");
        System.out.println();
        
        
        
        int[]date = new int[100];
        for(int j =0; j < 5; j++) {
        	date[j] = (int)(Math.random()*100)+1;
        }
        for(int j = 0; j < 5; j++) {
        	System.out.println(date[j]);
        }
        System.out.println();
        
        
        
        for(int c = 1; c <= 9; c++) {
        	for(int d = 1; d <= 9; d++) {
        		int e = c * d;
        		System.out.print(c + "×" + d + "=" + e +" ");
        	}
        	System.out.println();
        }
        	
        
        
        int w[] = { 5,4,3,2,1 };
        String q[] = {"私", "たえちゃん", "かっちゃん", "パパ", "ママ" };
        int m;
        for(m = 0; m < w.length; m++) {   // (配列変数名).length == 配列変数の成分の数
        	System.out.print(w[m] + " ");
        }
        System.out.println();
        for(m = 0; m < q.length; m++) {
        	System.out.print(q[m] + " ");
        }
        System.out.println();
        
        
        
        // 二次元配列
        int o[][] = new int[3][4];
        int i,u;
        for(i = 0; i < o.length; i++) {
        	for(u = 0; u < o[i].length; u++) {
        		o[i][u] = i + u;
        	}
        }
        for(i = 0; i < o.length; i++) {
        	for(u = 0; u < o[i].length; u++) {
        		System.out.print(o[i][u] + " ");
        	}
        	System.out.println();
        }
        
        
        
        int live = (int)(Math.random()*10)+1;
        System.out.println("ライブ回数：" + live);
        if(5 <= live) {
        	System.out.println("5以上です。");
        }else {
        	System.out.println("5より少ないです。");
        }
        System.out.println();
        
        
        
        int music = (int)(Math.random()*10)+1;
        System.out.println("音楽の数：" + music);
        if(1 != music) {
        	System.out.println("1ではありません。");
        }else {
        	System.out.println("1です。");
        }
        System.out.println();
        
        
        int bowl = (int)(Math.random()*100)+1;
        System.out.println("ボウルの数：" + bowl);
        if(bowl <=10 | 90 <= bowl) {
        	System.out.println("10以下か90以上の値です。" );
        }else {
        	System.out.println("規定範囲外です。");
        }
        System.out.println();
        
        
        
        int age = (int)(Math.random()*10)-1;
        System.out.println("年齢：" + age);
        if(age < 0) {
        	System.out.println("負の数です。");
        }else if(0 < age) {
        	System.out.println("正の数です。");
        }else {
        	System.out.println("0です。");
        }
        System.out.println();
        
        
        
        int member = (int)(Math.random()*100)+1;
        System.out.println("メンバーの数：" + member);
        if(member % 2 == 0) {
        	System.out.println("2の倍数です。");
        }else if(member % 3 == 0) {
        	System.out.println("3の倍数です。");
        }else if(member % 2 == 0 & member % 3 == 0) {
        	System.out.println("2と3の公倍数です。");
        }
        System.out.println();
        
        
        
        int tempurture = (int)(Math.random()*35)-1;
        System.out.println("摂氏" + tempurture + "度");
        if(30 <= tempurture) {
        	System.out.println("真夏日です。");
        }else if(25 <= tempurture & tempurture< 30) {
        	System.out.println("夏日です。");
        }else if(tempurture < 0) {
        	System.out.println("真冬日です。");
        }else {
        	System.out.println("問題ありません。");
        }
        System.out.println();
        
        
        
        int sea = (int)(Math.random()*10)+1;
        System.out.println("数：" + sea);
        for(int h = 1; h <= sea; h++) {
        	System.out.print("■");
        }
        System.out.println();
        
        
        int river = (int)(Math.random()*10)+1;
        System.out.println("三角：" + river);
        int j = 1;
        while(j <= river) {
        	System.out.print("▽");
        	j++;
        }
        System.out.println(" ");
        
        
        int sun = (int)(Math.random()*10)+1;
        System.out.println("丸：" + sun);
        int v = 1;
        do {
        	System.out.print("○");
        	v++;
        }while(v <= sun);
        System.out.println(" ");
        
        
        int e = 3;
        while(0 <= e) {
        	System.out.println("e = " + e);
        	e--;
        }
        System.out.println();
        
        
        while(true) {
        	int svt = (int)(Math.random()*13)+1;
        	System.out.println(svt);
        	if(svt == 13) {
        		break;
        	}
        }
        System.out.println("終わり");
        System.out.println();
        
        
        
        while(true) {
        	int cheese = (int)(Math.random()*100)+1;
        	System.out.println(cheese);
        	if(cheese % 10 == 0) {
        		break;
        	}
        }
        System.out.println("完売");
        System.out.println();
        
        
        int star = (int)(Math.random()*10)+1;
        if(5 <= star) {
        	for(int n = 1; n <= star; n++) {
        		System.out.print("★");
        	}
        }else {
        	System.out.println("出た数字：" + star);
        }
        System.out.println();
        
        
        
        int tea = (int)(Math.random()*10)+1;
        if(tea % 2 == 0) {
        	for(int x = 1; x <= tea; x++) {
        		System.out.print("★");
        	}
        }else {
        	for(int t = 1; t <= tea; t++) {
        		System.out.print("☆");
        	}
        }
        System.out.println();
        
        
        
        for(int cafe = 1; cafe <= 100; cafe++) {
        	if(cafe % 10 == 0) {
        		System.out.println(cafe);
        	}else {
        		System.out.print(cafe + " ");
        	}
        }
        System.out.println();
        
        
        for(int juice = 1; juice <= 9; juice++) {
        	for(int latte = 1; latte <= 9; latte++) {
        		System.out.print(juice + "*" + latte + "=" + juice*latte + " ");
        	}
        	System.out.println();       
        }
        
        
        
       
        for(int as = 1; as <= 10; as++) {
        	for(int zx = 9; 1 <= zx; zx--) {
        		if(as != zx) {
        			System.out.print("■");
        		}else {
        			System.out.print("□");
        		}
        	}
        	System.out.println();
        }
        System.out.println();
        
        
        
        for(int dog = 1; dog <= 10; dog++) {
        	for(int cat = 9; 1 <= cat; cat--) {
        		if(dog > cat) {
        			System.out.print("■");
        		}else {
        			System.out.print("□");
        		}
        	}
        	System.out.println();
        }
        
        
        
        int[] dance = { 3,2,1 };
        String danceratya[] = { "leeknow", "hyonjin", "felix" };
        int sd;
        for(sd = 0; sd < dance.length; sd++) {
        	System.out.print(dance[sd] + " ");
        }
        System.out.println();
        for(sd = 0; sd < danceratya.length; sd++) {
        	System.out.print(danceratya[sd] + " ");
        }
        System.out.println();
        
        
        
        int df[][] = new int[3][4];
        int rap,vocal;
        for(rap = 0; rap < df.length; rap++) {
        	for(vocal = 0; vocal < df[rap].length; vocal++) {
        		df[rap][vocal] = rap + vocal;
        	}
        }
        for(rap = 0; rap < df.length; rap++) {
        	for(vocal = 0; vocal < df[rap].length; vocal++) {
        		System.out.print(df[rap][vocal] + " ");
        	}
        	System.out.println();
        }
        System.out.println();
        
        
        
        int bn[][] = { {0,1}, {2}, {3,4,5,6} };
        for(int jk = 0; jk < bn.length; jk++) {
        	for(int dk = 0; dk < bn[jk].length; dk++) {
        		System.out.print(bn[jk][dk] + " ");
        	}
        	System.out.println();
        }
        System.out.println();
        
        
        
	}

}
