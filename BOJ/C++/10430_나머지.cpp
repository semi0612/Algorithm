#include <iostream>

using namespace std;

int main(){
	int A, B, C = 0;
	cin >> A >> B >> C;
	
	if (A >= 2; C <= 10000) {
		cout << (A+B)%C << endl;
		cout << ((A%C) + (B%C))%C << endl;
		cout << (A*B)%C << endl;
		cout << ((A%C) * (B%C))%C << endl;
	}
	else {
		return 0;
	}
}
