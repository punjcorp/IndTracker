/**
 * 
 */
package gov.in.pb.pollution.indtracker.service;

import gov.in.pb.pollution.indtracker.domain.Category;
/**
 * @author admin
 *
 */
public interface CategoryService {
	
	Iterable<Category> getAllCategories();
	Category getCategoryById(Integer id);
	boolean deleteCategoryById(Integer id);
	Category saveCategory(Category category);
	
}
