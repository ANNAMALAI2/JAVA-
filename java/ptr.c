#include<stdio.h>
int main()
{
    int a=2;
    printf("%d\n ",a);//2
    printf("%d\n",a++);//2
    printf("%d\n",++a);//4
    printf("%d",++a+a++);//4+5
    return 0;
}