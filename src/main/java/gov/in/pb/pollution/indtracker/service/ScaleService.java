/**
 * 
 */
package gov.in.pb.pollution.indtracker.service;

import gov.in.pb.pollution.indtracker.domain.Scale;

/**
 * @author admin
 *
 */
public interface ScaleService {

	Iterable<Scale> getAllScales();

	Scale getScaleById(Integer id);

	boolean deleteScaleById(Integer id);

	Scale saveScale(Scale scale);

}
