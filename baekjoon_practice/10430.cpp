#include <iostream>
using namespace std;

int main() 
{
    int a,b,c;
    // 한꺼번에 선언가능

    //cin으로 입력받고 cout으로 출력하고
    //나머지 구하는 연산은 %
    cin>>a>>b>>c;
    cout<<(a+b)%c<<'\n';
    cout<<((a%c) + (b%c))%c<<'\n';
    cout<<(a*b)%c<<'\n';
    cout<<((a%c)*(b%c))%c;
    

}
