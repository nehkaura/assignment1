package SimpleRemoteController;

public class RemoteControl {

    ElectroicCommand command;

    public void setCommand(ElectroicCommand command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}