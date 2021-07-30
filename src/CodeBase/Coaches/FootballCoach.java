package CodeBase.Coaches;

import CodeBase.OtherServices.FortuneService;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService thefortuneservice)
    {
        fortuneService = thefortuneservice;
    }

    @Override
    public String getDailyWorkout() {
        return ">>FootBallCoach : Score 5 Goals with Goal Keys";
    }

    @Override
    public String getDailyFortune() {
        return ">>FootballCoach : Nee enna thaan ball kick pannalum, kaathu illati waste thaan \n"+fortuneService.getFortune();
    }
}
