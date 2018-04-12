//Author: Furkan Þentürk
//Data:12.04.2018

package project342;

import java.util.ArrayList;

public class Client {
	public int Id;
	private String CompanyName;
	private String CompanyAddress;
	private String ContactName;
	
	
	
	public Client(int id, String companyName, String companyAddress, String contactName)
	   {
	      this.CompanyName = companyName;     
	      this.CompanyAddress = companyAddress;
	      this.ContactName = contactName;     
	      this.Id = id;    
	   }

	public void CreateClient(int Id, String CompanyName, String CompanyAddress, String ContactName) {
		  Client client1 = new Client(1, "Senturkler", "ataþehir", "Furkan");
	      ArrayList<Client> client = new ArrayList<Client>();
	      client.add(client1);
	      Client client2 = new Client(2, "Kahramanlar", "Acýbadem", "Mesut");
	      client.add(client2); 
	}
	
}

