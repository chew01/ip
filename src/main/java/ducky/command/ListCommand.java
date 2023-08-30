package ducky.command;

import ducky.Storage;
import ducky.TaskList;
import ducky.UserInterface;

/**
 * Represents a command that lists all tasks in Ducky's task list.
 */
public class ListCommand extends Command {

    /**
     * Constructs a command that lists all tasks in Ducky's task list.
     */
    public ListCommand() {}

    /**
     * Prints each task on each line as their printable form on the user interface.
     * @param taskList TaskList of Ducky chatbot instance.
     * @param ui UserInterface of Ducky chatbot instance.
     * @param storage Storage module of Ducky chatbot instance.
     */
    @Override
    public void execute(TaskList taskList, UserInterface ui, Storage storage) {
        ui.showMessagePerLine(taskList.getPrintableList());
    }
}
