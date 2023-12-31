#include <stdio.h>

int main()
 {
    int number, maxDigit = 0;
    printf("");
    scanf("%d", &number);
    while (number > 0) 
    {
        int digit = number % 10; 
        if (digit > maxDigit)
         {
            maxDigit = digit;
        }
        number /= 10;  
    }

    printf("%d
", maxDigit);

return 0;
}