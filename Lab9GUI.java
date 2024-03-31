package Chapter9;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
public class Lab9GUI extends JFrame implements ActionListener

{
	//declare variables as private to hide them
	private static final long serialVersionUID = 1L;
	private static double CANDY_COST=50;
	private static double CHIP_COST=65;
	private static double GUM_COST=45;
	private static double COOKIES_COST=85;


	private JLabel headerTop = new JLabel("BEN'S CANDY MACHINE",SwingConstants.CENTER);

	private JLabel headerBottom=new JLabel("Select what you would like, and the price wilistOne be displayed.",SwingConstants.CENTER);

	private JButton candy;
	private JButton chips;
	private JButton gum;
	private JButton cookies;
	private JButton exit;
	public static boolean closeButton = false;

	//constructor to intialize the frame
	public Lab9GUI()
	{
		//Title of frame
		setTitle("Candy Machine");
		//size of frame
		setSize(500, 500);
		//exit program when closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set frame to center screen
		setLocationRelativeTo(null);
		//set size of grid to best fit the buttons
		setLayout(new GridLayout(7, 1));
		//add header to top and bottom of frame
		add(headerTop);
		add(headerBottom);

		//candy button
		candy = new JButton("Candy");
		candy.addActionListener(this);
		add(candy);

		//chips button
		chips = new JButton("Chips");
		chips.addActionListener(this);
		add(chips);

		//gum button
		gum = new JButton("Gum");
		gum.addActionListener(this);
		add(gum);

		//chocolate button
		cookies = new JButton("Chocolates");
		cookies.addActionListener(this);
		add(cookies);

		//exit button
		exit = new JButton("Exit");
		exit.addActionListener(this);
		add(exit);
		//set visibility true
		setVisible(true);

	}
	public static void main(String[] args)
	{

		//create object for program
		new Lab9GUI();
	}

	public void actionPerformed(ActionEvent ae) {
		String item=ae.getActionCommand();
		Object option=(JButton)ae.getSource();
		double cost = 0;
		double change = 0;

		//check if button is candy

		if(option==candy)
		{
			do
			{try {
				cost=Double.parseDouble(JOptionPane.showInputDialog(null,
						"To buy "+item+" please insert "+CANDY_COST+" cents",
						"Input",

						JOptionPane.QUESTION_MESSAGE));

			}
			catch (NumberFormatException ex) {
			}
			catch (NullPointerException ex) {
				closeButton=true;
				break;
			}
			if(cost<CANDY_COST) {
				JOptionPane.showMessageDialog(null, "Insufficient Amount.");
			}

			}while(cost<CANDY_COST);

			change=cost-CANDY_COST;

			if(closeButton=true && cost<CANDY_COST)  {
				closeButton = false;

			}

			else if(closeButton==false && change!=0) {
				JOptionPane.showMessageDialog(null,
						"Change : "+change+"\nPlease pick up your "+item,
						"Thank you.Transaction Complete.",JOptionPane.PLAIN_MESSAGE);
			}

			else {
				JOptionPane.showMessageDialog(null,
						"Please pick up your "+item+" and enjoy",
						"Thank you.Transaction Complete.",JOptionPane.PLAIN_MESSAGE);
			}
		}
		//check if button is chips
		else if(option==chips)
		{
			do
			{
				try {
					cost=Double.parseDouble(JOptionPane.showInputDialog(null,
							"To buy "+item+" please insert "+CHIP_COST+" cents",
							"Input",

							JOptionPane.QUESTION_MESSAGE));
				}
				catch (NumberFormatException ex) {
				}
				catch (NullPointerException ex) {
					closeButton = true;
					break;
				}

				if(cost<CHIP_COST)
					JOptionPane.showMessageDialog(null, "Insufficient Amount.");
			}while(cost<CHIP_COST);

			change=cost-CHIP_COST;
			if(closeButton=true && cost<CHIP_COST)  {
				closeButton = false;

			}

			else if(closeButton==false && change!=0) {
				JOptionPane.showMessageDialog(null,
						"Change : "+change+"\nPlease pick up your "+item,
						"Thank you.Transaction Complete.",JOptionPane.PLAIN_MESSAGE);
			}

			else {
				JOptionPane.showMessageDialog(null,
						"Please pick up your "+item+" and enjoy",
						"Thank you.Transaction Complete.",JOptionPane.PLAIN_MESSAGE);
			}
		}
		//check if button is gum
		else if(option==gum)
		{
			do
			{try {
				cost=Double.parseDouble(JOptionPane.showInputDialog(null,
						"To buy "+item+" please insert "+GUM_COST+" cents",
						"Input",

						JOptionPane.QUESTION_MESSAGE));
			}
			catch (NumberFormatException ex) {
			}
			catch (NullPointerException ex) {
				closeButton = true;
				break;
			}
			if(cost<GUM_COST)
				JOptionPane.showMessageDialog(null, "Insufficient Amount.");

			}while(cost<GUM_COST);

			change=cost-GUM_COST;

			if(closeButton=true && cost<GUM_COST)  {
				closeButton = false;

			}

			else if(closeButton==false && change!=0) {
				JOptionPane.showMessageDialog(null,
						"Change : "+change+"\nPlease pick up your "+item,
						"Thank you.Transaction Complete.",JOptionPane.PLAIN_MESSAGE);
			}

			else {
				JOptionPane.showMessageDialog(null,
						"Please pick up your "+item+" and enjoy",
						"Thank you.Transaction Complete.",JOptionPane.PLAIN_MESSAGE);
			}
		}
		//check if button is chocolates
		else if(option==cookies)
		{
			do
			{
				try {
					cost=Double.parseDouble(JOptionPane.showInputDialog(null,
							"To buy "+item+" please insert "+COOKIES_COST+" cents",
							"Input",

							JOptionPane.QUESTION_MESSAGE));
				}
				catch (NumberFormatException ex) {
				}
				catch (NullPointerException ex) {
					closeButton = true;
					break;
				}
				if(cost<COOKIES_COST)
					JOptionPane.showMessageDialog(null, "Insufficient Amount.");
			}while(cost<COOKIES_COST);

			change=cost-COOKIES_COST;

			if(closeButton=true && cost<COOKIES_COST)  {
				closeButton = false;

			}

			else if(closeButton==false && change!=0) {
				JOptionPane.showMessageDialog(null,
						"Change : "+change+"\nPlease pick up your "+item,
						"Thank you.Transaction Complete.",JOptionPane.PLAIN_MESSAGE);
			}

			else {
				JOptionPane.showMessageDialog(null,
						"Please pick up your "+item+" and enjoy",
						"Thank you.Transaction Complete.",JOptionPane.PLAIN_MESSAGE);
			}
		}
		//check if button is exit
		else if(option==exit)
		{
			JOptionPane.showMessageDialog(null, "Thank you for using the machine!");
			System.exit(0);
		}

	}
}
