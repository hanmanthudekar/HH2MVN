import org.testng.mustache.Model;

public class AdService {

	private String quatationID;
	private String costumerType;
	private Model model;
	private static int counter=1001;
	
	
	public AdService(String costumerType,Model model) {
		this.costumerType=costumerType;
		this.model=model;
	}
	
	public String getCostumerType() {
		
	}
}
