/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package watchit;

/**
 *
 * @author Accounting
 */
import java.time.LocalDate;

 abstract class Subscription {
    private final int userId;
    private final String planType;
    double price=1000.0d;
    private final LocalDate startDate;
    
     public Subscription(int userId, String planType, LocalDate startDate) {
        this.userId = userId;
        this.planType = planType;
        this.startDate = startDate; // Set startDate in the constructor
    }
    
public boolean isActive() {
  LocalDate endDate = startDate.plusDays(30);
    return endDate.isAfter(LocalDate.now()) || endDate.isEqual(LocalDate.now());
}
    
public double calculatePrice() {
        return price;
    }
                    
    public abstract int getWatchingLimit();

    public String getPlanType() {
        return planType;
    }
   
           
}




 class BasicSubscription extends Subscription {

    public BasicSubscription(int userId, String planType, LocalDate startDate) {
        super(userId, "BASIC",startDate);
    }
    
    @Override
    public double calculatePrice() {
        return price;
    }
    @Override
    public int getWatchingLimit() {
        return 5;
    }
    @Override
     public String toString(){
     return "basic,"+"price("+this.calculatePrice()+"),WatchingLimit:"+this.getWatchingLimit();
     }

}

 class StandardSubscription extends Subscription {

    public StandardSubscription(int userId,String planType,LocalDate startDate) {
        super(userId, "STANDARD",startDate);
    }
    @Override
 public double calculatePrice() {
        this.price=price*1.2;
        return price;
    }
    @Override
    public int getWatchingLimit() {
        return 10;
    }
     @Override
     public String toString(){
     return "standard,"+"price("+this.calculatePrice()+"),WatchingLimit:"+this.getWatchingLimit();
     }

}

 class PremiumSubscription extends Subscription {

    public PremiumSubscription(int userId,String planType,  LocalDate startDate) {
        super(userId, "PREMIUM",startDate);
    }
    @Override
    public double calculatePrice() {
        this.price=price*1.8;
        return price;
    }

    @Override
    public int getWatchingLimit() {
       return 15; 
    }
     @Override
     public String toString(){
     return "premium,"+"price("+this.calculatePrice()+"),WatchingLimit:"+this.getWatchingLimit();
     }
    
}