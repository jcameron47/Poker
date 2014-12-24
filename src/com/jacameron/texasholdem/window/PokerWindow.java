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
        
        Cards cards = new Cards();
        

        //Create the radio buttons.
        //Ace
        JRadioButton ace = new JRadioButton(cards.getCardAce());
        ace.setBounds(0, 0, 57, 14);
        ace.setMnemonic(KeyEvent.VK_A);
        ace.setActionCommand(cards.getCardAce());
        ace.setSelected(true);

        //King
        JRadioButton king = new JRadioButton(cards.getCardKing());
        king.setBounds(0, 14, 57, 14);
        king.setMnemonic(KeyEvent.VK_K);
        king.setActionCommand(cards.getCardKing());

        //Queen
        JRadioButton queen = new JRadioButton(cards.getCardQueen());
        queen.setBounds(0, 28, 57, 14);
        queen.setMnemonic(KeyEvent.VK_Q);
        queen.setActionCommand(cards.getCardQueen());

        //Jack
        JRadioButton jack = new JRadioButton(cards.getCardJack());
        jack.setBounds(0, 42, 57, 14);
        jack.setMnemonic(KeyEvent.VK_J);
        jack.setActionCommand(cards.getCardJack());

        //Ten
        JRadioButton ten = new JRadioButton(cards.getCardTen());
        ten.setMnemonic(KeyEvent.VK_T);
        ten.setActionCommand(cards.getCardTen());
        
        //Nine
        JRadioButton nine = new JRadioButton(cards.getCardTen());
        nine.setBounds(0, 56, 57, 14);
        nine.setMnemonic(KeyEvent.VK_N);
        nine.setActionCommand(cards.getCardNine());

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(ace);
        group.add(king);
        group.add(queen);
        group.add(jack);
        group.add(nine);

        //Register a listener for the radio buttons.
        ace.addActionListener(this);
        king.addActionListener(this);
        queen.addActionListener(this);
        jack.addActionListener(this);
        nine.addActionListener(this);
        setLayout(null);

//        //Set up the picture label.
//        picture = new JLabel(createImageIcon("images/"
//                                             + birdString
//                                             + ".gif"));
//
//        //The preferred size is hard-coded to be the width of the
//        //widest image and the height of the tallest image.
//        //A real program would compute this.
//        picture.setPreferredSize(new Dimension(177, 122));


        //Put the radio buttons in a column in a panel.
        JPanel radioPanel = new JPanel();
        radioPanel.setBounds(10, 192, 61, 75);
        radioPanel.setLayout(null);
        radioPanel.add(ace);
        radioPanel.add(king);
        radioPanel.add(queen);
        radioPanel.add(jack);
        radioPanel.add(nine);

        add(radioPanel);
//        add(picture, BorderLayout.CENTER);
        setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        
        JRadioButton radioButton = new JRadioButton("Ten");
        radioButton.setMnemonic(KeyEvent.VK_N);
        radioButton.setActionCommand("Nine");
        radioButton.setBounds(147, 248, 57, 14);
        add(radioButton);
        
        JRadioButton radioButton_1 = new JRadioButton("Jack");
        radioButton_1.setMnemonic(KeyEvent.VK_J);
        radioButton_1.setActionCommand("Jack");
        radioButton_1.setBounds(147, 234, 57, 14);
        add(radioButton_1);
        
        JRadioButton radioButton_2 = new JRadioButton("Queen");
        radioButton_2.setMnemonic(KeyEvent.VK_Q);
        radioButton_2.setActionCommand("Queen");
        radioButton_2.setBounds(147, 220, 57, 14);
        add(radioButton_2);
        
        JRadioButton radioButton_3 = new JRadioButton("King");
        radioButton_3.setMnemonic(KeyEvent.VK_K);
        radioButton_3.setActionCommand("King");
        radioButton_3.setBounds(147, 206, 57, 14);
        add(radioButton_3);
        
        JRadioButton radioButton_4 = new JRadioButton("Ace");
        radioButton_4.setSelected(true);
        radioButton_4.setMnemonic(KeyEvent.VK_A);
        radioButton_4.setActionCommand("Ace");
        radioButton_4.setBounds(147, 192, 57, 14);
        add(radioButton_4);
                
	}
	
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("RadioButtonDemo");
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
}
