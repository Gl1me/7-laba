import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Info num1 = new Info("Горбачёв М.С.", 5687, 12, "ПАЗ-3205", 1970, 700000);
        Info num2 = new Info("Ельцин Б.Н.", 1432, 6, "ЛиАЗ-677", 1967, 750000);
        Info num3 = new Info("Брежнев Л.И.", 9604, 2, "ЛиАЗ-5292", 2000, 300000);
        Info num4 = new Info("Сталин И.В.", 1874, 1, "НефАЗ-5299", 2001, 250000);

        Info[] arr = {num1, num2, num3, num4};
        System.out.println("Введите номер маршрута:");
        int number = scan.nextInt();
        boolean nr = false;
        for (Info inf : arr) {
            if (inf.numberRoute == number) {
                System.out.println("ФИО водителя: " + inf.FIO + " Номер автобуса: " + inf.numberBus + ". Марка: " + inf.mark);
                nr = true;
            }
        }
        if (nr == false) {
            System.out.println("Некорректный номер маршрута!");
        }
        System.out.println("Введите пробег:");
        int mileage = scan.nextInt();
        boolean mlg = false;
        for (Info inf : arr) {
            if (inf.Mileage > mileage) {
                System.out.println("ФИО водителя: " + inf.FIO + " Номер автобуса: " + inf.numberBus + ". Марка: " + inf.mark + ". Пробег: " + inf.Mileage + " км.");
                mlg = true;
            }
        }
        if (mlg == false) {
            System.out.println("Нет автобусов, пробег у которых больше заданного количества.");
        }
    }
}

class Info {
    String FIO;
    int numberBus;
    int numberRoute;
    String mark;
    int Year;
    int Mileage;

    Info(String FIO, int numberBus, int numberRoute, String mark, int Year, int Mileage) {
        this.FIO = FIO;
        this.numberBus = numberBus;
        this.numberRoute = numberRoute;
        this.mark = mark;
        this.Year = Year;
        this.Mileage = Mileage;
    }
}