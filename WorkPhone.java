import java.util.Random;

public class WorkPhone extends MobilePhone {
    
    public WorkPhone() {
        super.name = "Рабочий телефон";
        super.userPlace = "Везде";
        Random r = new Random();
        boolean onOff = r.nextBoolean();
        super.on = onOff;
    }
}
