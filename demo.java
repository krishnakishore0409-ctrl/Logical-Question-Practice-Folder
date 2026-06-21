import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scan.nextLine();
         List <String> arr = new ArrayList<>(Arrays.asList("krishna","vivek","vinoth","suganya"));
        //  arr.add("krishna");
        //  arr.add("vivek");
        //  arr.add("vinoth");
        //  arr.add("suganya");
         System.out.println(arr.contains(name));

    }
}
