import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * *
 * @author Taylon 
 * @version May 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    // The main world act loop
    public void act()
    {
        // Start game if user presses space key
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);

        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,106,116);
        elephant.setLocation(188,109);
        Apple apple = new Apple();
        addObject(apple,309,107);
        Apple apple2 = new Apple();
        addObject(apple2,448,108);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,274,290);
        label.setLocation(338,361);
        
        
        
        label.setLocation(265,359);
    }
}
