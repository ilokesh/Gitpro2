import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {
	public static void main(String[] args) {



		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Application.xml"));
	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = (Employee) beanFactory.getBean("obj");
		System.out.println(emp.toString());
		

	}
}