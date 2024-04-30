/**
 * Runs a race of Racers in the Processing environment
 */

 // Variables declared here
final int RACE_DISTANCE = 800;   // 100 px buffer before start and
                                 // after the finish
final int SCREENWIDTH = 1000;    // matches graphical window of
                                 // size(1000, 800)
final int racerWidth = 100;            // racer width in pixels;
Race r;
/**
 * This method is run once before the draw() loop starts repeating.
 * Initialize the race variables, set up the screen...
 */
void setup()
{
  size(900, 700);
    Hare h = new Hare("Hare");
    Tortoise t = new Tortoise("Tortoise");
    Cheetah k = new Cheetah("Cheetah");
    r = new Race(100);
    r.addContestant(t);
    r.addContestant(h);
    r.addContestant(k);
    System.out.println(r.toString());
    r.runRace();
   /* while(r.isGoing())
    {
        t.move();
        k.move();
        h.move();
        System.out.println(r.toString());
    }
   */
    System.out.println("Winner is " + r.getWinner());
}

//void drawStartFinish()
//{

    // Draws the start and finish lines
   

//}

void drawRacers()
{
    for (AbstractRacer rc : r.getContestants())
    {
       if (rc instanceof Tortoise)
       {

            rect(rc.getPosition(), 300, 50, 50);
            fill(100);

       }
       else if (rc instanceof Hare)
       {

            rect(rc.getPosition(), 300, 10, 10);
            fill(200);
       }
       else if (rc instanceof Cheetah)
       {
          rect(rc.getPosition(), 300, 40, 40);
          color(56, 57, 69);
       }
    }
}

void draw()
{
    background(255);                  // clear screen
    if (!r.isGoing())
    {
        r.tick();
        //drawStartFinish();
        drawRacers();
    }
    else
    {
        //drawStartFinish();
        drawRacers();
        System.out.println("The race is over!");
        System.out.println("The winner is...." + r.getWinner());
        noLoop();
    }
}
