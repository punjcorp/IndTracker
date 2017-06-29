/**
 * 
 */
package gov.in.pb.pollution.indtracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import gov.in.pb.pollution.indtracker.domain.Industry;

/**
 * @author Punj Corp
 *
 */
public interface IndustryRepository extends CrudRepository<Industry, Integer> {

	List<Industry> findByName(String name);

	List<Industry> findByFileNo(String fileNo);

	List<Industry> findByCategoryId(String categoryId);

	List<Industry> findByScaleId(String scaleId);
}
