package CodeBase.OtherServices;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "HappyFortuneService : Today's a great day Anand!.";

    }
}
