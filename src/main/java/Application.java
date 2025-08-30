import com.purelydauntless.service.SpeakerService;
import com.purelydauntless.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        //engaing spring into our main method, creating a new instance of Spring's IOC Container
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

       /* SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service); //Prints out the address, and we can see it's the same as service2,
        // hence the bean is singleton type

        System.out.println(service.findAll().get(0).getFirstName());

        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2);

        */

        SpeakerService service = appContext.getBean("speakerService", SpeakerServiceImpl.class);
        System.out.println(service.findAll().get(0).getFirstName());

        //SpeakerService service = new SpeakerServiceImpl();;
    }
}
