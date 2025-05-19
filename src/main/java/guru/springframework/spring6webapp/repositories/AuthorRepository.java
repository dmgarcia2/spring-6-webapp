package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domain.Author;

/**
 * @author <a href="mailto:davmarti@amdocs.com">David Martin Garcia</a>
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
