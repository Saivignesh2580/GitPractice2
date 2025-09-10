package Dto;

import java.time.LocalDate;

public class VirtualAccount {
    private int id;
    private int category;
    private int limitAmount;
    private LocalDate limitDate;
    private boolean isemergency;
    private double balance;
    public int getId() {
        return id;
    }
    public int getCategory() {
        return category;
    }
    public int getLimitAmount() {
        return limitAmount;
    }
    public LocalDate getLimitDate() {
        return limitDate;
    }
    public boolean isIsemergency() {
        return isemergency;
    }
    public void setId(int id) {
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public void setLimitAmount(int limitAmount) {
        this.limitAmount = limitAmount;
    }
    public void setLimitDate(LocalDate limitDate) {
        this.limitDate = limitDate;
    }
    public void setIsemergency(boolean isemergency) {
        this.isemergency = isemergency;
    }
    @Override
    public String toString() {
        return "VirtualAccount [id=" + id + ", category=" + category + ", limitAmount=" + limitAmount + ", limitDate="
                + limitDate + ", isemergency=" + isemergency + ", balance=" + balance + "]";
    }
    
}
