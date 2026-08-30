package actualContracts;

import abstractSC.AbstractTransaction;

import java.time.LocalDate;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public class InsuranceTransaction extends AbstractTransaction {
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double insurancePremium;
    private double insuranceAmount;
    public InsuranceTransaction(LocalDate dateFrom, LocalDate dateTo, double insurancePremium, double insuranceAmount){
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.insurancePremium = insurancePremium;
        this.insuranceAmount = insuranceAmount;
    }
    public LocalDate getDateFrom() {
        return dateFrom;
    }
    public LocalDate getDateTo() {
        return dateTo;
    }
    public double getInsurancePremium() {
        return insurancePremium;
    }
    public double getInsuranceAmount() {
        return insuranceAmount;
    }
}
