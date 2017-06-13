/**
 * 
 */
package gov.in.pb.pollution.indtracker.repository;

import gov.in.pb.pollution.indtracker.domain.Product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/**
 * @author Punj Corp
 *
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

	List<Product> findByName(String name);
}
