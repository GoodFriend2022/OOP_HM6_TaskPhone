import java.util.Scanner;

public abstract class Phone implements Calling {

    String name;
    String userPlace;

    public Phone() {
        this.name = "телефон";
        this.userPlace = "там где есть телефон";
    }

    @Override
    public void calling() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите номер телефона >> \n");
        int number = iScanner.nextInt();
        iScanner.close();
        System.out.printf("Идет звонок по номеру: %n ...", number);
    }
    
}