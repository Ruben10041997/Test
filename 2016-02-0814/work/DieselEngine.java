package work;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
public class DieselEngine implements Engine {

    Engine diesel;
    int power;
    double fuelConsumption;
    String name;
    int engineRpm;
    int engineTemp;
    boolean crash = false;


    @Override
    public void gainTracrion() {
        engineRpm=engineRpm+1000;
        engineTemp++;
        System.out.println("Жмём на газ");
        if (engineRpm > 8000){
            explode();
            crash = true;
        }

        else
            System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public void reduceTracrion() {
        System.out.println("Тормозим");
        engineRpm=engineRpm-1000;
        engineTemp--;
        System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public BrokenEngine explode() {
        System.out.println("Мотор перегрелся");
        return new BrokenEngine();}
}
