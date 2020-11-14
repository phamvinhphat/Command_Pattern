
public class CeilingFanOnCommand implements Command{
	CeilingFan ceiling;
	
	public CeilingFanOnCommand(CeilingFan ceiling) {
		this.ceiling = ceiling;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ceiling.on();
	}
}
