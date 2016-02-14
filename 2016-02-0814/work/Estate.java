package work;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
public class Estate extends LeatherSits implements  Car, Engine, Gearbox, ClimateControl {

    ClimateControl greatClimateControl;
    int capacity;
    String model;
    String mark;
    public static boolean crash;
    public static int engineRpm = 0;
    double engineTemp;
    public static int gears = 1;

    int getGears() {
        return gears;
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
        engineRpm = engineRpm + 1000;
        engineTemp++;
        if (engineRpm > 10000) {
            explode();
            crash = true;
        } else
            System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public void reduceTracrion() {
        engineRpm = engineRpm - 1000;
        engineTemp--;
        System.out.println("Текущие обороты = " + engineRpm);

    }

    @Override
    public BrokenEngine explode() {
        System.out.println("Мотор перегрелся");
        return new BrokenEngine();
    }

    @Override
    public String toIncreaseGear() {
        if ((Estate.engineRpm >= 5000) && (gears <= 4)) {
            System.out.println("Автоматическое повышение передачи");
            gears++;
            Estate.engineRpm = Estate.engineRpm - 2000;
            String b = "Текущая передача - " + getGears();
            return b;
        } else if (((Estate.engineRpm < 5000) && (gears <= 4))) {
            String b = "Недостаточно оборотов для переключения передачи!";
            return b;
        } else {
            String b = "Максимальная передача!";
            return b;
        }
    }

    @Override
    public String toDescreaseGear() {
        if ((Estate.engineRpm < 4000) && (gears > 1)) {
            System.out.println("Автоматическое понижение передачи");
            gears--;
            Hatchback.engineRpm = Estate.engineRpm + 3000;
            String showGear = "Текущая передача - " + getGears();
            return showGear;
        } else if (((Estate.engineRpm >= 4000) && (gears > 1))) {
            String b = "Слишком много оборотов для понижения передачи!";
            return b;
        } else {
            String b = "Минимальная передача!";
            return b;
        }
    }

    @Override
    public String toNeutral() {
        Estate.engineRpm=0;
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
