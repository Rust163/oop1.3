public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;
    void info() {
        System.out.println(brand + " " + model + ", " + year + " год выпуска, " + "сборка " + country + ", цвет " + color + ", объем двигателя-" + engineVolume + "л.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
