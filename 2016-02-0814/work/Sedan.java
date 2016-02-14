package work;

import java.util.ArrayList;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
public class Sedan extends AutomaticalWindowRaiser implements  Car, Engine, Seat, MultimediaSystem, ClimateControl,Gearbox {

    String model;
    String mark;
    public  static int gears = 1;
    Gearbox mechanic;
    double gearsRelation;
    public static boolean crash;
    public static int engineRpm = 0;
    double engineTemp;

    int getGears(){
        return gears;
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

    @Override
    public void toCool() {
        System.out.println("Охладим");
    }

    @Override
    public void toMove() {
        System.out.println("Переместим сиденье");
    }

    @Override
    public void toWarm() {
        System.out.println("Подогреем");
    }

    @Override
    public void toDoMassag() {
        System.out.println("Сделаем массаж");
    }

    @Override
    public void toBlow() {
        System.out.println("Ветерок");
    }

    @Override
    public void gainTracrion() {
        engineRpm=engineRpm+1000;
        engineTemp++;
        if (engineRpm > 11000){
            explode();
            crash = true;
        }

        else
            System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public void reduceTracrion() {
        engineRpm=engineRpm-1000;
        engineTemp--;
        System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public BrokenEngine explode() {
        System.out.println("Мотор перегрелся");
        return new BrokenEngine();}

    @Override
    public void toEnableMusic() {
        System.out.println("Влючим музычку");
    }

    @Override
    public ClimateControl toEnableCLimateControl() {
        return new ClimateControl() {
            @Override
            public void toCool() {
                System.out.println("Охладить");
            }

            @Override
            public void toWarm() {
                System.out.println("Подогреть");

            }

            @Override
            public void toBlow() {
                System.out.println("Продуть");
            }
        };
    }

    @Override
    public ArrayList<String> toSeeInfromation() {
        ArrayList<String> information = new ArrayList<>();

        int oilLvl = 3;
        int engTemp = 90;
        int fuelLvl = 2;
        int mileage = 199999;
        int oiltemp = 110;

        information.add(0, "Уровень масла - " + oilLvl);
        information.add(1, "Температура двигателя - " + engTemp);
        information.add(2, "Уровень топлива - " + fuelLvl);
        information.add(3, "Общий пробег - " + mileage);
        information.add(4, "Температура масла - " + oiltemp);

        for (String string: information)
            System.out.println(string);

        return information;

    }


    @Override
    public String toIncreaseGear() {
        if ((Hatchback.engineRpm>=7000)&&(gears<=6)){
            gears++;
            Hatchback.engineRpm=Hatchback.engineRpm-3000;
            String b ="Текущая передача - " + getGears();
            return b;
        } else if (((Hatchback.engineRpm<7000)&&(gears<=6))){
            String b  = "Недостаточно оборотов для переключения передачи!";
            return b;}
        else {
            String b = "Максимальная передача!";
            return b;}
    }

    @Override
    public String toDescreaseGear() {
        if ((Hatchback.engineRpm<4000)&&(gears>1)){
            gears--;
            Hatchback.engineRpm=Hatchback.engineRpm+3000;
            String showGear = "Текущая передача - " + getGears();
            return showGear;
        } else if (((Hatchback.engineRpm>=4000)&&(gears>1))){
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
}
