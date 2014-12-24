
/**
 * This program is made to utilize Texas Hold Em
 * card playing strategies
 * 
 * 
 */

package com.jacameron.texasholdem;


/**
 * @author Jonathan Cameron
 *
 */
public class main 
{

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() 
            {
            	com.jacameron.texasholdem.window.PokerWindow.createAndShowGUI();
            }
        });
    }

}
