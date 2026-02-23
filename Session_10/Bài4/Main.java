package Session_10.Bài4;

public class Main {
    public static void main(String[] args) {
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }

            @Override
            public void checkBattery() {
                RemoteControl.super.checkBattery();
            }
        };
        smartLight.checkBattery();
        smartLight.powerOn();

    }
}
