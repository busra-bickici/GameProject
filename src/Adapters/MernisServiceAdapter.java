package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;




public class MernisServiceAdapter  implements CustomerCheckService{

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();

		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return result;
	}

}
