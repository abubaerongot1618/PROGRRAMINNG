
package runapplication;


class BeverageReport extends Beverage{ 
    
    public BeverageReport(String beverageType, String city, int totalSales) {
        super(beverageType, city, totalSales);
    }

   
    
    public void printBeverageReport(){
        
        System.out.println("COFFEE HUT REPORT");
        System.out.println("****************************");
        
        System.out.println("BEVERAGE " + getbeverageType());
        System.out.println("CITY " + getCity());
        System.out.println("TOTAL SALES:  " + getTotalSales());
        
        System.out.println("*****************************");
        
    }

   
}
