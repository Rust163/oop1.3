public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int year;
    public String country;

    public Car(String brand, String model, int year,String country, String color, double engineVolume){
        if(brand.length() == 0) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if(model.length() == 0) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if(year >= 0){
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (color.length() == 0) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if(country.length() == 0) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (engineVolume >= 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    void info() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(brand + " " + model + ", " + year + " год выпуска, " + "сборка " + country + ", цвет " + color + ", объем двигателя- " + engineVolume + "л.");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
    //--------------С использование метода toString______________________________
    public String toString(){
        return brand + " " + model + ", " + year + " год выпуска, " + " сборка " + country + ", цвет " + color + ", объем двигателя- " + engineVolume + "л.";
    }
}
