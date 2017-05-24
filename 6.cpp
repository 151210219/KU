#include <cstdio>  
#include <cstring>  
#include <cstdlib>  
#include <algorithm>  
using namespace std;  
int map[55][55];  
struct Node
{  
    int x;  
    int y;  
}edge[50*52];  
int main()  
{  
    int T;  
    scanf("%d",&T);  
    while(T--)  
    {  
        int i,j,h,l;  
        int sum = 0;  
        int count = 0;  
        scanf("%d%d",&h,&l);  
        for(i=1;i<=h;i++)  
        {  
            map[i][0] = 1;  
            for(j=1;j<=l;j++)  
            {  
                scanf("%d",&map[i][j]);  
                if(map[i][j] != -1)  
                {  
                    edge[map[i][j]].x = i;  
                    edge[map[i][j]].y = j;  
                    if(map[i][j] > count)
		    {  
                        count = map[i][j];  
                    }  
                }  
            }  
        }  
        for(i=1;i<=count;i++)//汽车从小到大出库   
        {  
            int x = edge[i].x;  
            int y = edge[i].y;  
            sum += ((x - 1)* 10 * 2);//电梯 上楼接 再回去从出口把车送出去  ,所以结果*2   
            int res = min(abs(y - map[x][0]),l - abs(y - map[x][0]));   //在同行中 找距离左右两边最近的那个。   
            sum += res * 5;  
            map[x][0] = y;  
        }  
        printf("%d\n",sum);  
    }  
    return 0;  
}  


