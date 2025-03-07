#include <iostream>
using namespace std;

int main() {
    int chu = 13; double moon = 0.165;
    cout << fixed;
    cout.precision(6);
    cout << chu << " * " << moon << " = " << (double)chu * moon;
    return 0;
}