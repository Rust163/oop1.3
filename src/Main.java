public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car();
        ladaGranta.brand = "LADA"; ladaGranta.model = "Granta"; ladaGranta.year = 2015; ladaGranta.color = "желтый"; ladaGranta.country = "Россия"; ladaGranta.engineVolume = 1.7;
        Car audiA8 = new Car();
        audiA8.brand = "AUDI"; audiA8.model = "A8 50L TDI quattro"; audiA8.year = 2020; audiA8.color = "черный"; audiA8.country = "Германия"; audiA8.engineVolume = 3.0;
        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMW"; bmwZ8.model = "Z8"; bmwZ8.year = 2021; bmwZ8.color = "черный"; bmwZ8.country = "Германия"; bmwZ8.engineVolume = 3.0;
        Car kiaSportage = new Car();
        kiaSportage.brand = "KIA"; kiaSportage.model = "Sportage"; kiaSportage.year = 2018; kiaSportage.color = "красный"; kiaSportage.country = "Южная Корея"; kiaSportage.engineVolume = 2.4;
        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "HYUNDAI"; hyundaiAvante.model = "Avante"; hyundaiAvante.year = 2016; hyundaiAvante.color = "оранжевый"; hyundaiAvante.country = "Южная Корея"; hyundaiAvante.engineVolume = 1.6;

        ladaGranta.info();
        audiA8.info();
        bmwZ8.info();
        kiaSportage.info();
        hyundaiAvante.info();
    }
}