package oop.hus.lab11.bridge.pseudocode;

public class BridgeTestDrive {
    public static void main(String[] args) {
        System.out.println("Test with basic remote:");
        Tv tv = new Tv();
        Remote remote = new RemoteControl(tv);
        remote.togglePower();
        System.out.println(tv.getVolume());
        remote.volumeDown();
        System.out.println(tv.getVolume());

        System.out.println("\nTest with advanced remote");
        Radio radio = new Radio();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        advancedRemoteControl.togglePower();
        advancedRemoteControl.mute();
        System.out.println(radio.getVolume());
    }
}
