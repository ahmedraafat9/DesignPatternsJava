import java.util.ArrayList;

public class RemoteControl {

    public ArrayList<Command> commands;

    public RemoteControl(){
        commands = new ArrayList<Command>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeCommands(){
        for (Command command : commands){
            command.execute();
        }
    }
}
