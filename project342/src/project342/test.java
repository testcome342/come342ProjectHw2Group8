package project342;
import java.util.ArrayList;

import project342.Campaign;
import project342.Client;
public class test {

	
	public static void main(String []args) 
	
	{
		  
		  
		  Campaign campaign1=new Campaign(3, "Bilgisayar", "May�s", "Haziran", 1500);
		  Campaign campaign2=new Campaign(4, "Telefon", "Nisan", "Temmuz", 1300);
		  
	      ArrayList<Campaign> campaignlist1 = new ArrayList<Campaign>();
		  campaignlist1.add(campaign1);
		  
		  ArrayList<Campaign> campaignlist2 = new ArrayList<Campaign>();
	      campaignlist2.add(campaign2);
		  
	      Client client1 = new Client(1, "Senturkler", "atasehir", "Furkan",campaignlist1);
		  Client client2 = new Client(2, "Kahramanlar", "Acibadem", "Mesut",campaignlist2);
	      ArrayList<Client> client = new ArrayList<Client>();
	      client.add(client1);
	      client.add(client2); 
	      
	      
	}
}
