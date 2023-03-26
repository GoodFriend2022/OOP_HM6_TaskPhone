import java.util.Scanner;

public class MobilePhone extends Phone implements SendingSMS, SendingEmail {

    public MobilePhone() {
        super.name = "Мобильный телефон";
        super.userPlace = "Везде";
    }

    @Override
    public void sendingSMS() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите текст СМС >> \n");
        String sms = iScanner.nextLine();
        iScanner.close();
        System.out.printf("Отправляем СМС: %s ...", sms);
    }

    @Override
    public void sendingEmail() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите текст электронного письма >> \n");
        String email = iScanner.nextLine();
        iScanner.close();
        System.out.printf("Отправляем email: %s ...", email);
    }

    @Override
    public void receiveSMS() {
        System.out.println("Вам пришло СМС!!!");
    }

    @Override
    public void receiveEmail() {
        System.out.println("Вам пришел email!!!");
    }

    
}
