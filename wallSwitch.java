package commandPattern;

public class wallSwitch
{
    private Command command;

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void pressSwitch()
    {
        command.execute();
    }
}
