package gameProject;

import java.util.GregorianCalendar;

import Abstract.CampaingService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaingManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {
 
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		CampaingManager campaignManager = new CampaingManager();
		GameManager gameManager = new GameManager();

		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Büşra");
	    customer.setLastName("Bıçkıcı");
	    customer.setDateOfBirth (new GregorianCalendar( 1994 ,07 , 07).getTime());
	    customer.setNationalityId("33178554860");
		customerManager.add(customer);

		Game game = new Game();
		game.setId(1);
		game.setName("Pokemon");
		game.setUnitPrice(10.5);
		gameManager.buying(game,customer);
		
		Campaign campaing = new Campaign();
		campaing.setId(1);
		campaing.setName("Yılbaşı");
		campaing.setDiscount(10.5);
		game.getPriceAfterDiscount(campaing);
		game.setUnitPrice(200);
		campaignManager.add(campaing);
		
	
	

		
	}	


}
