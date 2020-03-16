import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 
public class Screen extends JPanel implements ActionListener {
    private JButton LoginButton;
    private JButton LogoutButton;
    private JButton withdrawButton;
    private JButton depositButton;
    private JButton changepinButton;
    private JButton changenameButton;
    private JTextField Login;
    private JTextField LoginName;
    private JTextField withdraw;
    private JTextField deposit;
    private JTextField changename;
    private JTextField changepin;
    private String name = "";  
    Color darkblue;
    String pin = "";
    boolean check1 = false;
    private int result;
    private int a,b,c,d;
    private String sorry = "";
    private ArrayList<Account> AccountList;
    
    public Screen() {
        AccountList = new ArrayList<Account>(); // ArrayList 
        
        AccountList.add(new Account("Jennifer",999.9,1234));
        AccountList.add(new Account("Jose",500.1,4321));
        AccountList.add(new Account("Jim",10.4,4132));
        AccountList.add(new Account("Joseph",60000000.98,1432));
        AccountList.add(new Account("Allen",100000,3412));
        
        this.setLayout(null);
        darkblue = new Color(0,102,102);
        //login Button
        LoginButton = new JButton("Login");
        LoginButton.setBounds(100,150, 100, 30); //sets the location and size
        LoginButton.addActionListener(this); //add the listener
        this.add(LoginButton); //add to JPanel
        //logout Button
        LogoutButton = new JButton("Log out");
        LogoutButton.setBounds(600,460, 100, 30); //sets the location and size
        LogoutButton.addActionListener(this); //add the listener
        this.add(LogoutButton); //add to JPanel
        LogoutButton.setVisible(false);
        //withdraw button
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(170,330,80, 30); //sets the location and size
        withdrawButton.addActionListener(this); //add the listener
        this.add(withdrawButton); //add to JPanel
        withdrawButton.setVisible(false);
        //Deposit button
        depositButton = new JButton("Deposit");
        depositButton.setBounds(280,330, 80, 30); //sets the location and size
        depositButton.addActionListener(this); //add the listener
        this.add(depositButton); //add to JPanel
        depositButton.setVisible(false);
        //change name button
        changenameButton = new JButton("Change name");
        changenameButton.setBounds(280,400, 120, 30); //sets the location and size
        changenameButton.addActionListener(this); //add the listener
        this.add(changenameButton); //add to JPanel
        changenameButton.setVisible(false);
        //change pin button
        changepinButton = new JButton("Change pin");
        changepinButton.setBounds(170,400,120, 30); //sets the location and size
        changepinButton.addActionListener(this); //add the listener
        this.add(changepinButton); //add to JPanel
        changepinButton.setVisible(false);
        //TextField
        Login = new JTextField(20);
        Login.setBounds(100,100, 80, 30);
        this.add(Login);
        //Login.setVisible(true);
        
        LoginName = new JTextField(20);
        LoginName.setBounds(250,100, 80, 30);
        this.add(LoginName);
        
        withdraw = new JTextField(20);
        withdraw.setBounds(170,290, 80, 30);
        this.add(withdraw);
        withdraw.setVisible(false);
        
        deposit = new JTextField(20);
        deposit.setBounds(280,290, 80, 30);
        this.add(deposit);
        deposit.setVisible(false);
        
        
        changepin = new JTextField(20);
        changepin.setBounds(170,375, 80, 30);
        this.add(changepin);
        changepin.setVisible(false);
        
        
        changename = new JTextField(20);
        changename.setBounds(280,375, 80, 30);
        this.add(changename);
        //changename.setText("newname");
        changename.setVisible(false);
        
        this.setFocusable(true);
 
    }
 
    public Dimension getPreferredSize() {
        //Sets the size of the panel
        return new Dimension(800,600);
    }
 
