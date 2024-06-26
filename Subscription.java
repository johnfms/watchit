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
import java.time.temporal.ChronoUnit;

 abstract class Subscription {
    private int userId;
    private String planType;
    private Price price;
    private LocalDate startDate;

    public Subscription(int userId, String planType, Price price, LocalDate startDate) {
        this.userId = userId;
        this.planType = planType;
        this.price = price;
        this.startDate = startDate;
    }

    // Getters and setters omitted for brevity

    public boolean isActive() {
        // Use LocalDate.until() to calculate days between dates
        return LocalDate.now().until(startDate.plusDays(30), ChronoUnit.DAYS) <= 0;
    }

    public abstract int getWatchingLimit();

    public String getPlanType() {
        return planType;
    }
}

 class Price {

    private double basePrice; // Fixed base price
    private String region; // User's region for potential regional pricing

    public Price(double basePrice, String region) {
        this.basePrice = basePrice;
        this.region = region;
    }

    public double calculatePrice(String planType) {
        double finalPrice = basePrice;

        switch (planType) {
            case "STANDARD":
                finalPrice *= 1.2; // Increase base price by 20% for Standard
                break;
            case "PREMIUM":
                finalPrice *= 1.5; // Increase base price by 50% for Premium
                break;
            // No change for Basic plan (already reflected in basePrice)
        }

        // Implement additional logic for regional pricing if needed
        if (region.equals("US")) {
            finalPrice *= 1.08; // Add 8% sales tax for US region (example)
        }

        return finalPrice;
    }
}

 class BasicSubscription extends Subscription {

    public BasicSubscription(int userId, Price price, LocalDate startDate) {
        super(userId, "BASIC", price, startDate);
    }

    @Override
    public int getWatchingLimit() {
        return 5;
    }
}

 class StandardSubscription extends Subscription {

    public StandardSubscription(int userId, Price price, LocalDate startDate) {
        super(userId, "STANDARD", price, startDate);
    }

    @Override
    public int getWatchingLimit() {
        return 10;
    }
}

 class PremiumSubscription extends Subscription {

    public PremiumSubscription(int userId, Price price, LocalDate startDate) {
        super(userId, "PREMIUM", price, startDate);
    }

    @Override
    public int getWatchingLimit() {
        return 15;
    }
}
