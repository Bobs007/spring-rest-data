package au.com.itgeeks.spring.data.rest;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("au.com.itgeeks.spring.data.rest");

        noClasses()
            .that()
                .resideInAnyPackage("au.com.itgeeks.spring.data.rest.service..")
            .or()
                .resideInAnyPackage("au.com.itgeeks.spring.data.rest.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..au.com.itgeeks.spring.data.rest.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
