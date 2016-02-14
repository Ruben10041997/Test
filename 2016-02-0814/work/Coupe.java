package work;

import java.util.ArrayList;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
public class Coupe extends SportGearbox implements Car,ClimateControl,MultimediaSystem,Engine {

    MultimediaSystem boss;
    String mark;
    String model;
    int power = 666;
    int costOf = 9000000;
    public static boolean crash;
    public static int engineRpm = 0;
    double engineTemp;



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
    public void toWarm() {
        System.out.println("Подогреем");
    }

    @Override
    public void toBlow() {
        System.out.println("Ветерок");
    }

    @Override
    public void gainTracrion() {
        engineRpm=engineRpm+1000;
        engineTemp++;
        if (engineRpm > 10000){
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
        System.out.println("Включаем попсу");
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

        int oilLvl = 5;
        int engTemp = 100;
        int fuelLvl = 3;
        int mileage = 9999;
        int oiltemp = 120;

        information.add(0, "Уровень масла - " + oilLvl);
        information.add(1, "Температура двигателя - " + engTemp);
        information.add(2, "Уровень топлива - " + fuelLvl);
        information.add(3, "Общий пробег - " + mileage);
        information.add(4, "Температура масла - " + oiltemp);

        for (String string: information)
            System.out.println(string);

        return information;
    }
}
