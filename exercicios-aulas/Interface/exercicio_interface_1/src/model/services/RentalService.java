package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePeyDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePeyDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePeyDay = pricePeyDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} 
		else {
			basicPayment = pricePeyDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
