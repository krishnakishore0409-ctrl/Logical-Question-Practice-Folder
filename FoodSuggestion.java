import java.util.*;

class foodCalculatore {
    int count  = 0;
   // int num = 0
     foodCalculatore(LinkedHashMap<String,Integer> data,int num){
        count  = 0;

      for(String arr : data.keySet() ){
        if(count == 0) {
          System.out.println();
          System.out.println("Morning ");
        }
        if(count == 4) {
          System.out.println();
          System.out.println("Lunch ");
        }
         if(count == 8) {
          System.out.println();
          System.out.println("Evening ");
          
         }
           if(count == 12) {
            System.out.println();
            System.out.println("Night ");
           }
        
         if (data.get(arr) < 5){
         System.out.println(arr + ":" +data.get(arr)*num+" Piece");
           count++;
        }
        else{
          System.out.println(arr + ":" +data.get(arr)*num+"g ");
          count++;
        }
       }
     }

  
}
public class FoodSuggestion{
    public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.print("How Many people need food : ");
      int num = scan.nextInt();
    System.out.print("How Many days of food : ");
      int days = scan.nextInt();
     // int count = 0;
      int foodCountDays = 0;
      
      while (days !=foodCountDays) {
        //  count = 0;
       
       LinkedHashMap <String,Integer> day1 = new LinkedHashMap<>();
         foodCountDays++;
       day1.put("Idli",2);
       day1.put("dosa",1);
       day1.put("sambar",200);
       day1.put("Omelette",2);

       day1.put("Rice",180);
       day1.put("Sambar",200);
       day1.put("Poriyal",100);
       day1.put("Grilled Chicken",150);

       day1.put("Bolled Eggs",2);
       day1.put("Apple",1);
       day1.put("Buttermilk",200);
       day1.put("Groundnuts",30);

       day1.put("Chapati",2);
       day1.put("Grilled Try",150);
       day1.put("Salad",100);
       day1.put("Vegetable Soup",200);

       //foodCountDays++;
      // if(days == foodCountDays) break;

       System.out.println("-> Day "+foodCountDays );
       foodCalculatore food1 = new foodCalculatore(day1,num);
        if(days == foodCountDays) break;


       LinkedHashMap <String,Integer> day2 = new LinkedHashMap<>();
       foodCountDays++;
       day2.put("Pongal",1);
       day2.put("Sambar",200);
       day2.put("Boiled Eggs",2);
       day2.put("Banana",1);

       day2.put("Chicken Rice",300);
       day2.put("Salad",100);
       day2.put("Curd",200);
       day2.put("Vegetable Curry",100);

       day2.put("Fruit Bowl",150);
       day2.put("Boiled eggs",2);
       day2.put("Green Tea",1);
       day2.put("Sprouts",100);

       day2.put("Chapathi",3);
       day2.put("Chicken Curry",150);
       day2.put("salad",150);
       day2.put("Soup",1);
       
       System.out.println();
       System.out.println(" -> Day "+foodCountDays );
       foodCalculatore food2 = new foodCalculatore(day2,num);
       if(days == foodCountDays) break;

       LinkedHashMap <String,Integer> day3 = new LinkedHashMap<>();
        foodCountDays++;

        day3.put("Oats",80);
        day3.put("Milk",1);
        day3.put("Boiled Eggs",2);
        day3.put("Banana",1);

        day3.put("Chicken Biryani",1);
        day3.put("Raita",1);
        day3.put("salad",1);
        day3.put("Grilled Chicken",100);

        day3.put("Apple",1);
        day3.put("Green tea",1);
        day3.put("Sprouts",100);
        day3.put("Boiled Egg",2);

        day3.put("Chapati",2);
        day3.put("Grilled Fish",150);
        day3.put("Vegetable",100);
        day3.put("Soup",1);

        System.out.println();
        System.out.println("-> Day "+foodCountDays );
       foodCalculatore food3 = new foodCalculatore(day3,num);
       if(days == foodCountDays) break;

       LinkedHashMap <String,Integer> day4 = new LinkedHashMap<>();
        foodCountDays++;

        day4.put("idli",2);
        day4.put("Vada",1);
        day4.put("Egg Try",1);
        day4.put("Omelette",2);

        day4.put("Rice",1);
        day4.put("Fish Fry",1);
        day4.put("Vegetable",100);
        day4.put("curd",200);

        day4.put("Buttermilk",250);
        day4.put("Apple",1);
        day4.put("Boiled Eggs",2);
        day4.put("Groundnuts",30);

        day4.put("Chapathi",2);
        day4.put("Egg Omelette",3);
        day4.put("Salad",150);
        day4.put("Soud",1);
        
        System.out.println();
         System.out.println("-> Day "+foodCountDays );
       foodCalculatore food4 = new foodCalculatore(day4,num);
       if(days == foodCountDays) break;
          
       LinkedHashMap <String,Integer> day5 = new LinkedHashMap<>();
        foodCountDays++;

        day5.put("Dosa",3);
        day5.put("Mushroom gravy",1);
        day5.put("Omelette",2);
        day5.put("Banana",1);

        day5.put("Rice",180);
        day5.put("veg Curry",1);
        day5.put("Curd",200);
        day5.put("paneer",100);

        day5.put("Boiled Corn",1);
        day5.put("Buttermilk",250);
        day5.put("Boiled Eggs",2);
        day5.put("Apple",1);

        day5.put("Chapathi",2);
        day5.put("Chicken Soup",1);
        day5.put("Grilled Chicken",150);
        day5.put("salad",150);

        System.out.println();
         System.out.println("-> Day "+foodCountDays );
       foodCalculatore food5 = new foodCalculatore(day5,num);
       if(days == foodCountDays) break;

        LinkedHashMap <String,Integer> day6 = new LinkedHashMap<>();
        foodCountDays++;

        day6.put("poori",2);
        day6.put("Channa Masala",1);
        day6.put("Omelette",2);
        day6.put("Milk",250);

        day6.put("Rice",200);
        day6.put("Chicken Curry",150);
        day6.put("Vegetable",100);
        day6.put("Curd",200);

        day6.put("Banana",1);
        day6.put("Boild Eggs",2);
        day6.put("Green Tea",1);
        day6.put("Groundnuts",30);

       day6.put("Tandoori chicken",200);
       day6.put("Salad",150);
       day6.put("Soup",200);
       day6.put("Chapathi",2);

       System.out.println();
        System.out.println("-> Day "+foodCountDays );
       foodCalculatore food6 = new foodCalculatore(day6,num);
       if(days == foodCountDays) break;

       LinkedHashMap <String,Integer> day7 = new LinkedHashMap<>();
        foodCountDays++;
        
        day7.put("Dosa",3);
        day7.put("Omelette",2);
        day7.put("paneer masala",1);
        day7.put("Banana",1);

        day7.put("Rice",200);
        day7.put("Fish Fry",150);
        day7.put("Vegetables",100);
        day7.put("Curd",200);

        day7.put("Tender Coconut",1);
        day7.put("Apple",1);
        day7.put("Boiled Eggs",2);
        day7.put("Sprouts",100);

        day7.put("Chapati",3);
        day7.put("Paneer Curry",150);
        day7.put("salad",150);
        day7.put("soup",1);

        System.out.println();
        System.out.println("-> Day "+foodCountDays );
       foodCalculatore food7 = new foodCalculatore(day7,num);
       if(days == foodCountDays) break;
      }
      
    }
}


