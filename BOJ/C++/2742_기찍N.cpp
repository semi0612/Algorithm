#include <iostream>

int main() {
	int N;
	scanf("%d", &N);
	
	for (int i=N; i>0; --i){
		printf("%d \n", i);
	}
	return 0;
}

------------------------------

#include <iostream>

int main() {
	int N;
	scanf("%d", &N);
	int num = N+1;
	
	for (int i=1; i<=N; i++){
		num -= 1;
		printf("%d \n", num);
		
	}
	return 0;
}
