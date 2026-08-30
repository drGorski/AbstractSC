package actualContracts;

import abstractSC.AbstractSC;
import abstractSC.VerificationRule;

public class ExchangeEnergyInSC extends AbstractSC {
    public ExchangeEnergyInSC(){
        // SourceDiffersFromTarget
        ruleList.add(new VerificationRule(t -> ((EnergyInTransaction) t).getSourceID() != ((EnergyInTransaction) t).getTargetID()));
        // QuantityGreaterThanZero
        ruleList.add(new VerificationRule(t -> ((EnergyInTransaction) t).getQuantity() > 0));
        // SourceSurplusGreaterEqualQuantity
        ruleList.add(new VerificationRule(t -> ((EnergyInTransaction) t).getSourceSurplus() >= ((EnergyInTransaction) t).getQuantity()));
    }
}
