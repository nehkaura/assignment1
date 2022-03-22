package SimpleRemoteController;

public class TurnOffLightCommand implements ElectroicCommand {

    Light light;

    public TurnOffLightCommand(Light light) {
        super();
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning off light.");
        light.turnOff();
    }
}