    public boolean getAccess()
    {
         for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin())
            {
                a = i;
            }
        }
        return AccountList.get(a).getAccess();
    }
    
    public String getName()
    {
        for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin())
            {
                b = i;
            }
        }
        return AccountList.get(b).getName();
    }
    
    public double getBalance()
    {
        for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin())
            {
                c = i;
            }
        }
        return AccountList.get(c).getBalance();
    }
    
    public void checkpin()
    {
        sorry = " ";
        System.out.println("got it");
        pin = Login.getText();
        result = Integer.parseInt(pin);
        name = LoginName.getText();
        //AccountList[0].setAccess(result);
        for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin() && name.equals(AccountList.get(i).getName()))
            {
                //AccountList[i].getAccess();
                AccountList.get(i).setAccess(result);
                LoginButton.setVisible(false);
                Login.setVisible(false);
                LoginName.setVisible(false);
                LogoutButton.setVisible(true);
                deposit.setVisible(true);
                withdraw.setVisible(true);
                changename.setVisible(true);
                changepin.setVisible(true);
                changenameButton.setVisible(true);
                changepinButton.setVisible(true);
                depositButton.setVisible(true);
                withdrawButton.setVisible(true);
                System.out.println("ohh");
                //check1 = false;
                sorry = " ";
            }
            else{
                 //sorry = "Sorry, your pin isn't exist! Please try it again.";
                 System.out.println("mass!");
              }
              }
        
        }
        
    public void LoginPage()
    {
        LoginButton.setVisible(true);
        Login.setVisible(true);
        LoginName.setVisible(true);
        LogoutButton.setVisible(false);
        deposit.setVisible(false);
        depositButton.setVisible(false);
        withdraw.setVisible(false);
        withdrawButton.setVisible(false);
        changenameButton.setVisible(false);
        changename.setVisible(false);
        changepinButton.setVisible(false);
        changepin.setVisible(false);
        
        for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin() && name.equals(AccountList.get(i).getName()))
            {
                d = i;
                sorry = "";
            }
        }
        AccountList.get(d).changeAccess();
        sorry = "";
    }
    
    public void withdraw()
    {
        String money1 = withdraw.getText();
        double result2 = Double.parseDouble(money1);
        
        for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin() && name.equals(AccountList.get(i).getName()))
            {
                if(result2 > AccountList.get(i).getBalance())
                    System.out.println("you don't have enough money to withdraw!");
                else
                    AccountList.get(i).withdraw(result2);
            }
        }
        
    
    }
    
    public void changepin()
    {
        String text5 = changepin.getText();
        System.out.println(text5);
        int newpin5 = Integer.parseInt(text5);
        //System.out.println(newpin);
        
        for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin() && name.equals(AccountList.get(i).getName()))
            {
                AccountList.get(i).changepin(newpin5);
            }
        }
    
    }
    
    public void changename()
    {
        String newname = changename.getText();
        System.out.println(newname);
        for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin() && name.equals(AccountList.get(i).getName()))
            {
                AccountList.get(i).changename(newname);
            }
        }
        repaint();
       }
    public void deposit()
    {
        String money1 = deposit.getText();
        double result2 = Double.parseDouble(money1);
        
        for(int i = 0; i< AccountList.size();i++)
        {
            if(result == AccountList.get(i).getPin() && name.equals(AccountList.get(i).getName()))
            {
                AccountList.get(i).deposit(result2);
            }
        }
    }
    
    public void paintComponent(Graphics g) {
        //draw background
        g.setColor(darkblue);
        g.fillRect(0,0,800,600);
        g.setColor(Color.white);
        g.fillRect(50,50,700,500);
        g.drawLine(0,0,50,50);
        g.drawLine(0,600,50,550);
        g.drawLine(800,0,750,50);
        g.drawLine(800,600,750,550);
        
        //draw instructions
        Font font = new Font("Arial", Font.PLAIN, 20);
        g.setFont(font);
        g.setColor(Color.blue);
        //g.drawString("Enter in the pin ", 100, 100);
        //final Graphics gCopy = g.create();
        if(getAccess() == false){
            g.drawString("Enter in the pin ", 100, 100);
            g.drawString("Enter in the name ", 250, 100);
            }
        else if(getAccess() == true)
        {
             g.drawString("Name: " + getName() , 200, 200);
             g.drawString("Balance: "+ getBalance(), 200, 250);
        }
        
        g.drawString(sorry, 300, 300);
        //draw Hello
        //g.drawString("Hello " + name, 400, 200);
    
    }
 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == LoginButton) {
            System.out.println("LoginButton");
            checkpin();
            repaint();
        }
        else if (e.getSource() == LogoutButton) {
            System.out.println("LogoutButton");
            LoginPage();
            repaint();
        }
        else if (e.getSource() == withdrawButton) {
            System.out.println("withdrawButton");
            withdraw();
            repaint();
        }
        else if (e.getSource() == depositButton) {
            System.out.println("depositButton");
            deposit();
            repaint();
        }
        else if (e.getSource() == changenameButton) {
            System.out.println("changenameButton");
            changename();
            repaint();
        }
        else if (e.getSource() == changepinButton) {
            System.out.println("changepinButton");
            changepin();
            repaint();
        }
    }
 
 
 
}