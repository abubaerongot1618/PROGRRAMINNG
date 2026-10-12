
package runapplication;


abstract class Beverage implements IBeverage {
     private String beverageType;
    private String city;
     int totalSales;
    
    Beverage(String beverageType, String city, int totalSales){
        this.beverageType= beverageType;
        this.city= city;
        this.totalSales = totalSales;
        
    }
        @Override
        public String getbeverageType(){
          return  beverageType;
    }
      
    @Override
      public String getCity(){
          return city;
      }
      
      @Override
      public int getTotalSales(){
        return totalSales;   
      }   
}
