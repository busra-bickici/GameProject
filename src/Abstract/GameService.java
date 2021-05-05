package Abstract;

import Entities.Customer;
import Entities.Game;
import Entities.Campaign;

public interface GameService {
	
	void buying(Game game,Customer customer);
	void buying(Game game, Customer customer,Campaign campaing );
	

}
 