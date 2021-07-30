package CodeBase.Main;

import CodeBase.Coaches.Coach;
import CodeBase.Coaches.CricketCoach;
import CodeBase.Coaches.SwimCoach;
import CodeBase.OtherServices.ReadFortuneService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Properties {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("swimCoach", SwimCoach.class);

        CricketCoach coach1 = context.getBean("cricketCoach",CricketCoach.class);

        //System.out.println(coach.getDailyWorkout());

       // System.out.println(coach.getDailyFortune());
        //System.out.println(((SwimCoach) coach).getEmail());

        System.out.println(coach1.getDailyFortune());

        context.close();
    }
}
