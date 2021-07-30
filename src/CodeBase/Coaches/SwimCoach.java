package CodeBase.Coaches;

import CodeBase.OtherServices.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Value("${email}")
    private String email;

    @Value("${name}")
    private String name;

    @Value("${team}")
    private String team;


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return ">> Swim Coach : "+fortuneService.getFortune();
    }
}
