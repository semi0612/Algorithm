// 풀이 (https://velog.io/@cyhse7/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-3052-%EB%82%98%EB%A8%B8%EC%A7%80)

// 1. 중복값 체크를 for문으로 돌리기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 사용자의 입력 값을 받을 배열
		int num1[] = new int[10];
		// 나머지를 넣어줄 배열
		double num2[] = new double[10];
		// 출력해줄 cnt
		int cnt = 0 ;
		
		// 사용자에게 값을 입력 받는다 
		for (int i=0; i<num1.length; i++) {
			num1[i] += Integer.parseInt(br.readLine());
			num2[i] += num1[i] % 42;
		}

		 
		// for문을 돌리면서 동일 값을 찾는다
		for (int i = 0; i < num2.length; i++) {
			// 돌릴때마다 초기화 해주어야 한다
			int cnt1 = 0;
			// 1번부터 2~9번을 비교하고
			// 2번부터 3~9번을 비교해야 값이 원하는 대로 나올 것
			for (int j = (i+1); j < num2.length; j++) {
				if (num2[i] == num2[j]) {
					cnt1++;
				}
			}
			// j를 다 돌렸음에도 cnt1에 값이 없다는 말은
			// 값이 같은게 하나도 없다는 말이고
			// 그러하니 출력해줄 cnt에 ++를 해준다
			if (cnt1 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}




// 2. boolean 배열을 이용
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 나머지가 나올 수 있는 수는 0~41 이므로 크기를 42로 잡는다
		boolean[] arr = new boolean[42];

		// 10개의 숫자를 받겠다 범위 설정하기
		for (int i = 0; i < 10; i++) {
			// 숫자를 받아서 42로 나눈 나머지를 arr에 넣어주고
			// 나머지 값의 index 을 true로 변경해준다
			// 나머지 값의 중복있어도 이미 true로 변한 인덱스가 false가 되진 않으니까
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}

		// 향상된 for문
		// arr배열에 있는 값을  value 변수에 저장하고
		// value 변수가 true라면 cnt++를 해준다
		int cnt = 0;
		for (boolean value : arr) {
			if (value) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
