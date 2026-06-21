import java.util.Scanner;
public class  Calculatore{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
        System.out.println("======Calculatore======");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Exit");

        System.out.print("Choose Option:");
        int choice = scan.nextInt();

        if(choice == 5){
            System.out.println("Calculatore closed");
           break;
        }

        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = scan.nextInt();
        
        int Result = 0;
        switch (choice) {
            case 1: 
                System.out.println("Result :"+ (num1+num2));
                break;
             case 2:
                 System.out.println("Result :" + (num1-num2));
                 break;
             case 3:
                System.out.println("Result :" + (num1*num2));
                break;
             case 4:
                 if(num1 != 0 && num2 != 0){
                   System.out.println("Result :" + (num1/num2));
                
                 } 
                 else{
                    System.out.println("Result : Cannot Divide by Zero");
                 }      
                 break;    
            default:
                   System.out.println("Result : Invalid Option");
    
                break;
        }

    
    }
    scan.close();
   
    }
    
}