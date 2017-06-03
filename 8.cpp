#include<iostream>
#include<cstdio>
#include<cmath>
using namespace std;
int judge(int a)
{
    if(a==1)
        return 0;
    for(int i=2;i<=sqrt(a);i++)
    {
        if(a%i==0)
            return 0;
    }
    return 1;
}
int gcd(int a,int b)
{
    return b==0?a:gcd(b,a%b);
}
int main()
{
    int a,b;
    while(cin>>a)
    {
        if(judge(a)==1)
        {
            cout<<a-1<<endl;
        }
        else
        {
            b=1;
            for(int i=2;i<a;i++)
            {
                if(gcd(i,a)==1)
                    b++;
            }cout<<b<<endl;
        }

    }
    return 0;
}
