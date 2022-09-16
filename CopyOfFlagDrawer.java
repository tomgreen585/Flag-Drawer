// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102/112 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP-102-112 - 2022T1, Assignment 2
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;
import java.awt.Color;

/**
 * Draws various flags
 *
 * You can find lots of flag details (including the correct dimensions and colours)
 * from  http://www.crwflags.com/fotw/flags/    
 */

public class CopyOfFlagDrawer{

    public static final double LEFT = 100;  // the left side of the flags
    public static final double TOP = 50;    // the top of the flags

    /**   CORE
     * Draw the flag of Belgium.
     * The flag has three vertical stripes;
     * The left is black, the middle is yellow, and the right is red.
     * The flag is 13/15 as high as it is wide (ratio 13:15).
     */
    public void drawBelgiumFlag(){
        UI.clearGraphics();
        UI.println("Belgium Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }

    /**   CORE
     *  The Red Cross flag consists of a white square with a red cross in the center
     *  The cross can be drawn as a horizontal rectangle and a vertical rectangle.
     */
    public void drawRedCrossFlag() {
        UI.println("Red Cross Flag: ");
        UI.clearGraphics();
        double size = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }

    /**   COMPLETION
     *  Pacman
     *  A red pacman facing up on a black background chasing yellow, green, and blue dots.
     *  
     */
    public  void drawPacman() {
         int x = 5;
    while(x >= 1){
    UI. println (x*2);
    x = x−1; }
    UI. println ("x is now " + x); }

    }

    /**   COMPLETION
     * Draw the flag of Greenland.
     * The top half of the flag is white, and the bottom half is red.
     * There is a circle in the middle (off-set to left)  which is
     * also half white/red but on the opposite sides.
     * The flag is 2/3 as high as it is wide (ratio 2:3).
     */
    public void drawGreenlandFlag() {
        UI.clearGraphics();
        UI.println("Greenland Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }

    /**  CHALLENGE
     *  The Jamaican flag has a yellow diagonal cross with 
     *  green triangles top and bottom, and black triangles left and right.
     */
    public void drawJamaicaFlag(){
        UI.clearGraphics();
        UI.println("Flag of Jamaica");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }

    /**   CHALLENGE
     * The 3 stars flag has a blue vertical stripe on the left and black
     * vertical stripe on the right and 3 red 5 pointed stars in the middle stripe
     * The height is 2/3 of the width,
     * A full marks solution will have a method for drawing a 5 pointed star,
     * and call that method for each of the stars
     */
    public void drawThreeStarsFlag() {
        UI.clearGraphics();        
        UI.println("Three stars Flag");
        double width = UI.askDouble("How wide: ");
        /*# YOUR CODE HERE */

    }


    public void setupGUI(){
        UI.addButton("Clear", UI::clearPanes);
        UI.addButton("Core: Flag of Belgium", this::drawBelgiumFlag);
        UI.addButton("Core: Red Cross Flag",  this::drawRedCrossFlag);
        // COMPLETION
        UI.addButton("Completion: Pacman Flag", this::drawPacman);
        UI.addButton("Completion: Flag of Greenland", this::drawGreenlandFlag);
        // CHALLENGE
        UI.addButton("Challenge: Flag of Jamaica", this::drawJamaicaFlag);
        UI.addButton("Challenge: Three stars flag", this::drawThreeStarsFlag);
        UI.addButton("Quit", UI::quit);

        UI.setDivider(0.3);
    }

    public static void main(String[] arguments){
        CopyOfFlagDrawer fd = new CopyOfFlagDrawer();
        fd.setupGUI();
    }

}
