#include<stdio.h>
int main()
{
    int a,b,c,e,res;
    scanf("%d%d%d",&a,&b,&c);
    e=a*b*c*2*512;
    res=e/1024;
    printf("%d KB",res);
    
}