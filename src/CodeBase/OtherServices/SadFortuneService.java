package CodeBase.OtherServices;

public class SadFortuneService implements FortuneService{


    @Override
    public String getFortune() {
        return ">>SadFortuneService : You can't do anything today!.";
    }
}
