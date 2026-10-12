
package runapplication;

import java.util.Scanner;


public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the city: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter the total sales of COFFEE beverages in Cape Town: ");
        
    
    BeverageReport report  = new BeverageReport(  beverageType, city,  totalSales);
      report.printBeverageReport();
      
      
      scanner.close();
    }
    
}
