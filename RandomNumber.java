import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
    
        Random rand = new Random();
        int newnum = 0;

        while(newnum!=2){
            newnum = rand.nextInt(10);
            System.out.println(newnum);
        }



        
        int i = 0;
        do{
            System.out.println("Enter the number > 10");
            i =  scan.nextInt();
        }while(i<10);
    }
}
