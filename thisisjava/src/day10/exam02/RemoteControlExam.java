package day10.exam02;

public class RemoteControlExam {

	public static void main(String[] args) {
		//인터페이스 변수선언
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(6);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(12);
		
		rc.setMute(true);
		RemoteControl.changeBattery();
	}

}
