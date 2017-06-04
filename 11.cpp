#include<bits/stdc++.h>
#define F(i,a,b) for(int i=a;i<=b;++i)
using namespace std;

const int N=2007;

char a[N];

int main()
{
    gets(a);
    int len=strlen(a),ans=0;
    F(i,0,len-1)//ÆæÊý
    {
        int l=i,r=i;
        while(l>0&&r<len-1&&a[l-1]==a[r+1])l--,r++;
        ans=max(ans,r-l+1);
    }
    F(i,0,len-1)//Å¼Êý
    {
        int l=i,r=i+1;
        if(a[l]!=a[r])continue;
        while(l>0&&r<len-1&&a[l-1]==a[r+1])l--,r++;
        ans=max(ans,r-l+1);
    }
    printf("%d\n",ans);
    return 0;
}
