package abstractSC;

import java.util.ArrayList;
import java.util.List;
/************************************
 *  Author: Tomasz Górski
 *  e-mail: tomasz.gorski@ieee.org
 ************************************/
public abstract class AbstractSC {
    // list of verification rules
    protected List<VerificationRule> ruleList = new ArrayList<>();
    // checking the smart contract
    public final boolean checkSC(AbstractTransaction tr){
        boolean correct = false;
        for (VerificationRule vR : ruleList) {
            correct = vR.runRule(tr);
            if (!correct) break;
        }
        return correct;
    }
}