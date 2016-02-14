package work;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
public class Jeep extends DieselEngine implements Car, Gearbox {

    String model;
    String mark;
    public  static int gears = 1;
    Gearbox mechanics;
    double gearsRelation;

    int getGears(){
        return gears;
    }

    @Override
    public String toIncreaseGear() {
        if ((Hatchback.engineRpm>=5000)&&(gears<=6)){
            gears++;
            Hatchback.engineRpm=Hatchback.engineRpm-2000;
            String b ="Текущая передача - " + getGears();
            return b;
        } else if (((Hatchback.engineRpm<3000)&&(gears<=4))){
            String b  = "Недостаточно оборотов для переключения передачи!";
            return b;}
        else {
            String b = "Максимальная передача!";
            return b;}
    }

    @Override
    public String toDescreaseGear() {
        if ((Hatchback.engineRpm<3000)&&(gears>1)){
            gears--;
            Hatchback.engineRpm=Hatchback.engineRpm+2000;
            String showGear = "Текущая передача - " + getGears();
            return showGear;
        } else if (((Hatchback.engineRpm>=3000)&&(gears>1))){
            String b  = "Слишком много оборотов для понижения передачи!";
            return b;}
        else {
            String b = "Минимальная передача!";
            return b;}
    }

    @Override
    public String toNeutral() {
        Hatchback.engineRpm=0;
        String b ="Вы в нейтральном режиме";
        return b;
    }


    @Override
    public void toDrive() {
        System.out.println("Погнали!");
    }

    @Override
    public void toBrake() {
        System.out.println("Притормозим");
    }

    @Override
    public void toUseHeadlights() {
        System.out.println("Включим ксеноновые фары");
    }

    @Override
    public void toWindowRise() {
        System.out.println("Поднимаем стекло");
    }
}
