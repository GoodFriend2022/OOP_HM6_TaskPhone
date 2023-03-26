import java.util.Scanner;

public abstract class Phone implements Calling {

    String name;
    String userPlace;
    boolean on;

    public Phone() {
        this.name = "телефон";
        this.userPlace = "там где есть телефон";
        this.on = true;
    }

    public String getName() {
        return name;
    }

    public String getUserPlace() {
        return userPlace;
    }

    public boolean isOn() {
        return on;
    }
    
    @Override
    public void calling() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите номер телефона >> \n");
        int number = iScanner.nextInt();
        iScanner.close();
        System.out.printf("Идет звонок по номеру: %n ...", number);
    }

    @Override
    public void receiveCalls() {
        System.out.printf("Вам звонит %s!!!", this.name);        
    }

    @Override
    public String toString() {
        if (this.on) { return String.format("Вы используете %s", this.name); }
        return String.format("Вы пытаетесь использовать %s, но он выключен", this.name);
    }
}