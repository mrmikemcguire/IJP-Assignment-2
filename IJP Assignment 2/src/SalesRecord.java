import java.util.ArrayList;

public class SalesRecord
	{
    static ArrayList <Sale> record;
	
    public SalesRecord()
    	{
        record = new ArrayList<Sale>(); 
    	}
  
    public void addSale(Sale sale)
    	{
        record.add(sale);              	
    	}
    
    public String toString()
    	{
        String weeklySales = "\tSales for the Week\n\n\n"; 
        for (Sale s : record)
        	{
            weeklySales = weeklySales + s.toString() + "\n\n";                           
        	}
        return weeklySales;                 
   	    }
	}
	
