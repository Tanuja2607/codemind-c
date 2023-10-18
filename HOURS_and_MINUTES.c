#include<stdio.h>
int main()
{
    int m,n,o;
    scanf("%d",&m);
    n=m/60;
    o=m%60;
    printf("%d Hour(s) %d Minute(s)",n,o);
}