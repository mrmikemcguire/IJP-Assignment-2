
public class SalesRecordDriver
{
static int numberOfSundays = 0;

public static void main(String[] args)
	{	
    SalesRecord sr = new SalesRecord();
    sr.addSale(new Sale("Tuesday", 325.34));
    sr.addSale(new Sale("Thursday",487.23));
    sr.addSale(new Sale("Monday", 879.01));
    sr.addSale(new Sale("Tuesday", 439.86));
    sr.addSale(new Sale("Monday", 218.84));
    sr.addSale(new Sale("Monday", 385.34));
    sr.addSale(new Sale("Tuesday", 679.86));
    sr.addSale(new Sale("Monday", 348.94));
    sr.addSale(new Sale("Monday", 875.30));
    sr.addSale(new Sale("Wednesday", 325.34));
    sr.addSale(new Sale("Thursday",326.63));
    sr.addSale(new Sale("Wednesday", 299.91));
    sr.addSale(new Sale("Friday", 229.26));
    sr.addSale(new Sale("Friday", 654.37));

    System.out.println(sr.toString());
    
    for (int i = 0; i < SalesRecord.record.size(); i++)
	    	{
	    if (SalesRecord.record.get(i).getDay().equals("Monday"))
	    			{
	    			numberOfSundays++;
	    			}
	    	}
    System.out.println("There were " + numberOfSundays + " Monday sales.");
     }
}



	