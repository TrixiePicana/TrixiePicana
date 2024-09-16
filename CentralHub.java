package commandPattern;

public class CentralHub
{
    Light lightathome; Command lightOff; wallSwitch wallSwitch;

    public CentralHub()
    {
        lightathome = new Light();
        lightOff = new TurnOffCommand(lightathome);
        wallSwitch = new wallSwitch();
        wallSwitch.setCommand(lightOff);
        wallSwitch.pressSwitch();
    }

    public static void main(String[] args)
    {
        new CentralHub();
    }
}
