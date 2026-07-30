import java.util.Scanner;
public class linearLoop3 {
    public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("enter energy :");
   int E=sc.nextInt();
   System.out.print("Enter number of river");
   int N= sc.nextInt();
       boolean tired= false;
    int TiredRiver=0;

   for(int i=1; i<=N; i++){
    System.out.println("enter River distance D" + i + " :");
    int D=sc.nextInt();
int cost;
    if(D<=5){
        cost=2;
    }
        else{
            cost= D/2;
        }
         
        E-=cost;
        if(E<0){
        tired= true;
        TiredRiver=i;
        break;
        }
        }
            if(tired){
            System.out.println("tired at river :"+ TiredRiver);
        }
            else{
                System.out.println("All done");
                System.out.println(E + " Energy left");
            }

    }

}
