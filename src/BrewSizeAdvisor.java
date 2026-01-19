import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
if(volume<=150){
    System.out.println("Small");
}
 else if(volume>=160 && volume<=399){
     System.out.println("Medium");
         }
        else(volume>400)
            {
    System.out.println("Large");
    
        // TODO:
        // Print "Small", "Medium", or "Large"
        // based on the given volume

        sc.close();
    }
}

