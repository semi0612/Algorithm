#include <iostream>

using namespace std;

int main(void) {
    int N=0;
    
    cin >> N;
    
    for (int i=1; i<10; i++){
        cout << N << " * " << i << " = " << N*i <<endl;
    }
}

//생각없이 했다가 컴파일 오류나고 난리났었음
//생각 좀 하고 살아라
