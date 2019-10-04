package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<ISell>();
    }

    public void addItem(ISell item){
        this.stock.add(item);
    }

    public ISell removeItem(ISell item){
        int index = this.stock.indexOf(item);
        return this.stock.remove(index);
    }

    public int stockCount() {
        return this.stock.size();
    }

    public double calculateTotalProfit() {
        double totalProfit = 0;
        for(ISell item : this.stock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}
