#include<stdio.h>
int main()
{
    int a = 1;
    int b = 1;
    b += a/b++;
    
    printf("%d %d",a,b);
    
    printf("\n");
    return;
 }

