#include<iostream>
using namespace std;
int main()
{
    int a;
    while(cin>>a)
    {
        if(a==1)
        {
            cout<<"1"<<endl;
            continue;
        }
        int b=0;
        if(a%2!=0)
        {
            a=a-1;
            b=b+1;
        }
        while(1)
        {
            if(a==1)
                break;
            if(a%2==0)
            {
                a=a/2;
            }
            else
            {
                a=a-1;
                a=a/2;
                b=b+1;
            }
        }
    cout<<b+1<<endl;
    }
    return 0;
}