package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String regNumber;
    private final int numberOfSeats;
    private boolean tireSummer;
    int month;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String regNumber,
               int numberOfSeats,
               boolean tire) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model == "" ? "default" : model);
        setEngineVolume(engineVolume);
        setColor(color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null || country == "" ? "default" : country);
        setTransmission(transmission);
        this.bodyType = (bodyType == null || bodyType == "" ? "седан" : bodyType);
        setRegNumber(regNumber);
        this.numberOfSeats = (numberOfSeats <= 0 ? 5 : getNumberOfSeats());
        this.tireSummer = tireSummer;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume<=0){
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
         if (color == null || color == "") {
            color = "белый";
       }
        this.color = color;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission == "") {

            transmission = "механическая";
        }
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber == ""){
            regNumber = "o777ee 02";
        }
        this.regNumber = regNumber;
    }

    public boolean isTireSummer() {
        return tireSummer;
    }

    public void setTireSummer(boolean tireSummer) {
        this.tireSummer = tireSummer;
    }


    public void changeTires(int month) {
        if ((month == 11||month==12)|| (month >= 1 && month <=3)) {
            tireSummer = false;
        }
        if (month >= 4 && month <= 10) {
            tireSummer = true;
        }
    }

    @Override
    public String toString() {
        return "Car" +
                "\n марка: " + brand +
                "\n модель: " + model +
                "\n объём двигателя: " + engineVolume +
                "\n цвет: " + color +
                "\n год выпуска: " + year +
                "\n страна: " + country +
                "\n коробка передач: " + transmission +
                "\n тип кузова: " + bodyType +
                "\n номер: " + regNumber +
                "\n вместимость: " + numberOfSeats +
                "\n резина: " + (tireSummer ? "летняя" : "зимняя");
    }
}