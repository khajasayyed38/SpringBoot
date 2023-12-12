package net.javaguide.springbootannotation;

import net.javaguide.springbootannotation.Repository.MyRepository;
import net.javaguide.springbootannotation.controller.MyController;
import net.javaguide.springbootannotation.controller.PizzaController;
import net.javaguide.springbootannotation.lazy.LazyLoader;
import net.javaguide.springbootannotation.propertysource.PropertiesSourceDemo;
import net.javaguide.springbootannotation.scope.PrototypeBean;
import net.javaguide.springbootannotation.scope.SingletonBean;
import net.javaguide.springbootannotation.service.MyService;
import net.javaguide.springbootannotation.service.VegPizza;
import net.javaguide.springbootannotation.value.ValueAnnotationDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAnnotationApplication {


	public static void main(String[] args) {

		var context=SpringApplication.run(SpringbootAnnotationApplication.class, args);
		PizzaController pizzaController = context.getBean(PizzaController.class);
		System.out.println(pizzaController.Pizza());
		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());

		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.helloService());

		MyRepository myRepository = context.getBean(MyRepository.class);
		System.out.println(myRepository.helloRepository());

		LazyLoader lazyLoader = context.getBean(LazyLoader.class);
		VegPizza bean = (VegPizza) context.getBean("vegPizza");
		System.out.println(bean.getPizza());
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());

		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());

		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean3.hashCode());

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());

		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());

		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean3.hashCode());

		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
		System.out.println(valueAnnotationDemo.getDefaultName());
		System.out.println(valueAnnotationDemo.getUserName());
		System.out.println(valueAnnotationDemo.getHost());
		System.out.println(valueAnnotationDemo.getPassword());

		PropertiesSourceDemo propertiesSourceDemo = context.getBean(PropertiesSourceDemo.class);
		System.out.println(propertiesSourceDemo.getEmail());
		System.out.println(propertiesSourceDemo.getPassword());
		System.out.println(propertiesSourceDemo.getUserName());
		System.out.println(propertiesSourceDemo.getHost());
		System.out.println(propertiesSourceDemo.getUsername());
		System.out.println(propertiesSourceDemo.getPassWord());



	}

}
