/**
 * 
 */
package gov.in.pb.pollution.indtracker.repository;

import gov.in.pb.pollution.indtracker.domain.Type;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/**
 * @author Punj Corp
 *
 */
public interface TypeRepository extends CrudRepository<Type, Integer> {

	List<Type> findByName(String name);
}
