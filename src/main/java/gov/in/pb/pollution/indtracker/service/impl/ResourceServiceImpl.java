/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;


import gov.in.pb.pollution.indtracker.domain.Resource;
import gov.in.pb.pollution.indtracker.repository.ResourceRepository;
import gov.in.pb.pollution.indtracker.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author admin
 *
 */
@Service
public class ResourceServiceImpl implements ResourceService{
	
	private ResourceRepository resourceRepository;
	
	
	/**
	 * @param categoryRepository the categoryRepository to set
	 */
	@Autowired
	public void setCategoryRepository(ResourceRepository resourceRepository) {
		this.resourceRepository = resourceRepository;
	}



	@Override
	public Iterable<Resource> getAllResources() {
		return resourceRepository.findAll();
	}

}
