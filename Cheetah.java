public class Cheetah extends AbstractRacer
{
    private boolean aclT;
    private int aclChance;

    public Cheetah(String name)
    {
        super(name);
        aclT = true;
        aclChance = (int) ((Math.random() * 3) + 1);
    }

    public void move()
    {
        if(aclChance == 3)
        {
            aclT = false;
        }
        setPosition(getPosition() + 8);
        if(getPosition() > 50 && aclT)
        {
            setPosition(getPosition() + 0);
        }
    }

}
