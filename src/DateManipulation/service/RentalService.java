package DateManipulation.service;

import DateManipulation.CarRental;
import DateManipulation.Interface.TaxService;
import DateManipulation.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        double minutes =  Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes();
        double hours = Math.ceil(minutes / 60);

        double basicPayment;
        if (minutes>12) {
            basicPayment = pricePerHour * hours;
        }else {
            basicPayment = pricePerDay * (hours/24.0);
        }

        carRental.setInvoice(new Invoice(basicPayment, taxService.tax(basicPayment)));
    }


}
