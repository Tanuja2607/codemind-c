#include<stdio.h>
int main()
{
    float x,y,res;
    scanf("%f%f",&x,&y);
    res=(x-y)/x*100;
    printf("%.2f",res);
}