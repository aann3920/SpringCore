package CodeBase.OtherServices;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    //Create an array of strings

    private String [] data = {"May hay while the sun shines","Mooditu Velaya paaru","Poi pulla kuti padikaveikura vazhiya paaru"};

    Random random = new Random();


    @Override
    public String getFortune() {
        int num = random.nextInt(data.length);

        return ">> RandomFortuneService : " + data[num] + "\n";
    }
}
