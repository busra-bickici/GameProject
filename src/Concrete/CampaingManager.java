package Concrete;

import Abstract.CampaingService;
import Entities.Campaign;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaign campaing) {
		System.out.println(campaing.getName() + " isimli %" + campaing.getDiscount() + " indirimli kampanya eklenmiştir.");
		
	}

	@Override
	public void delete(Campaign campaing) {
		System.out.println(campaing.getName() + " İsimli kampanya silinmiştir.");
		
	}

	@Override
	public void update(Campaign campaing) {
		System.out.println(campaing.getName() + " İsimli kampanya güncellenmiştir.");
		
	}

}
