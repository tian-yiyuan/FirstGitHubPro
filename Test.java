package cn.kgc.yichang;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入课程代号（1-3之间的数字）：");
		try {
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("JAVA课程");
				break;
			case 2:
				System.out.println("C#课程");
				break;
			case 3:
				System.out.println("数据库课程");
				break;
			default :
				System.err.println("请输入1-3之间的数字！！！");
				break;
			}
		} catch (Exception e) {
			System.err.println("输入错误！！！");
		}finally {
			System.out.println("欢迎提出建议！");
		}
		
	}

}
