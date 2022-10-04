//https://codeforces.com/problemset/problem/1230/B

#include <bits/stdc++.h>
using namespace std;

int main()
{
    long long no_of_cases, k;
    string num;
    cin >> no_of_cases >> k >> num;
    if (no_of_cases == 1 && k == 1)
        cout << 0;
    else
    {
        for (long long i = 0; i < no_of_cases; i++)
        {
            if (k > 0)
            {
                if (i == 0 && num[0] != '1')
                {
                    num[i] = '1';
                    k--;
                }
                else if (i > 0 && num[i] != '0')
                {
                    num[i] = '0';
                    k--;
                }
            }
            else
                break;
        }

        for (long long i = 0; i < no_of_cases; i++)
        {
            cout << num[i];
        }
    }

    return 0;
}
