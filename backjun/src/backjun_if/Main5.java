package backjun_if;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int H = s.nextInt(); 
		
		int M  =s.nextInt() + 45;
		
		
		if(H > 23 && M >= 60) {  // 시간에 24, 분에60이 넘는 인자가 들어갈 경우 시간을 0, 분을0으로 리셋
			System.out.println(H-24); //즉 인자 24, 60을 0, 0으로 리셋후 분에 +45
			System.out.println(M-60);
		}else if(H <= 23 & M <= 60) { //시간이 23, 분이 60과 같거나 작을때 시간은 그대로 출력 분에만 +45
			System.out.println(H);	
			System.out.println(M);
		}else if(H < 23 & M >= 60) { //시간이 23보다 작고 분이 60보다 크거나 같을때 시간에+1 분은 0으로 리셋
			System.out.println(H+1); //즉 60분에서 넘어가지 않도록 분을 리셋 후 시간에 +1
			System.out.println(M-60);
		}else if(H <= 23 & M >= 60) { //시간이 23보다 작거나 같을 때, 분이 60보다 크거나 같을 때 들어온 인자 24와 60을 0으로 리셋
			System.out.println(H-23); //즉 인자 23,60을 0,0으로 리셋후 분에 45+
			System.out.println(M-60);
		}
	}
	}

