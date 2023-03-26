public class OfficePhone extends HomePhone implements SendingFax {

    public OfficePhone() {
        super.name = "рабочий стационарный телефон";
        super.userPlace = "Офис";
        super.on = true;
    }
    
    
    @Override
    public void sendingFax() {
        System.out.println("Факс отправляется...");
    }

    @Override
    public void receiveFax() {
        System.out.println("Вам пришел факс!!!");
    }
    
}
