package Section9.entities;

public class Product {
    public String name;
    public double price;
    public int qtd;

    public Product(){
        
    }

    public Product (String name, double price, int qtd) {
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

    public Product (String name , double price){
        this.name = name;
        this.price = price;
    }
    
    public double totalValueInStock() {
        double totalValue = price * qtd;
        return totalValue;
    }

    public void addProducts(int qtd) {
        this.qtd += qtd;
    }

    public void removeProducts(int qtd) {
        this.qtd -= qtd;
    }

    public String toString() {
        return name 
            + ", $ " 
            + String.format("%.2f", price)
            + ", "
            + qtd
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
    }
}
