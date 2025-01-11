package CommandDesignPattern.Invoker;

import java.util.Stack;

import CommandDesignPattern.Command.ICommand;

public class MyRemoteController {
	
	ICommand command;
	Stack<ICommand> acCommandHistory = new Stack<>();
	
	public MyRemoteController() {
		
	}
	
	public void setCommand(ICommand command) {
		this.command = command; 
	}
	
	public void pressButton() {
		command.execute();
		acCommandHistory.add(command);
	}
	
	public void undo() {
		if(!acCommandHistory.isEmpty()) {
			ICommand lastCommand = acCommandHistory.pop();
			lastCommand.undo();
		}
	}
	
}
