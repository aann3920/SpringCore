package CodeBase.OtherServices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class ReadFortuneService implements FortuneService{

    @Value("${fortunelist}")
    public String [] fortunes;

    Random random = new Random();
    int num;
    @PostConstruct
    public void init_method()
    {
        int num = random.nextInt(fortunes.length);
        System.out.println(">>ReadFortuneService  - init_Method : This is the init method which is being called when the Bean is constructed");

    }

    @Override
    public String getFortune() {
        num = random.nextInt(fortunes.length);

        return ">> ReadFortuneService : "+fortunes[num];
    }
}
