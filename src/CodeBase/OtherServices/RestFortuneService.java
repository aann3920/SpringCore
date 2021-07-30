package CodeBase.OtherServices;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RestFortuneService implements FortuneService {

    @PostConstruct
    public void init_method()
    {
        //int num = random.nextInt(fortunes.length);
        System.out.println(">>RestFortuneService  - init_Method : This is the init method which is being called when the Bean is constructed");

    }

    @Override
    public String getFortune() {
        return ">>Rest Fortune Service :";
    }
}
