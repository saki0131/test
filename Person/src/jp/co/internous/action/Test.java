package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="taro@gamil.com";

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="111-1111-1111";
		jiro.address="jiro@gmail.com";

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="222-2222-2222";
		hanako.address="hanako@gmail.com";

		Person saki=new Person();
		saki.name="朝比奈沙紀";
		saki.age=27;
		saki.phoneNumber="333-3333-3333";
		saki.address="saki@gamil.com";

		Robot aibo=new Robot();
		aibo.name="aibo";

		Robot asimo=new Robot();
		asimo.name="asimo";

		Robot pepper=new Robot();
		pepper.name="pepper";


	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);
	taro.talk();
	taro.walk();
	taro.run();

	System.out.println(jiro.name);
	System.out.println(jiro.age);
	System.out.println(jiro.phoneNumber);
	System.out.println(jiro.address);
	jiro.talk();
	jiro.walk();
	jiro.run();

	System.out.println(hanako.name);
	System.out.println(hanako.age);
	System.out.println(hanako.phoneNumber);
	System.out.println(hanako.address);
	hanako.talk();
	hanako.walk();
	hanako.run();

	System.out.println(saki.name);
	System.out.println(saki.age);
	System.out.println(saki.phoneNumber);
	System.out.println(saki.address);
	saki.talk();
	saki.walk();
	saki.run();

	aibo.talk();
	aibo.walk();
	aibo.run();

	asimo.talk();
	asimo.walk();
	asimo.run();

	pepper.talk();
	pepper.walk();
	pepper.run();



	}

}
