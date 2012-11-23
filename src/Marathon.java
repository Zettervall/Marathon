import static javax.swing.JOptionPane.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

//import Marathon.NewRunnerForm;

public class Marathon extends JFrame 
{

private NewRunnerForm form;

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

Icon NewRunnerForm;
JButton newButton = new JButton("New");
JButton showButton = new JButton("Show");
JButton timeButton = new JButton("Time");

newButton.addActionListener(new NewAction());
//showButton.addActionListener(this);
//timeButton.addActionListener(this);

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
//startButton.addActionListener(this);
//nameButton.addActionListener(this);
//ageButton.addActionListener(this);
//timeButton.addActionListener(this);

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
class NewRunnerForm extends JPanel{
    private JTextField nameField, countryField, ageField;
    public NewRunnerForm(){
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
JPanel rad1 = new JPanel();
rad1.add(new JLabel("Namn:"));
nameField = new JTextField(10);
rad1.add(nameField);
add(rad1);
        
        JPanel rad2 = new JPanel();
rad2.add(new JLabel("Land:"));
countryField = new JTextField(10);
rad2.add(countryField);
add(rad2);
        
        JPanel rad3 = new JPanel();
rad3.add(new JLabel("Ålder:"));
ageField = new JTextField(10);
rad3.add(ageField);
add(rad3);
    }
    public String getName(){
        return nameField.getText();
    }
    public String getCountry(){
        return countryField.getText();
    }
    public int getAge(){
        return Integer.parseInt(ageField.getText());
    }
} 
class NewAction implements ActionListener{
    public void actionPerformed(ActionEvent ave){
       NewRunnerForm form = new NewRunnerForm();
       
       while(true){
           try{
           int svar = showConfirmDialog(Marathon.this, form);
           if(svar != OK_OPTION)
                return;
           
           String name = form.getName();
           String country = form.getCountry();
           int age = form.getAge();
        
           if(!name.equals("") && !country.equals("")){
                Participator r = new Participator(age, name, country);
//                Participator.add(r);
                return;
           }
           else{
             JOptionPane.showMessageDialog(Marathon.this, "Du måste fylla i alla fält");
           }
           }catch(NumberFormatException e){
              JOptionPane.showMessageDialog(Marathon.this, "Du har fyllt i fel någonstans. Var god rätta till detta.");
           }
       }
       
    }
    
}

public static void main(String[] args)
{
new Marathon();

}

}