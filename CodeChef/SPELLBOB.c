#include <stdio.h>
#include <string.h>

void bob(char top[3],char btm[3]){

    if( (top[0]== 'b' || btm[0] == 'b') && (top[1] == 'o' || btm[1] == 'o')&& (top[2] == 'b' || btm[2] == 'b')  )
    printf("yes\n");

    else if( (top[0]== 'b' || btm[0] == 'b') && (top[1] == 'b' || btm[1] == 'b') && (top[2] == 'o' || btm[2] == 'o') )
    printf("yes\n");

    else if( (top[0]== 'o' || btm[0] == 'o') && (top[1] == 'b' || btm[1] == 'b') && (top[2] == 'b' || btm[2] == 'b') )
    printf("yes\n");

    else printf("no\n");


}

int main()
{
    int t,i;
    scanf("%d",&t);
    char top[3],btm[3];

    for(i=0; i<t; i++){
        scanf("%s",top);
        scanf("%s",btm);

        bob(top,btm);

    }

    return 0;
}