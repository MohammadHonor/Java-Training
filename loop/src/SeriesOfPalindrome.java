import java.util.Scanner;
public class SeriesOfPalindrome {
    public static void main(String[] args) {
        int x,y,flag;
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(x=1;x<=N;x++){
            if(x==1 ||x==0){
                flag=1;
                continue;
            }
            for(y=2;y<=x/2;++y){
                if(x%y==0){
                    flag=0;
                    break;
                }

            }

        }
        for(x=1;x<=N;x++){
          //  if(flag==1){

          //  }
        }
    }
}
