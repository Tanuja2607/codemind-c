#include<stdio.h>
int main()
{
    int t;
    scanf("%d",&t);
    for(t=1;t<=2;t++)
    {
        int n,m,k;
    scanf("%d%d%d",&n,&m,&k);
    if(m>=n+k)
    {
        printf("YES
");
    }
    else
    {
        printf("NO
");
    }
    }
}
