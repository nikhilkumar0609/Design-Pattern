package CommandDesignPattern.Command;

import CommandDesignPattern.Receiver.AirConditioner;

public class TurnACOffCommand implements ICommand{
	
	AirConditioner ac;
	
	public TurnACOffCommand(AirConditioner ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		ac.turnOffAc();
	}

	@Override
	public void undo() {
		ac.turnOnAc();
	}

}
