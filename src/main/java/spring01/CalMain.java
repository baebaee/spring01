package spring01;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext3.xml");
		
		Calculator c = ctx.getBean("calculator", Calculator.class);
		
		System.out.println(c.add(10, 5));
		System.out.println(c.minus(5, 2));
		System.out.println(c.mul(5, 3));
		System.out.println(c.div(10, 2));
		
		System.out.println("첫번째 정수를 입력하시오:");
		int a = sc.nextInt();
		System.out.println("첫번째 정수를 입력하시오:");
		int b = sc.nextInt();
		System.out.println("연산자를 입력하시오:");
		String f = sc.nextLine();
		
		ctx.close();
	}
}