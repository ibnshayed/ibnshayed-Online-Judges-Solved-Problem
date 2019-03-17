#include <cstdio>

int main()
{
    int i,j;

    while(scanf("%d %d",&i,&j) != EOF)
    {
        int x,y,max = 0;

        x = (i<j) ? i:j;
        y = (i>j) ? i:j;

        for(int k = x; k <= y ; k++)
        {
            int n = k;
            int nc = 0;

            while(n != 1)
            {
                nc++;
                if(n%2 == 1) n = 3*n + 1;
                else n /= 2;
            }
            if(nc>max) max = nc;
        }
        printf("%d %d %d",i,j,max+1);
    }
    return 0;
}