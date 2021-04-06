// 풀이 (https://velog.io/@cyhse7/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-8958-OX-%ED%80%B4%EC%A6%88)

// 풀이01
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 크기를 사용자에게 받는다
		String[] input = new String [Integer.parseInt(br.readLine())];
		
		// for문을 돌리면서 배열에 내용물 넣기
		for(int i=0; i<input.length; i++) {
			input[i] = br.readLine();
		}
		
		// 배열길이만큼 돌면서 검사할것이라는 for 문
		// 줄 단위로 넘겨줄 for 문
		for(int i=0; i<input.length; i++) {
			// 한줄 검사하고 다음 줄 검사로 넘어갈 때마다
			// 누적된 값을 초기화 해주어야 하니 여기에 변수 설정
			int cnt = 0;
			int sum = 0;
			// 한 줄에서 'O' 가 있는지 검사하는 for문
			for(int j=0; j<input[i].length(); j++) {
				// 만약 줄을 검사하변서 'O'가 있다면 cnt에 +1을 해주어라
				if (input[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}



// 풀이 02
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// StringBuilder를 사용해주기 위해 선언한다.
		StringBuilder sb = new StringBuilder();
		
		// 첫번째로 ox 문제가 몇 줄 들어올 건지 입력한다 했으니
		// for문을 돌릴 횟수(숫자)를 받는다.
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			// 돌릴때마다 초기화 해주기 위해 여기에 선언 및 초기화
			int cnt = 0; 
			int sum = 0;
			// ox를 받는데 그걸 Byte화 시켜서 result에 넣는다.
			for (byte result : br.readLine().getBytes()) {
				// 만약 result에 'O'가 있다면 cnt에 +1
				if (result == 'O' ) {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			// StringBuilde에 sum을 넣어주고
            		// 출력할때 줄 단위로 각각 나오도록 개행('n')
			sb.append(sum).append('\n');
		}
		// 조작한 문자열을 넣어준다.
		System.out.println(sb);
	}
}
