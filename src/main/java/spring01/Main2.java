package spring01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext1.xml");
		
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g1 == g2);
		ctx.close();
	}
}