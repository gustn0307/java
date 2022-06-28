package day0916;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		// this.model=model; // 상속받은 필드
		// this.color=color; // 상속받은 필드
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("channel: " + channel + "번 DMB 방송수신을 시작합니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송수신을 종료합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번으로 변경");

	}
}
