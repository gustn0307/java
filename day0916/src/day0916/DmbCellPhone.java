package day0916;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		// this.model=model; // ��ӹ��� �ʵ�
		// this.color=color; // ��ӹ��� �ʵ�
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("channel: " + channel + "�� DMB ��ۼ����� �����մϴ�.");
	}

	void turnOffDmb() {
		System.out.println("DMB ��ۼ����� �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��: " + channel + "������ ����");

	}
}
