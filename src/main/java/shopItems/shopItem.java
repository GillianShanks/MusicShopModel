package shopItems;

import interfaces.ISell;

public abstract class shopItem implements ISell {
    private double wholesalePrice;
    private double sellingPrice;
    private String brand;

    public shopItem (double wholesalePrice, double sellingPrice, String brand){
        this.wholesalePrice = wholesalePrice;
        this.sellingPrice = sellingPrice;
        this.brand = brand;
    }

    public double calculateMarkup(){
       return this.sellingPrice - this.wholesalePrice;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getBrand() {
        return brand;
    }
}
