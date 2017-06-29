/**
 * 
 */
package gov.in.pb.pollution.indtracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gov.in.pb.pollution.indtracker.domain.Resource;
import gov.in.pb.pollution.indtracker.service.ResourceService;

/**
 * @author Punj Corp
 *
 */
@Controller
public class ResourceController {

	private ResourceService resourceService;

	/**
	 * @param resourceService
	 *            the resourceService to set
	 */
	@Autowired
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	@RequestMapping("/resources")
	public String getAllResources(Model model) {
		model.addAttribute("resources", resourceService.getAllResources());
		System.out.println("Returning resources:");
		return "resource_list";
	}

	@RequestMapping("/resource/add")
	public String addResource(Model model) {
		model.addAttribute("resource", new Resource());
		System.out.println("Add a new resource");
		return "resource_save";
	}

	@RequestMapping("/resource/edit/{id}")
	public String editResource(@PathVariable Integer id, Model model) {
		model.addAttribute("resource", resourceService.getResourceById(id));
		System.out.println("Returning resource for id: " + id);
		return "resource_save";
	}

	@RequestMapping(value = "resource", method = RequestMethod.POST)
	public String saveResource(Resource resource, Model model) {
		resourceService.saveResource(resource);
		model.addAttribute("resource", resourceService.saveResource(resource));
		model.addAttribute("success", new String("The resource saved successfully!!"));
		System.out.println("Added a new resource");
		return "resource_save";
	}

	@RequestMapping("/resource/delete/{id}")
	public String deleteResource(@PathVariable Integer id, Model model) {
		System.out.println("Deleting resource for id: " + id);
		resourceService.deleteResourceById(id);
		model.addAttribute("success", new String("The resource deleted successfully!!"));
		model.addAttribute("resources", resourceService.getAllResources());
		System.out.println("Deleted resource for id: " + id);
		return "resource_list";
	}

	@RequestMapping("/resource/deleteall")
	public String deleteAllResources(Model model) {
		System.out.println("Deleting all the resources ");
		resourceService.deleteResources();
		model.addAttribute("success", new String("All the resources deleted successfully!!"));
		model.addAttribute("resources", resourceService.getAllResources());
		System.out.println("Deleted all the resources ");
		return "resource_list";
	}

}
