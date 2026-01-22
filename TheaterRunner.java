import org.code.theater.*;

/** 
  * This class runs the program. 
  * It creates and plays the 2025 recap scene and 
  * 2026 goals scene. 
  */

public class TheaterRunner {
  /**
      * Create scene objects and plays them in order
      * The LastYear scene players first, followed by ThisYear
      */
  public static void main(String[] args) {

   //Create scene objects using parameterized
    LastYear lastYear = new LastYear("In 2025, I explored activites, foods, and friends!");
    ThisYear thisYear = new ThisYear("My Goals for 2026!");

    // Draw each scene before playing 
    lastYear.drawScene();
    thisYear.drawScene();

    // Play scenes in order provided 
    Theater.playScenes(lastYear, thisYear);


  }
 }