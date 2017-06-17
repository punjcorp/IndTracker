/**
 * 
 */
package gov.in.pb.pollution.indtracker.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import gov.in.pb.pollution.indtracker.service.CategoryService;
import gov.in.pb.pollution.indtracker.domain.Category;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Punj Corp
 *
 */
@Controller
public class CategoryController {
	
	private CategoryService categoryService;
	private CategoryService productService;
	private CategoryService resourceService;
	private CategoryService scaleService;

	/**
	 * @param categoryService the categoryService to set
	 */
	@Autowired
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}



	@RequestMapping("/categories")
    public String getAllCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        System.out.println("Returning categories:");
        return "category_list";
    }

	@RequestMapping("/category/add")
    public String addCategory(Model model) {
		model.addAttribute("category", new Category());
        System.out.println("Add a new category");
        return "category_save";
    }	
	
	@RequestMapping("/category/edit/{id}")
    public String editCategory(@PathVariable Integer id, Model model){
        model.addAttribute("category", categoryService.getCategoryById(id));
        
        System.out.println("Returning category for id: "+ id);
        return "category_save";
    }	

	@RequestMapping(value = "category", method = RequestMethod.POST)
    public String saveCategory(Category category, Model model) {
		categoryService.saveCategory(category);
		model.addAttribute("category", categoryService.saveCategory(category));
		model.addAttribute("success", new String("The category saved successfully!!"));
        System.out.println("Added a new category");
        return "category_save";
    }	
	
	
	@RequestMapping("/category/delete/{id}")
    public String deleteCategory(@PathVariable Integer id, Model model){
		System.out.println("Deleting category for id: "+ id);
		categoryService.deleteCategoryById(id);
        model.addAttribute("success", new String("The category deleted successfully!!"));
        model.addAttribute("categories", categoryService.getAllCategories());
        System.out.println("Deleted category for id: "+ id);
        return "category_list";
    }		
	
}
