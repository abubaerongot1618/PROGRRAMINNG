
package coffee.hut.report;

import java.util.Scanner;

/**
 *
 * @author ABUBAKER
 */
public class CoffeeHutReport {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       

    String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
    int[][] beverages = new int[4][4];
    
     System.out.println("COFFEE HUT APPLICATION");
     
     System.out.println("-------------------------------");
        System.out.println();
        
        
    for(int i =0; i< cities.length; i++){
       
      
        
        System.out.print("Enter the number of COFFEE sales:  " + cities[i] + ":");
        beverages[i][0]= scanner.nextInt();
        
        System.out.print("Enter the number of TEA sales:  " + cities[i] + ":");
        beverages[i][1] = scanner.nextInt();
        
        System.out.print("Enter the number of BOBA TEA sales for: " + cities[i] + ":");
        beverages[i][2] = scanner.nextInt();
    }       
       
       
     System.out.println("-----------------------------------------------");
        System.out.println("COFFEE HUT REPORT");
     System.out.println("-----------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10%n", "CITY", "COFFEE", " TEA", "BOBA TEA");
      for(int i =0; i<cities.length; i++){    
        
          System.out.printf("%-20s %-10d %10d %-10s%n",cities[i], beverages[i][0], beverages[i][1],  beverages[i][2]);
     }
     
     
    int[] totals = new int[cities.length];
    
    System.out.println("------------------------------------------");
    System.out.println("PRODUCT SALES TOTALS FOR EACH CITY");
    System.out.println("------------------------------------------");
     
            
            for(int i =0; i< cities.length; i++){
                totals[i] = beverages[i][0] + beverages[i][1] + beverages[i][2];
                System.out.printf(" %-20s %8d%n", cities[i], totals[i]);
            }    
                int maxIndex =0;
                
                for (int i = 1; i < totals.length; i++){
                 if(totals[i] > totals[maxIndex]) {
                     maxIndex =i;
                 }
              
                
                
          System.out.print("TOTAL SALES FOR CITIES: R2500 " );
        }
   
       scanner.close();
 
    }
    
}
