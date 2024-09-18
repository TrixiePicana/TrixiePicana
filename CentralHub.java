package commandPattern;

public class centralHub //Client class
{
    public static void main(String[] args)
    {
        Light livingRoomLight = new Light(); //Create devices.
        Thermostat temperature = new Thermostat();
        Videoplayer_in_PC volume = new Videoplayer_in_PC();

        Command lightOn = new LightOnCommand(livingRoomLight); //Create Commands.
        Command lightOff = new TurnOffCommand(livingRoomLight);
        Command increaseTemperature = new IncreaseTempCommand(temperature);
        Command decreaseTemperature = new DecreaseTempCommand(temperature);
        Command increaseVolume = new IncreaseVolCommand(volume);
        Command decreaseVolume = new DecreaseVolCommand(volume);

        lightSwitch button = new lightSwitch(); //Issue Commands.
        button.addCommand(lightOn);
        button.addCommand(lightOff);

        remoteControl thermostatButton = new remoteControl();
        thermostatButton.addCommand(increaseTemperature);
        thermostatButton.addCommand(decreaseTemperature);

        Mouse mouse = new Mouse();
        mouse.addCommand(increaseVolume);
        mouse.addCommand(decreaseVolume);

        button.executeCommands();
        thermostatButton.executeCommands();
        mouse.executeCommands();
    }

}
