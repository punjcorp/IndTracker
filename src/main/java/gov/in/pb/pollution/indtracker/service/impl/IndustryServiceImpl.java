/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.in.pb.pollution.indtracker.domain.Industry;
import gov.in.pb.pollution.indtracker.domain.Product;
import gov.in.pb.pollution.indtracker.domain.Resource;
import gov.in.pb.pollution.indtracker.domain.Scale;
import gov.in.pb.pollution.indtracker.domain.Type;
import gov.in.pb.pollution.indtracker.repository.CategoryRepository;
import gov.in.pb.pollution.indtracker.repository.IndustryRepository;
import gov.in.pb.pollution.indtracker.repository.ProductRepository;
import gov.in.pb.pollution.indtracker.repository.ResourceRepository;
import gov.in.pb.pollution.indtracker.repository.ScaleRepository;
import gov.in.pb.pollution.indtracker.repository.TypeRepository;
import gov.in.pb.pollution.indtracker.service.IndustryService;
import gov.in.pb.pollution.indtracker.service.dto.IndustryDTO;
import gov.in.pb.pollution.indtracker.domain.Category;

/**
 * @author Punj Corp
 *
 */
@Service
public class IndustryServiceImpl implements IndustryService {

	private IndustryRepository industryRepository;
	private ResourceRepository resourceRepository;
	private ProductRepository productRepository;
	private TypeRepository typeRepository;
	private CategoryRepository categoryRepository;
	private ScaleRepository scaleRepository;
	
	//private StatusRepository statusRepository;
	

	/**
	 * @param industryRepository
	 *            the industryRepository to set
	 */
	@Autowired
	public void setIndustryRepository(IndustryRepository industryRepository) {
		this.industryRepository = industryRepository;
	}

	
	
	
	/**
	 * @param resourceRepository the resourceRepository to set
	 */
	@Autowired
	public void setResourceRepository(ResourceRepository resourceRepository) {
		this.resourceRepository = resourceRepository;
	}




	/**
	 * @param productRepository the productRepository to set
	 */
	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}




	/**
	 * @param typeRepository the typeRepository to set
	 */
	@Autowired
	public void setTypeRepository(TypeRepository typeRepository) {
		this.typeRepository = typeRepository;
	}




	/**
	 * @param categoryRepository the categoryRepository to set
	 */
	@Autowired
	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}




	/**
	 * @param scaleRepository the scaleRepository to set
	 */
	@Autowired
	public void setScaleRepository(ScaleRepository scaleRepository) {
		this.scaleRepository = scaleRepository;
	}




	@Override
	public Iterable<Industry> getAllIndustries() {
		return industryRepository.findAll();
	}

	@Override
	public Industry getIndustryById(Integer id) {
		return industryRepository.findOne(id);
	}

	@Override
	public boolean deleteIndustryById(Integer id) {
		industryRepository.delete(id);
		return true;
	}

	@Override
	public Industry saveIndustry(Industry industry) {
		return industryRepository.save(industry);
	}

	/**
	 * This method will retrieve all the status for an industry from
	 * database tables along with different possible attributes for an
	 * industry
	 */
	@Override
	public IndustryDTO getAllStatus() {
		Iterable<Resource> resources=resourceRepository.findAll();
		Iterable<Product> products=productRepository.findAll();
		Iterable<Category> categories=categoryRepository.findAll();
		Iterable<Scale> scales=scaleRepository.findAll();
		Iterable<Type> types=typeRepository.findAll();
		
		IndustryDTO industryDetails=new IndustryDTO();
		
		industryDetails.setCategories(categories);
		industryDetails.setProducts(products);
		industryDetails.setResources(resources);;
		industryDetails.setScales(scales);
		industryDetails.setTypes(types);
		
		return industryDetails;
	}
	
}
