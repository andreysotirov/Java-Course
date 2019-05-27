package com.andrewsotirov;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    private final Map<String, StockItem> stockList;

    public StockList() {
        this.stockList = new HashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = stockList.getOrDefault(item.getName(), item);
            if (inStock != item) {
                item.addStock(inStock.quantityInStock());
            }
            stockList.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = stockList.getOrDefault(item, null);
        if ((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
            inStock.addStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key) {
        return stockList.get(key);
    }

    public Map<String, StockItem> Item() {
        return Collections.unmodifiableMap(stockList);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0;
        for (Map.Entry<String, StockItem> item : stockList.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Values of items: ";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + totalCost;
    }
}
