#include<stdio.h>
int main()
{
	int a=10,b=20;
	int *ptr1,*ptr2;
	ptr1=&a;
	ptr2=&b;
	printf("%d",*ptr1+ *ptr2);
}
