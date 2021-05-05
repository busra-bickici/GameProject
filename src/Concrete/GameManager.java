package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService {

	private Campaign campaign;

	@Override
	public void buying(Game game, Customer customer) {
		System.out.println("Satınalma işlemi gerçekleşti. \nToplam Tutar: " + game.getUnitPrice());
		
	}

	@Override
	public void buying(Game game, Customer customer, Campaign campaing) {
		System.out.println(game.getName() + " " + " İndirimli satınalma işlemi gerçekleşti.\nToplam Tutar : " + 
				game.getPriceAfterDiscount(campaing) + "\nKullanılan Kampanya : " + campaing.getName() +
				"\nToplam İndirim : %" + campaign.getDiscount() +
				 customer.getFirstName().toUpperCase());
		
	}


	

}
