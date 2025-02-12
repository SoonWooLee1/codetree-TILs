#include <iostream>
using namespace std;

int main() {
    int cho = 13;
    cout << fixed;
    double moon = 0.165;
    cout.precision(6);
    cout << cho << " * " << moon << " = " << cho*moon;
    return 0;
}