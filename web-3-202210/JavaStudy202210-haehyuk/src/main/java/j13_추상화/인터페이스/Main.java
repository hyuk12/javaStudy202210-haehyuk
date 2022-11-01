package j13_추상화.인터페이스;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new PowerButton(), new VolumeDownButton(), new VolumeUpButton());

        remoteControl.onPressedPowerButton();
        remoteControl.onPressedPowerButton();
        remoteControl.onPressedPowerButton();
        remoteControl.onPressedVolumeUpButton();
        remoteControl.onPressedVolumeDownButton();

        remoteControl.onDownVolumeUpButton();
        remoteControl.onDownVolumeDownButton();
    }
}
