import java.util.*;

public class Main {

    public static void main(String[] args) {
        DriverB ivan = new DriverB(" Иван ", true, " 6 лет ");
        DriverB vova = new DriverB(" Вова ", true, " 32 лет ");
        DriverB shuric = new DriverB(" Шурик ", true, " 4 лет ");
        DriverB nikita = new DriverB(" Никита ", true, " 6 лет ");
        DriverC zuric = new DriverC(" Зурик ", true, " 3 лет ");
        DriverC egor = new DriverC(" Егор ", true, " 3 лет ");
        DriverC oleg = new DriverC(" Олег ", true, " 51 лет ");
        DriverD nik = new DriverD(" Николай ", true, " 8 лет ");
        DriverD boris = new DriverD(" Борис ", false, " 7 лет ");
        DriverD ilia = new DriverD(" Илья ", true, " 11 лет ");
        DriverD artur = new DriverD(" Артур ", true, " 5 лет ");
        Mechanic foma = new Mechanic<Car>("Фома Кузькин", "Болты и Гайки", " ремонтирует легковые авто ");
        Mechanic luka = new Mechanic<Truck>("Лука Вижинков", "Тяп Ляп сервис", " ремонтирует грузовые авто ");
        Mechanic petr = new Mechanic<Bus>("Пётр Пучёк", "АвтоРемонт", " ремонтирует автобусы ");
        Mechanic misha = new Mechanic<Transport>("Миша Губайдулин", "Ездит как НАДО", " ремонтирует все виды автомобилей ");
        List<Mechanic<?>> brigada1;
        brigada1 = new ArrayList<>(3);
        brigada1.add(foma);
        brigada1.add(misha);
        List<Mechanic<?>> brigada2;
        brigada2 = new ArrayList<>(3);
        brigada2.add(luka);
        brigada2.add(misha);
        List<Mechanic<?>> brigada3;
        brigada3 = new ArrayList<>(3);
        brigada3.add(petr);
        brigada3.add(misha);
        Car lada = new Car("Lada", "Granta", 1.7, ivan, brigada1, Car.BodyType.BODY_S);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, vova, brigada1, Car.BodyType.BODY_V);
        Car bmv = new Car("BMW", "Z8", 3.0, shuric, brigada1, Car.BodyType.BODY_K);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, nikita, brigada1, Car.BodyType.BODY_U);
        Bus hyundai = new Bus("Hyundai", "Avante", 1.6, nik, brigada3, 61);
        Bus ural = new Bus("Урал", "Next", 20.22, boris, brigada3, 24);
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20, artur, brigada3, 23);
        Bus mercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21, ilia, brigada3, 120);
        Truck kamaz = new Truck("Камаз", "компас", 12.45, zuric, brigada2, 2.5);
        Truck zil = new Truck("Зил", "43", 24.12, egor, brigada2, 23.5);
        Truck man = new Truck("Man", "TGL", 12.45, oleg, brigada2, 13.3);

