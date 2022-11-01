package j13_추상화.인터페이스;

public class RemoteControl {

    private PowerButton powerButton;
    private VolumeUpButton vUpButton;
    private VolumeDownButton vDownButton;

    public RemoteControl(PowerButton powerButton, VolumeDownButton vDownButton, VolumeUpButton vUpButton) {
        this.powerButton = powerButton;
        this.vDownButton = vDownButton;
        this.vUpButton = vUpButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedVolumeUpButton() {
        vUpButton.onPressed();
    }

    public void onPressedVolumeDownButton() {
        vDownButton.onPressed();
    }

    public void onDownVolumeUpButton() {
        vUpButton.onDown();
    }

    public void onDownVolumeDownButton() {
        vDownButton.onDown();
    }
}
