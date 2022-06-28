package day0916;

public class MainTest01 {

	public static void main(String[] args) {
		DmbCellPhone dmb=new DmbCellPhone("자바폰", "파랑", 10);
		
		// 상속받은 클래스의 멤버변수
		System.out.println("모델: "+dmb.model); 
		System.out.println("색상: "+dmb.color);
		
		System.out.println("채널: "+dmb.channel);
		
		// 상속받은 메소드
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("안녕하세요");
		dmb.receiveVoice("여보세요");
		dmb.hangUp();
		
		
		dmb.turnOnDmb();
		
		for(int i=1;i<=20;i++)
			dmb.changeChannelDmb(i);
	
		dmb.turnOffDmb();
		dmb.powerOff();
		
	}

}
