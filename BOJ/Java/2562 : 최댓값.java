import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
            	// 9개의 입력이라 주어졌으니
		// 크기에 맞게 배열 선언
        	int num[] = new int[9];
		int count = 0;
		int cnt = 0;
        	// 왕창 작은 값을 줘야 적당한 음수가 들어갔을 때도
            	// 원하는 대로 입력되고 출력될 것이라 생각되어
		int max = -9999;
		
		for (int i=0; i<num.length; i++) {
			num[i] += sc.nextInt();
		}

		for (int i=0; i<num.length; i++) {
			count++;
			if (max < num[i]) {
				max = num[i];
				cnt = count;
			} else {
				continue;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}
}
