package SimpleRemoteController;

public class TrunOnCoolerCommand implements ElectroicCommand {

    Cooler cooler;

    public TrunOnCoolerCommand(Cooler cooler) {
        super();
        this.cooler = cooler;
    }

    public void execute() {
        System.out.println("starting Cooler.....");
        cooler.start();
    }
}