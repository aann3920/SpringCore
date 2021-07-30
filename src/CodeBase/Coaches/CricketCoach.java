package CodeBase.Coaches;

import CodeBase.OtherServices.FortuneService;
import CodeBase.OtherServices.ReadFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Autowired
    @Qualifier("readFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return ">> CricketCoach : "+fortuneService.getFortune();
    }
}
