public class OfficePhone extends HomePhone implements SendingFax {

    @Override
    public void sendingFax() {
        System.out.println("Факс отправляется...");
    }

    @Override
    public void receiveFax() {
        System.out.println("Вам пришел факс!!!");
    }
    
}
