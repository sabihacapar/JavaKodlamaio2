package oop1;

public class Main {

	public static void main(String[] args) {

		// class tanımlama ve değişkeni oluşturma

		Product product1 = new Product();
	product1.setName("Delonghi kahve makinesi");
	product1.setDiscount(7);
	product1.setUnitPrice(7500);
	product1.setUnitsInStock(3);
	product1.setImageUrl("image1.jpg");
	
	

		Product product2 = new Product();
	
		product2.setName("Smothi kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		
		product3.setName("Kitchen kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = { product1, product2, product3 };// string int vs olmaz burada sadece product olur

		System.out.println("<ul>");
		for (Product product : products) {
			// products tek tek gez
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer()
;
		individualCustomer.setId(1);
		individualCustomer.setPhone("00003403043");
		individualCustomer.setCustomerNumber("11222");
		individualCustomer.setFirstName("Sabiha");
		individualCustomer.setLastName("Çapar");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("05434342");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("5324");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
