import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Junior hireJunior(){
        return new Junior();
    }

    @Bean
    public Middle hireMiddle(){
        return new Middle();
    }

    @Bean
    public Senior hireSenior(){
        return new Senior();
    }
}
