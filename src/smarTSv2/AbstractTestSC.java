package smarTSv2;

import abstractSC.AbstractSC;
import abstractSC.AbstractTransaction;

import java.util.ArrayList;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public abstract class AbstractTestSC {
    protected ArrayList<AbstractTransaction> transactions = new ArrayList<>();
    public AbstractTestSC(){
        initiateTransactions();
    }
    protected abstract void initiateTransactions();
    private void runTest(AbstractSC sC, AbstractTransaction tR, int trNumber, boolean expectedResult){
        boolean result = sC.checkSC(tR);
        boolean correct = result == expectedResult;
        System.out.println("Test no: " + (trNumber + 1) + ", transaction: " + tR.getClass().getTypeName() + ", result: " + ((correct)?"PASS":"FAIL"));
    }
    public final void runTestSuite(AbstractSC sC){
        System.out.println("Smart contract: " + sC.getClass().getTypeName());
        for (int i = 0; i < transactions.size(); i++){
            runTest(sC, transactions.get(i),i, i == 0);
        }
    }
}
