/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;


import gov.in.pb.pollution.indtracker.domain.Category;
import gov.in.pb.pollution.indtracker.repository.CategoryRepository;
import gov.in.pb.pollution.indtracker.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author admin
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService{
	
	private CategoryRepository categoryRepository;
	
	
	/**
	 * @param categoryRepository the categoryRepository to set
	 */
	@Autowired
	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}



	@Override
	public Iterable<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

}
