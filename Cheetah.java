public class Cheetah extends AbstractRacer
{
    private boolean acl;
    private int aclChance;

    public Cheetah(String name)
    {
        super(name);
        acl = false;
        aclChance = (int) ((Math.random() * 3) + 1);
    }

    public void move()
    {
        if(aclChance == 3)
        {
            acl = true;
        }
        setPosition(getPosition() + 8);
        if(getPosition() > 50 && acl)
        {
            setPosition(getPosition() + 0);
        }
    }

}
