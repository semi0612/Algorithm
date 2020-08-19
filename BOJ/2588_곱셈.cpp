#include <iostream>

using namespace std;

int main(){
	int A, B = 0;
	cin >> A >> B;
	
	cout << A*(B%10) << endl;
	cout << A*((B/10)%10) << endl;
	cout << A*((B/100)%10) << endl;
	cout << A*B << endl;
}

//괄호도 잘 보자
