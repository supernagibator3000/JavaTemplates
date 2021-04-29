import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Junior junior = context.getBean(Junior.class);
        Middle middle = context.getBean(Middle.class);
        Senior senior = context.getBean(Senior.class);

        System.out.println(junior.doCoding());
        System.out.println(middle.doCoding());
        System.out.println(senior.doCoding());
    }
}
