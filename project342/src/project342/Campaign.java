package project342;
import java.util.ArrayList;
//Author:Mesut Kahraman
//Date:13.04.2018
public class Campaign {

	public int Cid;
	public String title;
	public String CampaignStartDate;
	public String CampaignFinishDate;
	public double estimatedCost;
	
	public Campaign( int Id, String t,String csd, String cfd, double estcost) {
		this.Cid=Id;
		this.title = t;
		this.CampaignStartDate = csd;
		this.CampaignFinishDate = cfd;
		this.estimatedCost = estcost;
	}
	
	/*public CreateCampaign() {
		Campaign campaign1=new Campaign(3, "Bilgisayar", "May�s", "Haziran", 1500);
		 ArrayList<Campaign> campaign = new ArrayList<Campaign>();
		 campaign.add(campaign1);
		Campaign campaign2=new Campaign(4, "Telefon", "Nisan", "Temmuz", 1300);
		campaign.add(campaign2);
		
	}*/
}
