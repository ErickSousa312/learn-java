package DateManipulation.service;

import DateManipulation.Interface.TaxService;

public class BrazilTaxService implements TaxService {
    public double tax(double amount){
        if(amount < 100.0){
            return amount * 0.20;
        }
        return amount * 0.15;
    }

    public BrazilTaxService() {
    }
}
