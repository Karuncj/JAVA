import java.awt.*;
import java.awt.event.*;

public class Registration extends Frame implements ActionListener{
    TextField Name=new TextField(10);
    TextField Age=new TextField(10);
    TextField Address=new TextField(10);
    TextField Phone=new TextField(10);
    CheckboxGroup job;
    Checkbox Student =  new Checkbox("Student", job, false);
    Checkbox Teacher = new Checkbox("Teacher", job, false);
    Button button;

    //Registration Constructor
    Registration(){
        //Frame settings
    setTitle("Registration From");
    
    setVisible(true);
    setLayout(new FlowLayout());
    //Labels setiing
    Label lab1=new Label();
    Label lab2=new Label();
    Label lab3=new Label();
    Label lab4=new Label();

    lab1.setAlignment(Label.LEFT);
    lab1.setText("NAME");
    add(lab1);
    add(Name);

    lab2.setAlignment(Label.LEFT);
    lab2.setText("AGE");
    add(lab2);
    add(Age);

    lab3.setAlignment(Label.LEFT);
    lab3.setText("ADDRESS");
    add(lab3);
    add(Address);

    lab4.setAlignment(Label.LEFT);
    lab4.setText("PHONE NUMBER");
    add(lab4);
    add(Phone);

    job = new CheckboxGroup();
    Student =  new Checkbox("Student", job, false);
    Teacher = new Checkbox("Teacher", job, false);
    add(Student);
    add(Teacher);

    button = new Button("SUBMIT");
    add(button);
    setBounds(200,200,100,500);
    button.setBackground(Color.RED);
    button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("NAME :"+Name.getText());
        System.out.println("AGE :"+Age.getText());    
        System.out.println("ADDRESS :"+Address.getText());
        System.out.println("PHONE NUMBER :"+Phone.getText()); 
        boolean b= Student.getState();
        if(b){
            System.out.println("Student");
        }
        else{
            System.out.println("Teacher");
        }
    }
    public static void main(String[] args) {
        new Registration();
    }
}
