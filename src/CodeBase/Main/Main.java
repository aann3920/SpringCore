package CodeBase.Main;

import CodeBase.Coaches.Coach;
import CodeBase.OtherServices.ReadFortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ReadFortuneService coach = context.getBean("readFortuneService", ReadFortuneService.class);

        //System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getFortune());

        context.close();
    }
}
