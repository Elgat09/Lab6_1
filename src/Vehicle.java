
public abstract class Vehicle {
    private int speed;
    private String brand;
    public Vehicle() {
        this.speed = 0;
        this.brand = "volvo";
    }

    public abstract void speedUp();
    public abstract void Brand();
    public int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getBrand(){
        return brand;
    }
    protected void setBrand(String brand){
        this.brand=brand;
    }
}