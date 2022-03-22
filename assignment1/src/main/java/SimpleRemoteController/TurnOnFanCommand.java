package SimpleRemoteController;

public class TurnOnFanCommand implements ElectroicCommand {

    Fan fan;

    public TurnOnFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    public void execute() {
        System.out.println("Strating the fan....");
        //bug becz of wrong method is getting called
        fan.stop();
    }
}