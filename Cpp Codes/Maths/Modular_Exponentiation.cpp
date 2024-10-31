#include <bits/stdc++.h>
using namespace std;

// Function to perform modular exponentiation
long long modularExpo(long long base, long long exponent, long long mod) {
    long long result = 1;  // Initialize result

    // Update base if it is more than or equal to mod
    base = base % mod;

    while (exponent > 0) {
        // If exponent is odd, multiply base with result
        if (exponent % 2 == 1) 
            result = (result * base) % mod;

        // exponent must be even now
        exponent = exponent >> 1; // Equivalent to exponent / 2
        base = (base * base) % mod; // Change base to base^2
    }
    return result;
}

int main() {
    long long base = 2, exponent = 10, mod = 1000000007;
    cout << "Result of " << base << "^" << exponent << " mod " << mod << " is " 
         << modularExpo(base, exponent, mod) << endl;
    return 0;
}
