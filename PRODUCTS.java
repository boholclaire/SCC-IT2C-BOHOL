
package claireb;

import java.util.Scanner;

public class PRODUCTS {
    
      int id, sold, stock;
      String name;
     double price;
    
    

    public void Products(){
      

    
        this.id = id;
        this.name = name;
        this.sold = sold;
        this.stock = stock;
        this.price = price;
        
    }
    
    

    public void viewProducts(){
        double profit = this.sold * this.price;
        String status = (this.stock < 1) ? "Out-of-stock" : "Available";
        double inventoryValue = this.stock * this.price;

        System.out.printf("%-10d %-10s %-10d %-10d %-10.2f %-10.2f %-10s %-10.2f\n",
                this.id, this.name, this.sold, this.stock, this.price, profit, status, inventoryValue);
    }

    public static void dispalyProducts() {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "ID", "Name", "Sold", "Stock", "Price", "Profit", "Status", "Inventory Value");
         System.out.println("------------------------------------------------------------------------");
    }
}

