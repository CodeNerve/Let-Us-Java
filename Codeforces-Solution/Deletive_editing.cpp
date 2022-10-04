
//https://codeforces.com/problemset/problem/1666/D




#include <bits/stdc++.h>
#include <math.h>
typedef long long ll;

using namespace std;

void solv(ll testcase)
{
    string str1, str2;
    cin >> str1 >> str2;
    size_t found = str1.length();
    reverse(str1.begin(), str1.end());
    // cout<<str1<<endl;
    for (ll i = 0; i < str2.length(); i++)
    {
        char c = str2[i];
        string temp = str1.substr(0, found);
        found = temp.find(c)+1;
        cout<<found<<" ";
        if (found == string::npos)
        {
            cout << "NO" << endl;
            return;
        }
    }
    cout<<"YES"<<endl;
}

int main()
{
    ll no_of_cases;
    cin >> no_of_cases;
    auto start_time = clock();
    for (ll i = 0; i < no_of_cases; i++)
    {

        solv(i);
    }
    auto end_time = clock();
    // cout<<"Total time taken is: "<<(end_time-start_time)<<"ms"<<endl;
    return 0;
}
