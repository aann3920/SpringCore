package CodeBase.Main;

import CodeBase.Coaches.Coach;
import CodeBase.Configuration.NoScanConfig;
import CodeBase.Configuration.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBeanConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NoScanConfig.class);

        Coach thecoach = context.getBean("FootballCoach",Coach.class);

        System.out.println(thecoach.getDailyFortune());

        System.out.println(thecoach.getDailyWorkout());

        context.close();


    }
}
