public class Racer
{
    private ArrayList<Racers> contestants;
    private int Distance;

    public Race(int distance)
    {
        DISTANCE = distance;
        contestants = new ArrayList<Racer>();
    }
    public void addContestant(Racer r)
    {
        contestants.add(r);
    }
   
    public ArrayList<Racer> getContestants()
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
        [
            r.move();
        ]
    }
    public String toString()
    {
        String result = "---------\nCURRENT RACE STATS\n"
        for (AbstractRacer r : contestants)
        {
            
        }
    }
    public void runRace()
    {
        while (ended == false)
        {
            System.out.println("Test");
            for (Racer racer : contestants)
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



