public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.addCommand(new TurnOnLightCommand(light));
        remoteControl.addCommand(new TurnOffLightCommand(light));

        remoteControl.executeCommands();
    }
}