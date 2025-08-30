import com.purelydauntless.repository.SpeakerRepository;
import com.purelydauntless.repository.StubSpeakerRepositoryImpl;
import com.purelydauntless.service.SpeakerService;
import com.purelydauntless.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.purelydauntless"})
/*This annotation tells Spring to scan the
 entire com.purelydauntless package for classes that are marked as Spring components. */

public class AppConfig {
    //this is the central hub for all the spring configuration
    //replaces applicationContext.xml

   /* @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON) //This is default
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
        //AUTOWIRING NOTE - HERE RETURN TYPE IS SpeakerServiceImpl AND SO THE DEPENDENCY SETTER METHOD AUTOMATICALLY GETS INJECTED

        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository()); //So this is setter injection, now above line is
        // constructor injection

    }

    */

   /* @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new StubSpeakerRepositoryImpl();
    }

    */





}
