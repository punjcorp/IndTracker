/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.in.pb.pollution.indtracker.domain.Resource;
import gov.in.pb.pollution.indtracker.repository.ResourceRepository;
import gov.in.pb.pollution.indtracker.service.ResourceService;

/**
 * @author admin
 *
 */
@Service
public class ResourceServiceImpl implements ResourceService {

	private ResourceRepository resourceRepository;

	/**
	 * @param categoryRepository
	 *            the categoryRepository to set
	 */
	@Autowired
	public void setCategoryRepository(ResourceRepository resourceRepository) {
		this.resourceRepository = resourceRepository;
	}

	@Override
	public Iterable<Resource> getAllResources() {
		return resourceRepository.findAll();
	}

	@Override
	public Resource getResourceById(Integer id) {
		return resourceRepository.findOne(id);
	}

	@Override
	public boolean deleteResourceById(Integer id) {
		resourceRepository.delete(id);
		return true;
	}

	@Override
	public Resource saveResource(Resource resource) {
		return resourceRepository.save(resource);
	}

}
