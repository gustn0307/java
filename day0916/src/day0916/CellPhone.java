package day0916;

public class CellPhone {
	String model;
	String color;
	
	public CellPhone(String model, String color) {
		this.model=model; 
		this.color=color;
	}

	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	void bell(){
		System.out.println("���� �︳�ϴ�.");
	}
	
	void sendVoice(String msg) {
		System.out.println("��: "+msg);
	}
	
	void receiveVoice(String msg) {
		System.out.println("����: "+msg);
	}
	
	void hangUp() {
		System.out.println("��ȭ ����");
	}
}
