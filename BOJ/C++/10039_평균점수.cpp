#include <iostream>
using namespace std;

int main(void){
	int num=0, sum=0;
	int arr[10]={0};
	
	for (int i=0; i<=4; i++){
		scanf("%d", &arr[i]);
		if(arr[i]<40){
			arr[i]=40;
		}
		sum +=arr[i];
		num = sum/5;
	}
	printf("%d", num);
}
