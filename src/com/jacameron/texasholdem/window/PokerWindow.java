package com.jacameron.texasholdem.window;


import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
//personal imports
import com.jacameron.texasholdem.utility.*;
import javax.swing.border.BevelBorder;;

public class PokerWindow extends JPanel implements ActionListener
{


	/**
	 * Create the frame.
	 */
	public PokerWindow() 
	{
		setForeground(Color.GRAY);
		
		 //Create and set up the window.
        JFrame frame = new JFrame("T.H.E. Utility");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cardStack(1);
        
//        JRadioButton radioButton = new JRadioButton("Ten");
//        radioButton.setMnemonic(KeyEvent.VK_Q);
//        radioButton.setActionCommand("Nine");
//        radioButton.setBounds(147, 248, 57, 14);
//        add(radioButton);
//        
//        JRadioButton radioButton_1 = new JRadioButton("Jack");
//        radioButton_1.setMnemonic(KeyEvent.VK_W);
//        radioButton_1.setActionCommand("Jack");
//        radioButton_1.setBounds(147, 234, 57, 14);
//        add(radioButton_1);
//        
//        JRadioButton radioButton_2 = new JRadioButton("Queen");
//        radioButton_2.setMnemonic(KeyEvent.VK_E);
//        radioButton_2.setActionCommand("Queen");
//        radioButton_2.setBounds(147, 220, 57, 14);
//        add(radioButton_2);
//        
//        JRadioButton radioButton_3 = new JRadioButton("King");
//        radioButton_3.setMnemonic(KeyEvent.VK_R);
//        radioButton_3.setActionCommand("King");
//        radioButton_3.setBounds(147, 206, 57, 14);
//        add(radioButton_3);
//        
//        JRadioButton radioButton_4 = new JRadioButton("Ace");
//        radioButton_4.setSelected(true);
//        radioButton_4.setMnemonic(KeyEvent.VK_T);
//        radioButton_4.setActionCommand("Ace");
//        radioButton_4.setBounds(147, 192, 57, 14);
//        add(radioButton_4);
                
	}
	
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("T.H.E. Utility");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new PokerWindow();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	//Buttons and settings for the card stack
	public void cardStack(int stackNumber)
	{
		//These settings start the stack on the bottom of the
		//window. The code allows for multiple stacks, and makes
		//the spacing adjustments for each stack
		
		final int SPACING = 15; 		//y coordinate spacing between radio buttons
		int x = 20;
		int y = 180;
		int length = 60;
		int width  = 15;
		
		//Check what stack number it is, and size accordingly
		if(stackNumber == 1 || stackNumber == 0)
		{
			
		}else
		{
			x = stackNumber * 50;
		}
		
		//Deck of cards(String)
        Cards cards = new Cards();        

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        setLayout(null);

        //Put the radio buttons in a column in a panel.
        JPanel radioPanel = new JPanel();
        radioPanel.setBounds(x, y, length, width);
        radioPanel.setLayout(null);

        add(radioPanel);
//      add(picture, BorderLayout.CENTER);
        setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        
        //Create the radio buttons.
        //Ace
        JRadioButton ace = new JRadioButton(cards.getCardAce());
        ace.setBounds(x, y, length, width);
        add(ace);
        ace.setMnemonic(KeyEvent.VK_1);
        ace.setActionCommand(cards.getCardAce());
        ace.setSelected(true);
        group.add(ace);
        ace.addActionListener(this);
        
        //King
        JRadioButton king = new JRadioButton(cards.getCardKing());
        king.setBounds(x,(y + (SPACING * 1)), length, width);
        add(king);
        king.setMnemonic(KeyEvent.VK_2);
        king.setActionCommand(cards.getCardKing());
        group.add(king);
        king.addActionListener(this);
        
        //Queen
        JRadioButton queen = new JRadioButton(cards.getCardQueen());
        queen.setBounds(x, (y + (SPACING * 2)), length, width);
        add(queen);
        queen.setMnemonic(KeyEvent.VK_3);
        queen.setActionCommand(cards.getCardQueen());
        group.add(queen);
        queen.addActionListener(this);
        
        //Jack
        JRadioButton jack = new JRadioButton(cards.getCardJack());
        jack.setBounds(x, (y + (SPACING * 3)), length, width);
        add(jack);
        jack.setMnemonic(KeyEvent.VK_4);
        jack.setActionCommand(cards.getCardJack());
        group.add(jack);
        jack.addActionListener(this);
        
        //Ten
        JRadioButton ten = new JRadioButton(cards.getCardTen());
        ten.setBounds(x, (y + (SPACING * 4)), length, width);
        add(ten);
        ten.setMnemonic(KeyEvent.VK_5);
        ten.setActionCommand(cards.getCardTen());
        group.add(ten);
        ten.addActionListener(this);
        
        //Nine
        JRadioButton nine = new JRadioButton(cards.getCardNine());
        nine.setBounds(x, (y + (SPACING * 5)), length, width);
        add(nine);
        nine.setMnemonic(KeyEvent.VK_6);
        nine.setActionCommand(cards.getCardNine());
        group.add(nine);
        nine.addActionListener(this);
	}
}
