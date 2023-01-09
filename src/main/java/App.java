import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanAdditional = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println("HelloWorld pair: " + (bean == beanAdditional));

        Cat catFirst = (Cat) applicationContext.getBean("cat");
        Cat catSecond = (Cat) applicationContext.getBean("cat");

        System.out.println("Cat pair: " + (catFirst == catSecond));
    }
}