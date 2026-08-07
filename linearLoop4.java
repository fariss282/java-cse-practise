import java.util.Scanner;

public class linearLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
if(n<0){
    n= -n;
}
while(n>0){
    int digit= n%10;
    System.out.print(digit);
        if(n/10>0){
        System.out.print(" ,");

    }

    n/=10;

}

    }
}

