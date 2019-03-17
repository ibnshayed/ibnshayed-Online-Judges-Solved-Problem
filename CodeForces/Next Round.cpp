#include <iostream>
#include <cstdio>

using namespace std;

int main()
{

    int n,k,mx,cnt = 0;

    while(scanf("%d%d",&n,&k) != EOF)
    {
        int a[n];

        for(int i = 1; i<=n; i++)
        {
            cin>>a[i];
            if(i == k) mx = a[i];
        }
        for(int i = 1; i<=n; i++)
        {
            if(a[i] >= mx && a[i] > 0) cnt++;
        }
        cout<<cnt<<endl;
    }

}