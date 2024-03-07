import java.util.ArrayList;
public class Race
{
    private ArrayList<AbstractRacer> contestants;
    private final int DISTANCE;
    private boolean ended;
    public Race(int distance)
    {
        DISTANCE = distance;
        contestants = new ArrayList<AbstractRacer>();
    }
    public void addContestant(AbstractRacer r)
    {
        contestants.add(r);
    }
   
    public ArrayList<AbstractRacer> getContestants()
    {
        return contestants;
    }
   
    public int getDistance()
    {
        return DISTANCE;
    }
    public void tick()
    {
        for (AbstractRacer r : contestants)
        {
            r.move();
        }
    }
    public String toString()
    {
        String result = "---------\nCURRENT RACE STATS\n";
        for (AbstractRacer r : contestants)
        {
            result += r.toString();
        }
        return result;
    }
    public void runRace()
    {
        while (ended == false)
        {
            System.out.println("Test");
            for (AbstractRacer racer : contestants)
            {
                racer.move();
                System.out.println(racer.toString());
                if (racer.getPosition() >= DISTANCE)
                {
                    ended = true;
                }
            }           
        }
    }
}



