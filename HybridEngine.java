package work;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
public class HybridEngine implements Engine {
   int engineRpm;
   int engineTemp;
    boolean crash = false;
    String model;
    Engine hybrid;


    @Override
    public void gainTracrion() {
        System.out.println("Повышаем обороты");
        engineRpm=engineRpm+2000;
        engineTemp++;
        if (engineRpm > 12000){
            explode();
            crash = true;
        }

        else
            System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public void reduceTracrion() {
        System.out.println("Понижаем обороты");
        engineRpm=engineRpm-2000;
        engineTemp--;
        System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public BrokenEngine explode() {
        System.out.println("Мотор перегрелся");
        return new BrokenEngine();}
}
