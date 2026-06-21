import java.util.Scanner;
import java.util.*;
class IllegalArgumentException extends Exception{
   public IllegalArgumentException(String error){
    super(error);
   }
}

public class MainCalculatore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
        System.out.println("======Calculatore Open======");
        System.out.println("      + Addition");
        System.out.println("      - Subtraction");
        System.out.println("      * Multiplication");
        System.out.println("      / Division");
        System.out.println("      % Modulos (Remainder)");
        System.out.println("      . Exit Calucatore");
        System.out.println();
        int k = 0;
        int count = 1;
      
        int Result = 0;
        int error = 1;
        int error1 = 1;
    
         for(int i=1;i<=error;i++){
        try{
            System.out.print("Enter first Number :");
            Result =scan.nextInt();
        }
        catch(Exception e){
            System.out.println("Error Message : "+e);
            System.out.println("Error Message : Invalid Input! Please enter number only try again");
           scan.next();
          error++;
        }
    }
       
        scan.nextLine();
       //  System.out.println();
        for(int i=1;i<=count;i++){
            String choice = "";

            int operatore = 1;
            for(int r=1;r<=operatore;r++){
            try{
        System.out.print("  Choose operator : ");
         choice = scan.nextLine();
          List <String> arr = new ArrayList<>(Arrays.asList("+","-","*","/","%","."));
           // boolean ARR = arr.contains(choice);
            if(!arr.contains(choice)){
           throw new IllegalArgumentException("Invalid Operatore: please enter + , - , * , / , % , .");
        }
            }
            catch(IllegalArgumentException e){
                System.out.println("Error Message :" +e.getMessage());
               // scan.next();
                operatore++;
            }
        }
        if(choice.equals(".")){
            k = 1;
           break;
        }
        int num =0;
        for(int l=1;l<=error1;l++){
        try{
        System.out.print("Enter next Number : ");
         num = scan.nextInt();
        }catch(Exception e){
            System.out.println("Error Message : "+ e);
            System.out.println("Error Message : Invalid Input! Please enter number only try again");
            scan.next();
          error1++;
        }
    }   
        scan.nextLine();
    
          switch (choice) {
        case "+":
              Result  += num;
           break;
        case "-":
            Result -= num;
           break;
        case "*":  
            Result *= num;
           break;
        case "/":
            if(num != 0){
            Result /= num;
            }else{
                System.out.println("Error message : Cannot Divide by Zero");
            }
             break;  
         case "%":
            Result %= num;
             break;      
        default:
            System.out.println("Error Message : Invalid Operatore "+ choice);
            k = 1;
            break;    
      }
        if(k == 0){
            count++;
        }
    }
       System.out.println();
       System.out.println("--> Total_Value : " + Result);
       System.out.println();

        if(k == 1){
        System.out.println("=====Calculatore closed=====");
        break;
       }
     scan.close();
        }
    }
}
    

