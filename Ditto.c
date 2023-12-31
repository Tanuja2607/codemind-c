#include<stdio.h>
#include<math.h>
int main()
{
    int x,y,p;
    scanf("%d%d%d",&x,&y,&p);
    int z=abs(x-y);
    if(z % p == 0 && z / p %2 == 0)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }
}