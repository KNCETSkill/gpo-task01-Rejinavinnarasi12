import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
if(volume<50){
    System.out.println("Small");
}
 else if(volume>=50 && volume<=75){
     System.out.println("Medium");
         }
        else(volume>150)
            {
    System.out.println("Large");
    
        // TODO:
        // Print "Small", "Medium", or "Large"
        // based on the given volume

        sc.close();
    }
}

