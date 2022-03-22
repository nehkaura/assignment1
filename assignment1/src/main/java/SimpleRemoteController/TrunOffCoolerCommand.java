package SimpleRemoteController;

public class TrunOffCoolerCommand implements ElectroicCommand {

    Cooler cooler;

    public TrunOffCoolerCommand(Cooler cooler) {
        super();
        this.cooler = cooler;
    }

    public void execute() {
        System.out.println("stopping Cooler........");
        cooler.stop();
    }
}