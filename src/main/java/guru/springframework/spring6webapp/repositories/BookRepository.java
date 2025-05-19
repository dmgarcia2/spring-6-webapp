package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring6webapp.domain.Book;

/**
 * @author <a href="mailto:davmarti@amdocs.com">David Martin Garcia</a>
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
