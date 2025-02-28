package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.services.PrototypeBean;
import guru.springframework.sfgdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.springframework.pets"})
//@ImportResource("classpath:sfgdi-config.xml")
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = (PetController) context.getBean("petController");
		System.out.println("----------The Best Pet is");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) context.getBean("myController");
		System.out.println("----------Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("----------Property");
		PropertyInjectionController propertyInjectionController =
				(PropertyInjectionController) context.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("----------Setter");
		SetterInjectionController setterInjectionController =
				(SetterInjectionController) context.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("----------Constructor");
		ConstructorInjectionController constructorInjectionController =
				(ConstructorInjectionController) context.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.getGreeting());



		System.out.println("----------Bean Scope");
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());


		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());
	}
}
