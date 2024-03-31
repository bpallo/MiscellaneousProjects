package Work;

import javax.swing.*;
import java.awt.*;

public class foodOrderApp extends JFrame {

	public foodOrderApp() {
		// Formatting and title of GUI window
		setTitle("Food Ordering App - GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 600);
		setLayout(new BorderLayout());

		// Title and heading
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new FlowLayout());
		JLabel title = new JLabel("Welcome to Ben's Restaurant!");
		headerPanel.add(title);
		add(headerPanel, BorderLayout.NORTH);

		// Menu options and set structure of GUI
		JPanel optionsPanel = new JPanel();
		optionsPanel.setLayout(new GridLayout(0, 1));
		optionsPanel.setBorder(BorderFactory.createTitledBorder("Choose your protein:"));

		// Radio buttons with icons for choosing preferred protein
		JRadioButton radioButton1 = new JRadioButton("Chicken");
		radioButton1.setIcon(new ImageIcon("C:/Users/benpa/OneDrive/Pictures/ChickenIcon.jpg"));
		JRadioButton radioButton2 = new JRadioButton("Steak");
		radioButton2.setIcon(new ImageIcon("C:/Users/benpa/OneDrive/Pictures/SteakIcon.jpg"));
		JRadioButton radioButton3 = new JRadioButton("Shrimp");
		radioButton3.setIcon(new ImageIcon("C:/Users/benpa/OneDrive/Pictures/ShrimpIcon.jpg")); 
		ButtonGroup radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(radioButton1);
		radioButtonGroup.add(radioButton2);
		radioButtonGroup.add(radioButton3);

		// Checkboxs for additional modifications to user's order
		JCheckBox checkBox1 = new JCheckBox("Add Extra Sauce");
		JCheckBox checkBox2 = new JCheckBox("Add Extra Protein");

		// Combobox to choose preferred beverage
		JLabel beverageLabel = new JLabel("Choose your beverage:"); 
		JComboBox<String> comboBox = new JComboBox<>(new String[]{"Still Water", "Sparkling Water", "Soda"});


		// Special Instructions so user can suggest alterations 
		JPanel specialInstructionsPanel = new JPanel();
		specialInstructionsPanel.setLayout(new BorderLayout());
		specialInstructionsPanel.setBorder(BorderFactory.createTitledBorder("Special Instructions"));
		JTextArea specialInstructionsTextArea = new JTextArea(1, 1);
		specialInstructionsPanel.add(new JScrollPane(specialInstructionsTextArea), BorderLayout.CENTER);

		// Display all the buttons on the GUI and choose order.
		optionsPanel.add(radioButton1);
		optionsPanel.add(radioButton2);
		optionsPanel.add(radioButton3);
		optionsPanel.add(checkBox1);
		optionsPanel.add(checkBox2);
		optionsPanel.add(beverageLabel);
		optionsPanel.add(comboBox);
		optionsPanel.add(specialInstructionsPanel); 
		add(optionsPanel, BorderLayout.CENTER);


		// Buttons that allow user to place order or cancel and restart, methods on lines 86 and 91 respectively
		JPanel footerPanel = new JPanel();
		footerPanel.setLayout(new BorderLayout());
		JButton orderButton = new JButton("Place Order");
		JButton cancelButton = new JButton("Cancel Order");
		footerPanel.add(cancelButton, BorderLayout.WEST);
		footerPanel.add(orderButton, BorderLayout.EAST);
		add(footerPanel, BorderLayout.SOUTH);

		// File menu so user can exit app conventionally
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		fileMenu.add(exitMenuItem);
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);

		// Tooltip to clarify what will happen when the user presses the "Place Order" button
		orderButton.setToolTipText("Click here to place your order");

		// Action listener that verifys your choice when you hit "Place Order" jbutton
		orderButton.addActionListener(e -> JOptionPane.showMessageDialog(foodOrderApp.this, "Order Placed Successfully!"));

		// Set an action listener to clear the selection of radiobuttons, checkboxes, and combobox.
		cancelButton.addActionListener(e -> {
			radioButtonGroup.clearSelection();
			checkBox1.setSelected(false);
			checkBox2.setSelected(false);
			comboBox.setSelectedIndex(0);
		});

		exitMenuItem.addActionListener(e -> System.exit(0));

		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(foodOrderApp::new);
	}

}
