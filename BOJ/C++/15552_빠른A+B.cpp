#include <iostream>

using namespace std;

int main() {
	int T, num = 0;
	int A, B;
	scanf("%d", &T);
	
	
	for (int i=1; i<=T; i++){
		scanf("%d %d", &A, &B);
		printf("%d \n", A+B);
	}
	return 0;
}


//cin과 cout를 사용하는 것 보다
//scanf와 printf를 사용하는 것이 시간상 더 빠르다.

//굳이 cin과 cout를 사용하자면 방법은 있다하나 하나하나 이제 알아가는 입장에서
//scanf와 printf를 사용하는 방법을 익히는게 더 나을까.. 싶다.
