public class Main {
    public static void main(String[] args){
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.setNumber("89291239491");
        phone2.setNumber("89563712312");
        phone3.setNumber("89654231024");
        phone1.setModel("IPhone");
        phone2.setModel("Samsung");
        phone3.setModel("Honor");
        phone1.setWeight(120d);
        phone2.setWeight(200d);
        phone3.setWeight(150d);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("Alex");
        phone2.receiveCall("Sanya");
        phone3.receiveCall("Vasya");
        System.out.println();

        Phone phone4 = new Phone("895274683","Tecno Pova", 120D);
        System.out.println(phone4);
        phone4.receiveCall("Max", "8963467282");

        phone4.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());


    }
}
