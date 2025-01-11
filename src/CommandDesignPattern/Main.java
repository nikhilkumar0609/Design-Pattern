package CommandDesignPattern;

import CommandDesignPattern.Command.TurnACOffCommand;
import CommandDesignPattern.Command.TurnACOnCommand;
import CommandDesignPattern.Invoker.MyRemoteController;
import CommandDesignPattern.Receiver.AirConditioner;

public class Main {

	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		
		MyRemoteController remote = new MyRemoteController();		
		remote.setCommand(new TurnACOnCommand(ac));
		remote.pressButton();
		remote.undo();
		
		MyRemoteController remote1 = new MyRemoteController();		
		remote1.setCommand(new TurnACOffCommand(ac));
		remote1.pressButton();
		remote1.undo();
	}

}
