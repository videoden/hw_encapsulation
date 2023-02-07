package transport;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "жёлтый",
                2005,
                "Россия",
                "механика",
                "седан",
                "e000уф",
                5,
                true,
                new Car.Key(true,true));
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "чёрный",
                2020,
                "Германия",
                "механика",
                "седан",
                "e000уф",
                5,
                true,
                null);
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "чёрный",
                2021,
                "Германия",
                "механика",
                "седан",
                "e000уф",
                5,
                true,
                new Car.Key(false,false));
        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "механика",
                "седан",
                "e000уф",
                5,
                true,
                null);
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "жёлтый",
                2016,
                "Южная Корея",
                "механика",
                "седан",
                "e000уф",
                5,
                false,
                new Car.Key(true,false));

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

        audi.changeTires(7);
        System.out.println(audi);

    }
}