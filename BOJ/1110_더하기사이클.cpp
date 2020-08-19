#include <iostream>

using namespace std;
 
int main(void){
    int number;
    int count = 0;
    int A, B, C , Add;
    
    cin >> number;
    Add = number;
    
    while (Add != number || count==0){
        A = Add / 10;
        B = Add % 10;
        C = (A + B) % 10;
        A = B; B = C;
        Add = A * 10 + B;
        count++;
    }
    cout << count << endl;
}

//틀리고 컴파일 에러나고 혼란하다 혼란해
