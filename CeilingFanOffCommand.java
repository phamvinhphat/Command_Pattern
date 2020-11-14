
public class CeilingFanOffCommand implements Command {
	CeilingFan ceiling;
	
	public CeilingFanOffCommand(CeilingFan ceiling) {
		this.ceiling = ceiling;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ceiling.off();
	}
	
}
