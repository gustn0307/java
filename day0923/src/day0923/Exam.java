package day0923;

import java.util.Scanner;

public class Exam {
	// ���� ����
	String name;
	int kor,eng,mat,tot;
	double avg;
	
	public void input() { // Ű����� �ʵ� �Է¹ޱ�
		Scanner in =new Scanner(System.in); //Scanner ��ü ����
		System.out.print("�̸�: ");
		name=in.nextLine(); // ���� ���� �̸� �Է¹ޱ�
		
		do //0 �̻� 100 ���� ���� �Է� �ޱ�(����ó�� ����)
		{	
			if((kor<0)||(kor>100)) //0 �̻� 100 ����
			{
				System.out.print("���� ����(0 ~ 100) �������� ���Է�:"); // ���Է� �䱸
				kor=in.nextInt(); // kor ������ Ű����κ��� ���� �� ����
			}
			else //0 �̻� 100 ���ϰ� �ƴ� ��
			{
				System.out.print("���� ����(0 ~ 100):"); // �Է� �䱸
				kor=in.nextInt(); // kor ������ Ű����κ��� ���� �� ����
			}
			
		}while((kor<0)||(kor>100));
		
		do //0 �̻� 100 ���� ���� �Է� �ޱ�(����ó�� ����)
		{		
			if((eng<0)||(eng>100)) //0 �̻� 100 ����
			{
				System.out.print("���� ����(0 ~ 100) �������� ���Է�:"); // ���Է� �䱸
				eng=in.nextInt(); // eng ������ Ű����κ��� ���� �� ����
			}
			else //0 �̻� 100 ���ϰ� �ƴ� ��
			{
				System.out.print("���� ����(0 ~ 100):"); // �Է¿䱸
				eng=in.nextInt(); // eng ������ Ű����κ��� ���� �� ����
			}
			
		}while((eng<0)||(eng>100));
			
		
		do //0 �̻� 100 ���� ���� �Է� �ޱ�(����ó�� ����)
		{	
			if((mat<0)||(mat>100)) //0 �̻� 100 ������ ��
			{
				System.out.print("���� ����(0 ~ 100) �������� ���Է�:"); // ���Է¿䱸
				mat=in.nextInt();  // mat ������ Ű����κ��� ���� �� ����
			}
			else //0 �̻� 100 ���ϰ� �ƴ� ��
			{
				System.out.print("���� ����(0 ~ 100):"); // �Է¿䱸
				mat=in.nextInt(); // mat ������ Ű����κ��� ���� �� ����
			}
			
		}while((mat<0)||(mat>100));
		
		in.close(); // �Է� ��Ʈ�� �ݱ�
	}
	
	public void calcAvg() { // ��� ���
		avg=tot/3.0; // 3.0���� ������ auto casting(double)
	}
	
	public void calcTot() { // ���� ���
		tot=kor+eng+mat; // �������� + �������� + �������� = ����
	}
	
	public void display() { // ���
		System.out.println("�̸�: "+name); // �̸� ���
		System.out.println("���� ����: "+kor); // ���� ���� ���
		System.out.println("���� ����: "+eng); // ���� ���� ���
		System.out.println("���� ����: "+mat); // ���� ���� ���
		System.out.println("����: "+tot); // ���� ���
		System.out.printf("���: %.2f",avg); // ��� ���
	}	
}
