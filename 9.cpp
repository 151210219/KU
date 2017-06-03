#include<iostream>
#include<algorithm>
#include<cstdio>
#include<math.h>
using namespace std;
int main()
{
    long long int n;
    long long int a[22000];
    while(scanf("%lld",&n)!=EOF)
    {
        long long int sum=0;
        for(int i=0;i<2*n;i++)
            scanf("%lld",&a[i]);
        sort(a,a+2*n);
        for(int i=0;i<2*n-1;i=i+2)
        {
            sum=sum+abs(a[i]-a[i+1]);
        }
        cout<<sum<<endl;

    }
    return 0;
}