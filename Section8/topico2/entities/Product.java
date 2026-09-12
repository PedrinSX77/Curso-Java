package Section8.topico2.entities;

public class Product {
    public String name;
    public double price;
    public int qtd;

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
