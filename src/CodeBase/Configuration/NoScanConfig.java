package CodeBase.Configuration;

import CodeBase.Coaches.Coach;
import CodeBase.Coaches.FootballCoach;
import CodeBase.OtherServices.FortuneService;
import CodeBase.OtherServices.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NoScanConfig {

    //Define a bean for the sad Fortune Service
    @Bean
    public FortuneService sadFortuneService()
    {
        SadFortuneService sadFortuneService = new SadFortuneService();
        return sadFortuneService;
    }


    //Define a bean for the FootBall Coach and Inject Dependency
    @Bean
    public Coach FootballCoach()
    {
        FootballCoach footballCoach = new FootballCoach(sadFortuneService());
        return footballCoach;
    }

}
