#include <iostream>
using namespace std;

int main() {
    int A, B;

    cin >> A >> B;
    cout << fixed;
    cout.precision(1);
    double avg = (double)(A + B) /2;

    cout << A+B << " " << avg;
    return 0;
}