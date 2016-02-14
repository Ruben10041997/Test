package work;

import java.util.ArrayList;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
public class Hatchback extends SportGearbox implements Car, MultimediaSystem, Seat, Engine {


    String  mark;
    String model;
    MultimediaSystem pioneer;
    Engine v10;
    public static boolean crash;
    public static int engineRpm = 0;
    double engineTemp;



    @Override
    public void toEnableMusic() {

        System.out.println("Включить Арабские миксы");

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
    public void toDrive() {
        System.out.println("Едем, едем, едем в соседнее село");
    }

    @Override
    public void toBrake() {
        System.out.println("Тормозим");
    }

    @Override
    public void toUseHeadlights() {
        System.out.println("Включим фары");
    }

    @Override
    public void toWindowRise() {
        System.out.println("Опустим стёкла");
    }


    @Override
    public void toMove() {
        System.out.println("Переместим сидение для удобства");
    }

    @Override
    public void toWarm() {
        System.out.println("Подогреем сидение");
    }

    @Override
    public void toDoMassag() {
        System.out.println("Включим массаж");
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
}
