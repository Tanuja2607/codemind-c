#include<stdio.h>
int square_area(int);
int main()
{
	int side;
	scanf("%d",&side);
	int res=square_area(side);
	printf("%d",res);
}
int square_area(int a)
{
	int area;
	area=a*a;
	return area;
}

