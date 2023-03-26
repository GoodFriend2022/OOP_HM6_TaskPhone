public class Main {
    public static void main(String[] args) {
        WorkTime wt = new WorkTime();
        WorkPhone phone = new WorkPhone();
        MobilePhone iphone = new MobilePhone();
        HomePhone hphone = new HomePhone();
        OfficePhone ophone = new OfficePhone();

        if (wt.isWork()) {
            phone.sendingSMS();
            System.out.println(phone.toString());
            ophone.sendingFax();
        }
        iphone.receiveEmail();
        System.out.println(iphone.toString());
        hphone.calling();
    }
}
