public class Account
{
	private String name;
    private double balance;
    private int pin;
	private boolean access;
  
    public Account(String name, double balance, int pin)
    {
   	    this.name = name;
        this.balance = balance;
        this.pin = pin;
        access = false;
	}
    public String getName()
    {
        return name;
    }
	
    public double getBalance()
    {
   	    if(access = true)
        {
    	    return balance; 	 
        }
        else
        {
            return 0 ;
        }
    }
    public int getPin()
    {
        return pin;
    }
    
    public boolean getAccess()
    {
        return access;
    }
    public void setAccess(int newpin)
    {
        if(pin == newpin)
        {
       	    access = true; 
        }
    }
    public void changename(String name)
    {
        this.name = name;
    }
    public void changepin(int pin)
    {
        this.pin = pin;
    
    }
    public void withdraw(double withdraw_ammount)
    {
        if(access)
        {
            balance = balance - withdraw_ammount;
        }
    }
    
    public void changeAccess()
    {
        access = false;
    }
    public void deposit(double deposit_ammount)
    {
        if(access)
        {
            balance = balance + deposit_ammount;
        }
    }
}