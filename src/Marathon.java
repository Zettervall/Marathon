//package se.marathon.oskar;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Marathon extends JFrame implements ActionListener
{

	public Marathon()
	{

		setTitle("DSV Kista Maraton");

		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		pane.add(getNorth(), BorderLayout.NORTH);
		pane.add(getSouth(), BorderLayout.SOUTH);
		pane.add(getEast(), BorderLayout.EAST);
		pane.add(getWest(), BorderLayout.WEST);

		int windowWidth = 400;
		int windowHeight = 400;
		setBounds(100, 100, windowWidth, windowHeight);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JComponent getNorth()
	{

		JLabel label = new JLabel("DSV Kista Marathon", JLabel.CENTER);
		return label;
	}

	private JComponent getSouth()
	{

		JPanel south = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JButton newButton = new JButton("New");
		JButton showButton = new JButton("Show");
		JButton timeButton = new JButton("Time");
		
		newButton.addActionListener(this);
		showButton.addActionListener(this);
		timeButton.addActionListener(this);
		
		south.add(newButton);
		south.add(showButton);
		south.add(timeButton);
		
		return south;
	}

	private JComponent getWest()
	{

		JPanel west = new JPanel();

		JList txt = new JList();
		Dimension size = new Dimension(270, 310);
		JScrollPane scrolltxt = new JScrollPane(txt);
		scrolltxt.setPreferredSize(size);

		west.add(scrolltxt);
		return west;

	}

	private JComponent getEast()
	{
		JPanel east = new JPanel();
		east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
		
	
		east.setAlignmentY(BOTTOM_ALIGNMENT);

		
		
		
		JLabel label = new JLabel("Sortering");

		JRadioButton startButton = new JRadioButton("StartNumber");
		startButton.setActionCommand("StartNumber");
		startButton.setSelected(true);

		JRadioButton nameButton = new JRadioButton("Name");
		nameButton.setActionCommand("Name");
		
		JRadioButton ageButton = new JRadioButton("Age");
		ageButton.setActionCommand("Age");
		
		JRadioButton timeButton = new JRadioButton("Time");
		timeButton.setActionCommand("Time");

		// Register listeners
		startButton.addActionListener(this);
		nameButton.addActionListener(this);
		ageButton.addActionListener(this);
		timeButton.addActionListener(this);

		// Grupperar radioknapparna
		ButtonGroup group = new ButtonGroup();
		group.add(startButton);
		group.add(nameButton);
		group.add(ageButton);
		group.add(timeButton);

		// Adding buttons to JPanel
		east.add(label);
		east.add(startButton);
		east.add(nameButton);
		east.add(ageButton);
		east.add(timeButton);

		return east;
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
	}

	public static void main(String[] args)
	{
		new Marathon();

	}

}
