package work;
import work.Hatchback;
import java.util.ArrayList;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
public class Main {
int ride;

    public static void main(String[] args) {
        Hatchback Kalina = new Hatchback();
        AutomaticalWindowRaiser windowRaiser  = new AutomaticalWindowRaiser();
        HybridEngine hybridEngine = new HybridEngine();

            hybridEngine.gainTracrion();
            Kalina.toSeeInfromation();
            Kalina.toEnableMusic();
            Kalina.toEnableCLimateControl().toBlow();
            windowRaiser.toDown();
            Kalina.toEnableCLimateControl().toCool();


        //fastestCoupe.toBlow() - не вызовется, позднее связывание
      Car fastCoupe = new Coupe();
        Coupe fastestCoupe = new Coupe();
        fastestCoupe.toDrive();
        fastCoupe.toDrive();


       /*     Kalina.toDrive();
            System.out.println();
             while (!Kalina.crash) {
            Kalina.gainTracrion();
                 if ((Kalina.engineRpm>6000)&&((Kalina.getGears()<6))){
                     System.out.println(Kalina.toIncreaseGear());
                     Kalina.toIncreaseGear();
                     }
        }*/



    }
}
