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

import gov.in.pb.pollution.indtracker.domain.Scale;
import gov.in.pb.pollution.indtracker.service.ScaleService;

/**
 * @author Punj Corp
 *
 */
@Controller
public class ScaleController {

	private ScaleService scaleService;

	/**
	 * @param scaleService
	 *            the scaleService to set
	 */
	@Autowired
	public void setScaleService(ScaleService scaleService) {
		this.scaleService = scaleService;
	}

	@RequestMapping("/scales")
	public String getAllScales(Model model) {
		model.addAttribute("scales", scaleService.getAllScales());
		System.out.println("Returning scales:");
		return "scale_list";
	}

	@RequestMapping("/scale/add")
	public String addScale(Model model) {
		model.addAttribute("scale", new Scale());
		System.out.println("Add a new scale");
		return "scale_save";
	}

	@RequestMapping("/scale/edit/{id}")
	public String editScale(@PathVariable Integer id, Model model) {
		model.addAttribute("scale", scaleService.getScaleById(id));

		System.out.println("Returning scale for id: " + id);
		return "scale_save";
	}

	@RequestMapping(value = "scale", method = RequestMethod.POST)
	public String saveScale(Scale scale, Model model) {
		scaleService.saveScale(scale);
		model.addAttribute("scale", scaleService.saveScale(scale));
		model.addAttribute("success", new String("The scale saved successfully!!"));
		System.out.println("Added a new scale");
		return "scale_save";
	}

	@RequestMapping("/scale/delete/{id}")
	public String deleteScale(@PathVariable Integer id, Model model) {
		System.out.println("Deleting scale for id: " + id);
		scaleService.deleteScaleById(id);
		model.addAttribute("success", new String("The scale deleted successfully!!"));
		model.addAttribute("scales", scaleService.getAllScales());
		System.out.println("Deleted scale for id: " + id);
		return "scale_list";
	}

}
