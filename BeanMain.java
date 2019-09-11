package constructorDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("constructorDependency/beans.xml");
		BeanClass testBean=(BeanClass)context.getBean("bean1");
		testBean.randomMethod();
	}

}
