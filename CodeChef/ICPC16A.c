#include <stdio.h>

int main()
{
    int T;
    scanf("%d",&T);
    int x1,y1,x2,y2;

    int i;
    for(i=1; i<=T; i++){
        scanf("%d%d%d%d",&x1,&y1,&x2,&y2);
        if(x1<x2 && y1==y2){
            printf("right\n");
        }
        else if(x1>x2 && y1==y2){
            printf("left\n");
        }
        else if(x1==x2 && y1<y2){
        printf("up\n");
        }
        else if(x1==x2 && y1>y2){
            printf("down\n");
        }
        else printf("sad\n");
    }

    return 0;
}
