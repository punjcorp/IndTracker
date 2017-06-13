/**
 * 
 */
package gov.in.pb.pollution.indtracker.repository;

import gov.in.pb.pollution.indtracker.domain.Category;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/**
 * @author Punj Corp
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Integer> {

	List<Category> findByName(String name);
}