//        foma.carryOutMaintenance(bmv);
//        foma.carryOutMaintenance(lada);
//        misha.carryOutMaintenance(bmv);
//        luka.carryOutMaintenance(lada);
//        foma.fixTheCar();
//        System.out.println(" Бригада 1 " + brigada1.toString());
//        System.out.println(" Бригада 2 " + brigada2.toString());
//        System.out.println(" Бригада 3 " + brigada3.toString());
//        System.out.println(lada);
//        System.out.println(" водитель " + boris.getName() + " управляет автомобилем " + mercedes + " и будет участвовать в заезде. ");
//        System.out.println(" водитель " + oleg.getName() + " управляет автомобилем " + kamaz + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + ivan.getName() + " управляет автомобилем " + lada + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + vova.getName() + " управляет автомобилем " + audi + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + zuric.getName() + " управляет автомобилем " + bmv + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + nik.getName() + " управляет автомобилем " + kia + " и будет участвовать в заезде. ");
//        paz.printInfo();
//        paz.printType();
//        audi.printInfo();
//        audi.printType();
//        kamaz.printInfo();
//        kamaz.printType();
//        autoDiagnosed(audi, kamaz, paz, ural, kia);
//        rightsCheckDrivers(vova, oleg, oleg, nikita, boris, ilia);
//        getMechList(luka, foma, petr, misha);
//        getDriversList(ivan, shuric, egor, nikita, artur, ilia, boris, nik, oleg, vova, zuric);
//        getTransportsList(lada, audi, bmv, kia, hyundai, ural, paz, mercedes, kamaz, zil, man);
//        getMechList(luka, misha, petr, foma);
//        System.out.println(foma);
//        System.out.println(luka);
//        System.out.println(petr);
//        System.out.println(misha);


        Map<Transport, List<Mechanic<?>>> avtoBook = new LinkedHashMap<>();
        avtoBook.put(lada, brigada1);
        avtoBook.put(audi, brigada1);
        avtoBook.put(bmv, brigada1);
        avtoBook.put(kia, brigada1);
        avtoBook.put(hyundai, brigada3);
        avtoBook.put(ural, brigada3);
        avtoBook.put(paz, brigada3);
        avtoBook.put(mercedes, brigada3);
        avtoBook.put(kamaz, brigada2);
        avtoBook.put(zil, brigada2);
        avtoBook.put(man, brigada2);
        avtoBook.put(man, brigada3);
        avtoBook.put(man, brigada2);
        for (Map.Entry<Transport, List<Mechanic<?>>> element : avtoBook.entrySet()) {
            System.out.println(" Трансформированый список АВТО-->МЕХАНИК в map- КЛЮЧ:" + element.getKey() + "ЗНАЧЕНИЕ: " + element.getValue());
            System.out.println(" Хешкод ключа "+element.getKey().hashCode() + " хешкод значения "+element.getValue().hashCode());
        }
        System.out.println(" Если в случае ошибки какой-либо из объектов будет занесен в базу два раза, то в консоль выведется информация без повторов, " +
                "так как новое добавление по старому ключу перезатрет старое значение.");
    }


//    public static void getMechList(Mechanic... mechanics) {
//        System.out.println(" Механики список ");
//        ArrayList<Mechanic> mechanicssList;
//        mechanicssList = new ArrayList<>();
//        for (Mechanic element : mechanics) {
//            mechanicssList.add(element);element.getKey() +
//        }
//        System.out.println("  mechanicssList: " + mechanicssList);
//    }
//
//    public static void getDriversList(Driver... drivers) {
//        System.out.println("Водители список ");
//        ArrayList<Driver> driversList;
//        driversList = new ArrayList<>();
//        for (Driver element : drivers) {
//            driversList.add(element);
//        }
//        System.out.println("  driversList: " + driversList);
//    }
//
//
//    public static void getTransportsList(Transport... transports) {
//        System.out.println(" Автомобили список ");
//        ArrayList<Transport> transportsList;
//        transportsList = new ArrayList<>();
//
//        for (Transport element : transports) {
//            transportsList.add(element);
//        }
//        System.out.println("  transportsList: " + transportsList);
//    }

//    public static void autoDiagnosed(Transport... auto) {
//        System.out.println(" Прохождение машинами диагностики ");
//        for (Transport element : auto) {
//            try {
//                element.diagnosed();
//            } catch (RuntimeException e) {
//                System.out.println(" Произошла ошибка ");
//                System.out.println(e.getMessage());
//            } finally {
//                System.out.println("Проверка завершена");
//            }
//        }
//    }
//
//    public static void rightsCheckDrivers(Driver... driver) {
//        int count = 0;
//        System.out.println(" Прохождение проверки прав ");
//        try {
//            for (Driver element : driver) {
//                element.isDriverLicense();
//                count++;
//            }
//        } catch (CantDriveException e) {
//            System.out.println(" Произошла ошибка водитель " + e.getDriver().getName() + "  не имеет прав.");
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Проверка завершена. Из рассмотренных. " + count + " водителей имеют права.");
//        }
//    }

}



