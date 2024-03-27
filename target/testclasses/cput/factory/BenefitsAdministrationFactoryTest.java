package target.testclasses.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import target.classes.za.ac.cput.domain.BenefitsAdministration;
import target.classes.za.ac.cput.factory.BenefitsAdministrationFactory;

public class BenefitsAdministrationFactoryTest {
    @Test
    public void testCreateBenefitsAdministration() {


        BenefitsAdministration benefits = BenefitsAdministrationFactory.createBenefitsAdministration(true, true,true,true,true,true,true);


        Assertions.assertTrue(benefits.isHealthInsurance());
        Assertions.assertTrue(benefits.isRetirementPlans());
        Assertions.assertTrue(benefits.isPaidTimeOff());
        Assertions.assertTrue(benefits.isTuitionReimbursement());
        Assertions.assertTrue(benefits.isIncentives());
        Assertions.assertTrue(benefits.isFlexibleSpendingAccounts());
        Assertions.assertTrue(benefits.isEmployeeAssistancePrograms());
    }
}
