package first_spring;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import constructor.injection.Question;  

public class Test {  
	public static void main(String[] args) {  
		Resource resource=new ClassPathResource("applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(resource);  

//		Student student=(Student)factory.getBean("studentbean");  
//		student.displayInfo(); 
//		
//		Employee s = (Employee)factory.getBean("employee");
//		s.show();
//		
		Question q = (Question)factory.getBean("q");
		q.displayInfo();
	}  
}  