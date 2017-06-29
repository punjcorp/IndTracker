/**
 * 
 */
package gov.in.pb.pollution.indtracker.service;

import gov.in.pb.pollution.indtracker.domain.Industry;

/**
 * @author Punj Corp
 *
 */
public interface IndustryService {

	Iterable<Industry> getAllIndustries();

	Industry getIndustryById(Integer id);

	boolean deleteIndustryById(Integer id);

	Industry saveIndustry(Industry industry);

}
