package CodeBase.Coaches;

import CodeBase.OtherServices.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach{

    /*Field Injection Directly.
    @Autowired
    private FortuneService fortuneService;
    */

    private FortuneService fortuneService;
    //Constructor Injection

    /*@Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;
*/

    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /*Method Injection
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
*/
    /*
    // Setter Injection using Autowired
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */
    @Override
    public String getDailyWorkout() {
        return "This is a new project. And the Workout for today is 100 jumping jacks\n";
    }

    @Override
    public String getDailyFortune() {
        return ">> TennisCoach : Poda Dei!!\n"+fortuneService.getFortune();
    }

    @PostConstruct
    public void init_method()
    {
        System.out.println(">>Tennis Coach - init_Method : This is the init method which is being called when the Bean is constructed");

    }

    @PreDestroy
    private void destory_method()
    {
        System.out.println(">>Tennis Coach - Destory_Method : This is the final destruction method called when the bean is cleared.");
    }
}
