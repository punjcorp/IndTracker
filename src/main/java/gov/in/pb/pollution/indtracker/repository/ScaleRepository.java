/**
 * 
 */
package gov.in.pb.pollution.indtracker.repository;

import gov.in.pb.pollution.indtracker.domain.Scale;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/**
 * @author Punj Corp
 *
 */
public interface ScaleRepository extends CrudRepository<Scale, Integer> {

	List<Scale> findByName(String scale);
}
