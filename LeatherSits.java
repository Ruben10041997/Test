package work;

/**
 * Created by rubenahmadiev on 13.02.16.
 */
public class LeatherSits implements Seat{

    Seat ofLeather;
    int convenience;
    String leatherName;
    int costOf;


    @Override
    public void toMove() {
        System.out.println("Двигаем сиденье");
    }

    @Override
    public void toWarm() {
        System.out.println("Греем сиденье");
    }

    @Override
    public void toDoMassag() {
        System.out.println("Массаж");
    }
}
