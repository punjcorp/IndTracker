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

import gov.in.pb.pollution.indtracker.domain.Type;
import gov.in.pb.pollution.indtracker.service.TypeService;

/**
 * @author Punj Corp
 *
 */
@Controller
public class TypeController {

	private TypeService typeService;

	/**
	 * @param typeService
	 *            the typeService to set
	 */
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	@RequestMapping("/types")
	public String getAllTypes(Model model) {
		model.addAttribute("types", typeService.getAllTypes());
		System.out.println("Returning types:");
		return "type_list";
	}

	@RequestMapping("/type/add")
	public String addType(Model model) {
		model.addAttribute("type", new Type());
		System.out.println("Add a new type");
		return "type_save";
	}

	@RequestMapping("/type/edit/{id}")
	public String editType(@PathVariable Integer id, Model model) {
		model.addAttribute("type", typeService.getTypeById(id));

		System.out.println("Returning type for id: " + id);
		return "type_save";
	}

	@RequestMapping(value = "type", method = RequestMethod.POST)
	public String saveType(Type type, Model model) {
		typeService.saveType(type);
		model.addAttribute("type", typeService.saveType(type));
		model.addAttribute("success", new String("The type saved successfully!!"));
		System.out.println("Added a new type");
		return "type_save";
	}

	@RequestMapping("/type/delete/{id}")
	public String deleteType(@PathVariable Integer id, Model model) {
		System.out.println("Deleting type for id: " + id);
		typeService.deleteTypeById(id);
		model.addAttribute("success", new String("The type deleted successfully!!"));
		model.addAttribute("types", typeService.getAllTypes());
		System.out.println("Deleted type for id: " + id);
		return "type_list";
	}

}
