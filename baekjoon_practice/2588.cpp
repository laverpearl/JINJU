#include <iostream>
using namespace std;

int main()
{
    // a=472 b=385 c=3 d=8 e=5
    // vscode에서 c++하려면 단축키 ----> command shift R
    int a;
    int b;
    cin>>a>>b;
    int c = b/100;
    int d = (b/10)%30;
    int e = b%380;

    cout<<a*e<<'\n';
    cout<<a*d<<'\n';
    cout<<a*c<<'\n';
    cout<<a*e+a*d*10+a*c*100;

}