package SimpleRemoteController;

public class UserTest {
    public static void main(String[] args) {
        Light light1 = new Light();

        Cooler cooler1 = new Cooler();

        Light light2 = new Light();

        Cooler cooler2 = new Cooler();

        Fan fan1 = new Fan();

        RemoteControl remote = new RemoteControl();

        remote.setCommand(new TurnOnLightCommand( light1 ));
        remote.buttonPressed();

        remote.setCommand(new TurnOnLightCommand(light2));
        remote.buttonPressed();

        remote.setCommand(new TrunOnCoolerCommand(cooler1));
        remote.buttonPressed();

        remote.setCommand(new TrunOffCoolerCommand(cooler1 ));
        remote.buttonPressed();

        remote.setCommand(new TrunOnCoolerCommand( cooler2 ));
        remote.buttonPressed();

        remote.setCommand(new TrunOffCoolerCommand( cooler2 ));
        remote.buttonPressed();

        //user test code with bug

        remote.setCommand(new TurnOnFanCommand(fan1));
        remote.buttonPressed();

        remote.setCommand(new TrunOffFanCommand(fan1));
        remote.buttonPressed();


    }
}
