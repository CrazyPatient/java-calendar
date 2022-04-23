package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] agrs) {
		// 입력 : 키보드로 두 수의 입력을 받는다
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		String a1, a2;
		a1 = scan.next();
		a2 = scan.next();
		int a,b;
		a = Integer.parseInt(a1);
		b = Integer.parseInt(a2);
		
		// 출력 : 화면에 두 수의 합을 출력한다.
//		int c = a + b;
//		System.out.println("c");
//		System.out.println("두 수의 합은" + (a + b) +"입니다.");
		System.out.printf("%d 와 %d의 합은 %d입니다", a,b, a + b);
		scan.close(); 
	}
}
