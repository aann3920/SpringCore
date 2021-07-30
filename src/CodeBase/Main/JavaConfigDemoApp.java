package CodeBase.Main;

import CodeBase.Coaches.Coach;
import CodeBase.Configuration.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach thecoach = context.getBean("tennisCoach",Coach.class);

        System.out.println(thecoach.getDailyFortune());

        System.out.println(thecoach.getDailyWorkout());

        context.close();


    }
}
