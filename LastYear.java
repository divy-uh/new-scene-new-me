import org.code.theater.*;
import org.code.media.*;

/** 
  * The LastYear class displays a recap of activities and memories 
  * from 2025. 
  * Images are loaded from both a text fild and initializer list
  * and displayed.
  */

public class LastYear extends Scene {

  // Stores scrolling banner text 
  private String text;

  // Stores activity image filemnames loaded from a text file
  private String [] activities = FileReader.toStringArray("data.txt");
  
  // Stores memory image filenames using an initializer list 
  private String [] memories = {"Screenshot-2026-01-19-230454.png","Screenshot-2026-01-19-230519.png","Screenshot-2026-01-20-000123.png"};

  /**
    * Constructs a LastYear object with default text.
    * The text variable is initalized with default content.
  */
  public LastYear(){
    text = "In 2025, I explored activites, foods, and friends!";
  }

/**
  * Constructs a LastYear object with custom text
  * The text variable is set to provided value
  */
  public LastYear(String text) {
    this.text=text;
  }

  /**
    * Controls full animal for 2025 recap scene
    * Displays a banning, activity images, and memory images
    * Arrays are initialized and contian valid filenames
    * All recap visuals are displayed on the screen
  */
 public void drawScene(){

   // Displays a banner at the top of the screen
  drawBanner(200, 22);

   // Only displays activities if at leats one exists
  if (getActivityCount() > 0) {
    // Loop through activity images loaded from the file
    for (int i = 0; i < activities.length; i++){
      clear("white");
      drawImage(activities[i], 50, 50, 300, 300, 5);
      pause(2);
    }
  }
  //Loop through memory images stored in the array
  for(int i = 0; i < memories.length; i++) {
    clear("white");
    drawImage(memories[i], 50, 50, 300, 300, -5);
    pause(2);
  }
}

  /**
  * Animated scrolling banner across the screen
  * yPos and textSize are valid screen values
  * The banner text scrolls from right to left
  */
  public void drawBanner(int yPos, int textSize) {
    // Set text styling for banner
    setTextHeight(textSize);
    setTextColor("white");

    int xPos = 400;

    // Scroll text across the screen using a while loop
    while (xPos > -600) {
      clear("white");
      drawImage("134098965069013799.jpg", 50, 50, 300, 300, 0);
      drawText(text, xPos, yPos);
      pause(0.1);
      xPos -= 10;
    }
  }

  /** 
  * Returns the number of activity images loaded from the text file
  * activities array is intialized 
  * Returns the total number of activities
  */
  public int getActivityCount() {
  return activities.length;
 }
}