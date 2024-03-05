public class Hare extends AbstractRacer 
{
    private int nrg;

    public Hare(String name)
    {
        super(name);
        nrg = 5;
    }

    public void move()
    {
        int space = (int) (Math.random() * 5) + 1;
        if(nrg > 0)
        {
        setPosition(getPosition() + space);
        nrg--;
        }
        else
        {
            rest();
        }
    }

    public void rest()
    {
        if(Math.random() < 0.2)
        {
            nrg = 5;
        }
    }

}
