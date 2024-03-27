package target.classes.za.ac.cput.repository;
/*Masithembe Ndzotyana
  BenefitsAdminstration
  219145091
 */

import target.classes.za.ac.cput.domain.BenefitsAdministration;

import java.util.Map;

public interface IBenefitsAdministrationRepository {

    void create(int id, BenefitsAdministration benefitsAdministration);
    BenefitsAdministration read(int id);
    void update(int id, BenefitsAdministration benefitsAdministration);
    void delete(int id);
    Map<Integer, BenefitsAdministration> getAll();
}
