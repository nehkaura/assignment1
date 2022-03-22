package SimpleRemoteController;

public class TrunOffFanCommand implements ElectroicCommand {

    Fan fan;

    public TrunOffFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    public void execute() {
        System.out.println("stopping fan........");
        fan.stop();
    }
}