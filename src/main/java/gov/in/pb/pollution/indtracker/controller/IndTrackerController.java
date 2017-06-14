/**
 * 
 */
package gov.in.pb.pollution.indtracker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import gov.in.pb.pollution.indtracker.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Punj Corp
 *
 */
@Controller
public class IndTrackerController {
	
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

}
