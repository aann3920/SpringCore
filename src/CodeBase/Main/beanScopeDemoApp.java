package CodeBase.Main;

import CodeBase.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach trackCoach = context.getBean("tennisCoach",Coach.class);

        Coach aplhaCoach = context.getBean("tennisCoach",Coach.class);

        // Check if both are the same beans (To Check the scope of the beans)

        boolean check = (trackCoach == aplhaCoach);

        //Print the results

        System.out.println("\n Pointing at the same objects : "+ check);

        System.out.println("\n Memory Location of the TrackCoach : "+trackCoach);

        System.out.println("\n Memory Location of the AplhaCoach : "+aplhaCoach);

        context.close();

    }
}
