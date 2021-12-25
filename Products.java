public class Products {

    private double pepsi = 10000;
    private double coke = 10000;
    private double lemon = 20000;

    public Products(double pepsi, double coke, double lemon) {
        this.pepsi = pepsi;
        this.coke = coke;
        this.lemon = lemon;
    }

    public Products(){}

    public double getPepsi() {
        return pepsi;
    }

    public void setPepsi(double pepsi) {
        this.pepsi = pepsi;
    }

    public double getCoke() {
        return coke;
    }

    public void setCoke(double coke) {
        this.coke = coke;
    }

    public double getLemon() {
        return lemon;
    }

    public void setLemon(double lemon) {
        this.lemon = lemon;
    }
}
