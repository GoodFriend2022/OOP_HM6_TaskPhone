import java.util.Random;
import java.util.Scanner;

public class MobilePhone extends Phone implements SendingSMS, SendingEmail {

    public MobilePhone() {
        super.name = "Мобильный телефон";
        super.userPlace = "Везде";
        Random r = new Random();
        boolean onOff = r.nextBoolean();
        super.on = onOff;
    }

    @Override
    public void sendingSMS() {
        if (this.on) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите текст СМС >> \n");
            String sms = iScanner.nextLine();
            iScanner.close();
            System.out.printf("Отправляем СМС: %s ...", sms);
        } else System.out.println("Телефон выключен или нет заряда");
    }

    @Override
    public void sendingEmail() {
        if (this.on) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите текст электронного письма >> \n");
            String email = iScanner.nextLine();
            iScanner.close();
            System.out.printf("Отправляем email: %s ...", email);
        } else System.out.println("Телефон выключен или нет заряда");
    }

    @Override
    public void receiveSMS() {
        if (this.on) { System.out.println("Вам пришло СМС!!!"); }
    }

    @Override
    public void receiveEmail() {
        if (this.on) { System.out.println("Вам пришел email!!!"); }
    }

    
}
