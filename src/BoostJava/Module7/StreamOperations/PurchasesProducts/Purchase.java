package BoostJava.Module7.StreamOperations.PurchasesProducts;

import java.util.HashMap;

public class Purchase {
    private String numberCard;
    private HashMap<Commodity, Double> buyProducts;

    public Purchase(String numberCard) {
        this.numberCard = numberCard;
        this.buyProducts = new HashMap<>();
    }

    public void addItem(Commodity item, Double number){
        buyProducts.put(item, number);
    }

    public HashMap<Commodity, Double> getBuyProducts() {
        return buyProducts;
    }
}
