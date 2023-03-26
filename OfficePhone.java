public class OfficePhone extends HomePhone implements SendingFax {

    public OfficePhone() {
        super.name = "рабочий стационарный телефон";
        super.userPlace = "Офис";
        super.on = true;
    }
    
    @Override
    public void sendingFax() {
        if (this.on) { System.out.println("Факс отправляется...\n"); }
    }

    @Override
    public void receiveFax() {
        if (this.on) { System.out.println("Вам пришел факс!!!\n"); }
    }
    
}
