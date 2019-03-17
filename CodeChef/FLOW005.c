#include <stdio.h>

int main()
{
    int T,N,sum=0,temp;
    scanf("%d",&T);

    int i =0;

    for(i=1; i<=T; i++){
       scanf("%d",&N);

        ///For 100;

       if(N >= 100){
        if(N%100 == 0){
            printf("%d\n",N/100);
        }else if(N%100 != 0){
            sum = N / 100;
            N %= 100;
            if(N >= 50){
               ++sum;
               N %= 50;
             }
             if( N >= 10){
                sum += N/10;
                N %= 10;
            }
            if(N >= 5){
                sum += N/5;
                N %= 5;
            }

            if(N >= 2){
                sum += N/2;
                N %= 2;
            }
            if(N==1){
                ++sum;
            }
            printf("%d\n",sum);
        }

      }
        ///For 50;

      else if(N >= 50 && N<100){
        if(N%50 == 0){
            printf("%d\n",N/50);
        }else if(N%50 != 0){
            sum = N / 50;
            N %= 50;
            if( N >= 10){
                sum += N/10;
                N %= 10;
            }
            if(N >= 5){
                sum += N/5;
                N %= 5;
            }

            if(N >= 2){
                sum += N/2;
                N %= 2;
            }
            if(N==1){
                ++sum;
            }
            printf("%d\n",sum);
        }

      }
        ///For 10

      else if(N >= 10 && N<50){
        if(N%10 == 0){
            printf("%d\n",N/10);
        }else if(N%10 != 0){
            sum = N / 10;
            N %= 10;
            if(N >= 5){
                sum += N/5;
                N %= 5;
            }

            if(N >= 2){
                sum += N/2;
                N %= 2;
            }
            if(N==1){
                ++sum;
            }
            printf("%d\n",sum);
        }

      }
        /// For 5
      else if(N >= 5 && N<10){
        if(N%5 == 0){
            printf("%d\n",N/5);
        }else if(N%5 != 0){
            sum = N / 5;
            N %= 5;
            if(N >= 2){
                sum += N/2;
                N %= 2;
            }
            if(N==1){
                ++sum;
            }
            printf("%d\n",sum);
        }

      }
        /// For 2
      else if(N >= 2 && N<5){
        if(N%2 == 0){
            printf("%d\n",N/12);
        }else if(N%2 != 0){
            sum = N / 2;
            N %= 2;
            if(N==1){
                ++sum;
            }
            printf("%d\n",sum);
        }

    }
        /// For only 1
        else {
            printf("%d\n",++sum);
        }
        sum = 0;
    }



    return 0;
}
