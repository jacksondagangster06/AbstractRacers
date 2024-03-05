public class Tortoise extends Racer
{
    public Tortoise(String  name)
    {
        super(name);
    }

    public void move()
    {
        setPosition(getPosition() + 1);
    }
}
