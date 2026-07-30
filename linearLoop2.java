import java.util.*;
public class linearLoop2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of herbs");
        int H=sc.nextInt();
        System.out.println("Enter the numbers of crystals");
        int C=sc.nextInt();
        int potions = 0;
        for(potions=0; H>=3 && C>=2; potions++){
            H-=3;
            C-=2;
            System.out.println("Potions : "+ (potions+1) +" created");
            System.out.println("Remaining herbs "+ H+ "Remaining Crystals :" + C );


        }
        System.out.println("Potions Created : "+ potions);
        if(potions%2==0){
            System.out.println("stable Elixir");
        }
            else{
                System.out.println("volatile brew");

            }
        }


    }

    

