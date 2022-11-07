public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    public Car(String brand, String model, int year,String country, String color, double engineVolume){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.country = country;
        this.engineVolume = engineVolume;
    }
    void info() {
        System.out.println(brand + " " + model + ", " + year + " год выпуска, " + "сборка " + country + ", цвет " + color + ", объем двигателя- " + engineVolume + "л.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public String toString(){
        return brand + " " + model + ", " + year + " год выпуска, " + " сборка " + country + ", цвет " + color + " объем двигателя- " + engineVolume + "л.";
    }
}
