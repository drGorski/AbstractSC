package abstractSC;

import java.util.function.Predicate;

public final class VerificationRule {
    private Predicate<AbstractTransaction> ruleExpression;

    public VerificationRule(Predicate<AbstractTransaction> rule){
        ruleExpression = rule;
    }

    public boolean runRule(AbstractTransaction tr){
        return ruleExpression.test(tr);
    }
}