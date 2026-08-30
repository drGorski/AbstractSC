package actualContracts;

import abstractSC.AbstractSC;
import abstractSC.VerificationRule;

import java.time.LocalDate;

public class InsuranceConclusionSC extends AbstractSC {
    public InsuranceConclusionSC(){
        // Correct insurance contract date
        ruleList.add(new VerificationRule(t -> !((InsuranceTransaction) t).getDateFrom().isBefore(LocalDate.now())));
        // Non-zero insurance contract length
        ruleList.add(new VerificationRule(t -> ((InsuranceTransaction) t).getDateFrom().isBefore(((InsuranceTransaction) t).getDateTo())));
        // Positive insurance contract amount
        ruleList.add(new VerificationRule(t -> ((InsuranceTransaction) t).getInsuranceAmount() > 0));
        // Positive insurance contract premium
        ruleList.add(new VerificationRule(t -> ((InsuranceTransaction) t).getInsurancePremium() > 0));
        // Premium lower than the insurance amount
        ruleList.add(new VerificationRule(t -> ((InsuranceTransaction) t).getInsurancePremium() < ((InsuranceTransaction) t).getInsuranceAmount()));
    }
}
