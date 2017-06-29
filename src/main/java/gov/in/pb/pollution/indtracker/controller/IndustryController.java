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

import gov.in.pb.pollution.indtracker.service.IndustryService;
import gov.in.pb.pollution.indtracker.domain.Industry;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Punj Corp
 *
 */
@Controller
public class IndustryController {
	

	private IndustryService industryService;

	/**
	 * @param industryService the industryService to set
	 */
	@Autowired
	public void setIndustryService(IndustryService industryService) {
		this.industryService = industryService;
	}



	@RequestMapping("/industries")
    public String getAllIndustrys(Model model) {
        model.addAttribute("industries", industryService.getAllIndustries());
        System.out.println("Returning industries:");
        return "industry_list";
    }

	@RequestMapping("/industry/add")
    public String addIndustry(Model model) {
		model.addAttribute("industry", new Industry());
        System.out.println("Add a new industry");
        return "industry_save";
    }	
	
	@RequestMapping("/industry/edit/{id}")
    public String editIndustry(@PathVariable Integer id, Model model){
        model.addAttribute("industry", industryService.getIndustryById(id));
        
        System.out.println("Returning industry for id: "+ id);
        return "industry_save";
    }	

	@RequestMapping(value = "industry", method = RequestMethod.POST)
    public String saveIndustry(Industry industry, Model model) {
		industryService.saveIndustry(industry);
		model.addAttribute("industry", industryService.saveIndustry(industry));
		model.addAttribute("success", new String("The industry saved successfully!!"));
        System.out.println("Added a new Industry");
        return "industry_save";
    }	
	
	
	@RequestMapping("/industry/delete/{id}")
    public String deleteCategory(@PathVariable Integer id, Model model){
		System.out.println("Deleting industry for id: "+ id);
		industryService.deleteIndustryById(id);
        model.addAttribute("success", new String("The industry deleted successfully!!"));
        model.addAttribute("industries", industryService.getAllIndustries());
        System.out.println("Deleted industry for id: "+ id);
        return "industry_list";
    }		
	
}
