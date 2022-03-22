package SimpleRemoteController;

public class TurnOnLightCommand implements ElectroicCommand {

    Light light;

    public TurnOnLightCommand(Light light) {
        super();
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning on light....");
        light.turnOn();
    }
}