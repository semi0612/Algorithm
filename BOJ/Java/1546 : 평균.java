// 풀이 (https://velog.io/@cyhse7/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-1546-%ED%8F%89%EA%B7%A0)

public class Home {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int num = Integer.parseInt(br.readLine());
		double scores[] = new double[num];

		// 한 줄에 구분자를 경계로 여러 값을 입력할 것이기 때문에 
		// 공란을 경계로 값을 입력 받을 것이다
		// StringTokenizer 객체 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<scores.length; i++) {
			// 배열에 직접 버퍼리더를 불러와 넣는것이 아닌
			// 토큰을 불러와서 값을 넣어준다.
			scores[i] = Double.parseDouble(st.nextToken());
		}
		
		double maxScore = Arrays.stream(scores).max().getAsDouble();
		double sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += ((scores[i]/maxScore)*100);
		}
 	}
}
