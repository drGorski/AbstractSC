package testSC;

import actualContracts.EnergyInTransaction;
import smarTSv2.AbstractTestSC;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public class TestExchangeEnergyInSC extends AbstractTestSC {
    public void initiateTransactions(){
        transactions.clear();
        transactions.add(new EnergyInTransaction(500.0, 1000.0, 2500.0, 0.0, 10.0, 100, 200));
        transactions.add(new EnergyInTransaction(500.0, 1000.0, 2500.0, 0.0, 10.0, 100, 100));
        transactions.add(new EnergyInTransaction(0.0, 1000.0, 2500.0, 0.0, 10.0, 100, 200));
        transactions.add(new EnergyInTransaction(500.0, 100.0, 2500.0, 0.0, 10.0, 100, 200));
    }
}