package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	
	CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService ) {
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		
		if(customerCheckService.checkIfRealCustomer(customer)) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + "Kaydınız başarıyla gerçekleştirilmiştir." + 
		      customer.getFirstName().toUpperCase() + "!");
		}else {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + "Kaydınız oluşturulamadı.Yeniden deneyiniz!" );
		}
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " +customer.getLastName() + " Hesabınız silinmiştir.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Bilgileriniz güncellenmiştir.");
		
	}

}
