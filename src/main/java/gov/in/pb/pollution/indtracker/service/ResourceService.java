/**
 * 
 */
package gov.in.pb.pollution.indtracker.service;

import gov.in.pb.pollution.indtracker.domain.Resource;

/**
 * @author admin
 *
 */
public interface ResourceService {

	Iterable<Resource> getAllResources();

	Resource getResourceById(Integer id);

	boolean deleteResourceById(Integer id);

	boolean deleteResources();

	Resource saveResource(Resource resource);

}
