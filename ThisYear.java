import org.code.theater.*;
import org.code.media.*;

/**
  * The ThisYear class displays goals for 2026 
  * Image fils must exist in the project
  * A complete goals scene is displayed 
  */
public class ThisYear extends Scene {
  
  //Stores the title text for the goals scene
  private String title;

  /**
  * Constructs a ThisYear object with default title text
  * The title variable is intialized
  */
  public ThisYear(){
    title = "My Goals for 2026!";
  }

  /**
  * Constructs a ThisYear object with custom title text
  * The title variable is set to a provided value
  */
  public ThisYear(String title){
    this.title = title;
  }
  
/**
  *Controls full animation sequence for 2026 goals scene
  * Image files are valid and accessible
  * All goal visuals and animations are displayed
  */
  public void drawScene(){

    //Display introduction screen with goals
    drawIntroScene();

    //Display special message based on number of goals
    if(getGoalCount() > 2) {
      drawText("Wishing well for 2026!", 20, 250);
    
    }
    pause(3);

    // Rotate image to create animation effect
    for (int angle = 0; angle <= 30; angle += 10) {
      clear("white");
      drawImage("Screenshot-2026-01-19-231356.png", 50, 50, 300, 300, angle);
      pause(0.2);
    }

    // Display additional goal images
    clear("white");
    drawImage("Screenshot-2026-01-19-231405.png", 50, 50, 300, 300, 10);
    pause(2);

    clear("white");
    drawImage("Screenshot-2026-01-19-231419.png", 50, 50, 300, 300, -10);
    pause(2);

    // Display closing screen
    drawEndScreen();
  }

 /**
  * Displays the title and list of goals for 2026
  * Title text is initialized 
  * Intro scene is displayed with formatted text 
  */
  public void drawIntroScene(){

    // Apply title screen styling 
    setTitleScreenStyle();
    clear("white");
    drawText(title, 20, 50);
    drawText("-maintain grades", 20, 100);
    drawText("-more family time", 20, 150);
    drawText("-sleep more", 20, 200);
  }

  /**
  * Returns the number of goals for the year
  * Returns the total goal count
  */
  public int getGoalCount(){
    return 3;
  }

  /**
  * Sets title styling for the title screen
  * Text size, color, and size are applied
  */
  public void setTitleScreenStyle(){
    setTextHeight(35);
    setTextColor("blue");
    setTextStyle(Font.SANS, FontStyle.ITALIC);
  }

  /**
  * Displays the ending screen for the scene
  * End screen text is displayed 
  */
  public void drawEndScreen(){

    // Apply end screen styling
    setEndScreenStyle();
    clear("white");
    drawText("Locking 2026!", 90, 120);
  }

  /**
  * Sets text styling for the ending screen 
  * Text style, color, and size are applied
  */
  public void setEndScreenStyle(){
    setTextHeight(35);
    setTextColor("blue");
    setTextStyle(Font.SANS, FontStyle.ITALIC);
  }

  
}