import actualContracts.ExchangeEnergyInSC;
import actualContracts.InsuranceConclusionSC;
import testSC.TestExchangeEnergyInSC;
import testSC.TestInsuranceConclusionSC;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public class RunTestSuite {
    public static void main(String[] args){
        // smart contracts and test classes
        TestInsuranceConclusionSC testInsurance = new TestInsuranceConclusionSC();
        InsuranceConclusionSC insuranceSC = new InsuranceConclusionSC();
        TestExchangeEnergyInSC testEnergy = new TestExchangeEnergyInSC();
        ExchangeEnergyInSC energySC = new ExchangeEnergyInSC();
        // tests for insurance smart contract
        testInsurance.runTestSuite(insuranceSC);
        testEnergy.runTestSuite(energySC);
    }
}