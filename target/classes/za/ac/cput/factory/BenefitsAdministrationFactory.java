package target.classes.za.ac.cput.factory;
/*Masithembe Ndzotyana
  BenefitsAdminstration
  219145091
 */

import target.classes.za.ac.cput.domain.BenefitsAdministration;



public class BenefitsAdministrationFactory {


    public static BenefitsAdministration createBenefitsAdministration(
            boolean healthInsurance,
            boolean retirementPlans,
            boolean paidTimeOff,
            boolean tuitionReimbursement,
            boolean incentives,
            boolean flexibleSpendingAccounts,
            boolean employeeAssistancePrograms) {


        return new BenefitsAdministration.Builder()
                .healthInsurance(healthInsurance)
                .retirementPlans(retirementPlans)
                .paidTimeOff(paidTimeOff)
                .tuitionReimbursement(tuitionReimbursement)
                .incentives(incentives)
                .flexibleSpendingAccounts(flexibleSpendingAccounts)
                .employeeAssistancePrograms(employeeAssistancePrograms)
                .build();
    }

}
