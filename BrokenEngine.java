package work;

/**
 * Created by rubenahmadiev on 12.02.16.
 */
public class BrokenEngine implements Engine {
    int weight;
    String breakingName;
    int valves;
    int engineId;

    @Override
    public void gainTracrion() {
        System.out.println("Повысить обороты");
    }

    @Override
    public void reduceTracrion() {
        System.out.println("Понизить обороты");
    }

    @Override
    public BrokenEngine explode() {
        return null;
    }
}
