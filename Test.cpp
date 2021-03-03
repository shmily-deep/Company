#include<iostream>
using namespace std;
void BinaryRecursion(int n)//二进制输出
{
    int a;
    a = n % 2;
    n = n >> 1;
    if (n == 0)
        ;
    else
        BinaryRecursion(n);
    cout << a;
}
int main() {
    int n;
    cin >> n;
    cout << n << "二级制形式为：";
    BinaryRecursion(n);
    cout << "\n";
    int k;
    cin >> k;
    n = (n ^ (1<<(k-1)));
    cout << "n = " << n<<",二进制形式为：";
    
    BinaryRecursion(n);
    return 0;
}



