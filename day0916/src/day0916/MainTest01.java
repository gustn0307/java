package day0916;

public class MainTest01 {

	public static void main(String[] args) {
		DmbCellPhone dmb=new DmbCellPhone("�ڹ���", "�Ķ�", 10);
		
		// ��ӹ��� Ŭ������ �������
		System.out.println("��: "+dmb.model); 
		System.out.println("����: "+dmb.color);
		
		System.out.println("ä��: "+dmb.channel);
		
		// ��ӹ��� �޼ҵ�
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("�ȳ��ϼ���");
		dmb.receiveVoice("��������");
		dmb.hangUp();
		
		
		dmb.turnOnDmb();
		
		for(int i=1;i<=20;i++)
			dmb.changeChannelDmb(i);
	
		dmb.turnOffDmb();
		dmb.powerOff();
		
	}

}
