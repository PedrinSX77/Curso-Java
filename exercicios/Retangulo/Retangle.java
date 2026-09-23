package exercicios.Retangulo;

public class Retangle {
    private int base;
    private int height;

    public Retangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int showArea() {
        return base * height;
    }

    public int showPerimeter() {
        return (2 * base) + (2 * height);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Sua base é: "
                + base
                + ", e sua sua altura é: "
                + height
                + " e seu perímetro: "
                + showPerimeter()
                + " e sua área: "
                + showArea();
    }
}
