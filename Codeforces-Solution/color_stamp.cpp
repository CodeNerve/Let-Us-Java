#include <bits/stdc++.h>
#include <math.h>
typedef long long ll;

using namespace std;

void solv()
{
    ll size;
    cin >> size;
    string str;
    cin >> str;
    

    for (int i = 0; i < size; i++)
    {
        if (str[i] != 'W')
        {
            int j = i, fr = 0, fb = 0;
            while (j < size && str[j] != 'W')
            {
                if (str[j] == 'R')
                    fr++;
                else if (str[j] == 'B')
                    fb++;

                j++;
            }
            if (fr == 0 || fb == 0)
            {
                cout << "NO" << endl;
                return;
            }

            i = j - 1;
        }
    }

    cout << "YES" << endl;
}

int main()
{
    ll no_of_cases;
    cin >> no_of_cases;
    auto start_time = clock();
    for (ll i = 0; i < no_of_cases; i++)
    {

        solv();
    }
    auto end_time = clock();
    cout << "Total time taken is: " << (end_time - start_time) << "ms" << endl;
    return 0;
}