/**
 * 
 */
package gov.in.pb.pollution.indtracker.repository;

import gov.in.pb.pollution.indtracker.domain.Resource;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/**
 * @author Punj Corp
 *
 */
public interface ResourceRepository extends CrudRepository<Resource, Integer> {

	List<Resource> findByName(String name);
}
