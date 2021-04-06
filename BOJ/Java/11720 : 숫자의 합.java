// 풀이 (https://velog.io/@cyhse7/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-11720-%EC%88%AB%EC%9E%90%EC%9D%98-%ED%95%A9)




// 코드 01
Scanner in = new Scanner(System.in);
		 
int N = in.nextInt();
String a = in.next();
in.close();
	
int sum = 0;
       
for(int i = 0; i < N; i++) {
	sum += a.charAt(i)-'0';
}
System.out.print(sum);





// 코드 02
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();

int num = Integer.parseInt(br.readLine());
int sum = 0;

for (byte result : br.readLine().getBytes()) {
	sum += result - '0';
}

sb.append(sum);
System.out.println(sb);
