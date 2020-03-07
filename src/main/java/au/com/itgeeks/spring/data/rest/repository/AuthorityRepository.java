package au.com.itgeeks.spring.data.rest.repository;

import au.com.itgeeks.spring.data.rest.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
