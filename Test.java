package cn.kgc.yichang;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������γ̴��ţ�1-3֮������֣���");
		try {
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("JAVA�γ�");
				break;
			case 2:
				System.out.println("C#�γ�");
				break;
			case 3:
				System.out.println("���ݿ�γ�");
				break;
			default :
				System.err.println("������1-3֮������֣�����");
				break;
			}
		} catch (Exception e) {
			System.err.println("������󣡣���");
		}finally {
			System.out.println("��ӭ������飡");
		}
		
	}

}
