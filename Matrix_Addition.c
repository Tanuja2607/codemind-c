#include<stdio.h>
int main()
{
    int r,c;
    scanf("%d%d",&r,&c);
    int a[r][c],i,j;
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    int r2,c2;
    scanf("%d%d",&r2,&c2);
    int b[r2][c2];
    for(i=0;i<r2;i++)
    {
      for(j=0;j<c2;j++)
      {
          scanf("%d",&b[i][j]);
      }
    }
    for(i=0;i<r;i++)
    {
        for(j=0;j<c2;j++)
        {
            printf("%d ",a[i][j]+b[i][j]);
        }
        printf("
");
}
}