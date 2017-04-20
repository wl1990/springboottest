package springanotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClasspathXmlApplicationContext extends ClassPathXmlApplicationContext{
		public MyClasspathXmlApplicationContext(String... configLocations){
			super(configLocations);
		}
		
		protected void initPropertySources(){
			getEnvironment().setRequiredProperties("VAR");
		}
	
}
