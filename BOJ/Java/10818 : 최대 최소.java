import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int arr[] = new int[num];
        
        // 배열의 길이만큼 돌면서 i에 입력값을 받는다
        for (int i=0; i<arr.length; i++) {
        	arr[i] = sc.nextInt();
        }
        
        // sort를 사용해 배열을 정렬한다
        Arrays.sort(arr);
        // 정렬된 배열의 가장 작은 수
        // 0번 인덱스의 것 = min 값
        // 배열길이 -1 인덱스의 것 = max 값
        System.out.println(arr[0] + " " + arr[num - 1]);
	}
}
