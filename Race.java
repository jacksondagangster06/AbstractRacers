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
        for (Racer r : contestants)
        [
            r.move();
        ]
    }
    public String toString()
    {
        String result = "---------\nCURRENT RACE STATS\n"
        for (Racer r : contestants)
        {
            
        }
    }
}


