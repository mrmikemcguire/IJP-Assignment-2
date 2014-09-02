public class Sale
	{
    private String day;
    private double amount;

	
	public Sale(String d, double a)
	    {
	    day = d;
	    amount = a;
	    }
    
	public String getDay()
		{
		return day;
		}
	
	public double getAmount()
		{
		return amount;
		}
	
	public String toString()
	    {
	     return "Day of Sale: " + day + "\n   Amount:  $"  + amount;
	     
	    }
	}
	
	