#include <stdio.h>

int main()
{
   int T, N,i,sum = 0;

    scanf("%d", &T);

   for(i=1 ; i<=T; i++){

    scanf("%d", &N);
   while (N != 0)
   {

      sum  += (N % 10);
      N  = N / 10;
   }
   printf("%d\n",sum);
   sum = 0;

}

   return 0;
}