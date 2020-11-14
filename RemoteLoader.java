
public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		
		Light kitchenLight = new Light("Kitchen");
		
		CeilingFan ceeilingFan = new CeilingFan("Living Room");
		
		GarageDoor garageDoor = new GarageDoor("");
		
		Stereo stereo = new Stereo("Living room");
		
		// mở đèn phòng khách
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		
		// tắt đèn phòng khách
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		// Mở đèn bếp
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight );
		
		// tắt đèn nhà bếp 
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight );
		
		// bật quạt
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceeilingFan);
		
		//tắt quat
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceeilingFan);
	
		// Bật cửa garage
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		
		//tắt cửa garage
		GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
		
		// mở cd
		StereoOnWithCDCommand stereoWithCD = new StereoOnWithCDCommand(stereo);
		
		// tắt 
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn , ceilingFanOff);
		remoteControl.setCommand(3, stereoWithCD, stereoOff);
		
		System.out.println(remoteControl.tostring());
		
		
		System.out.println("===============================\n");
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonPushed(0);
		System.out.println("===============================\n");
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonPushed(1);
		System.out.println("===============================\n");
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonPushed(2);
		System.out.println("===============================\n");
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonPushed(3);

		
		
		
		
		
	}
}
