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

import gov.in.pb.pollution.indtracker.service.ProductService;
import gov.in.pb.pollution.indtracker.domain.Product;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Punj Corp
 *
 */
@Controller
public class ProductController {
	

	private ProductService productService;

	/**
	 * @param productService the productService to set
	 */
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}



	@RequestMapping("/products")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        System.out.println("Returning products:");
        return "product_list";
    }

	@RequestMapping("/product/add")
    public String addProduct(Model model) {
		model.addAttribute("product", new Product());
        System.out.println("Add a new category");
        return "product_save";
    }	
	
	@RequestMapping("/product/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        
        System.out.println("Returning product for id: "+ id);
        return "product_save";
    }	

	@RequestMapping(value = "product", method = RequestMethod.POST)
    public String saveProduct(Product product, Model model) {
		productService.saveProduct(product);
		model.addAttribute("product", productService.saveProduct(product));
		model.addAttribute("success", new String("The product saved successfully!!"));
        System.out.println("Added a new Product");
        return "product_save";
    }	
	
	
	@RequestMapping("/product/delete/{id}")
    public String deleteCategory(@PathVariable Integer id, Model model){
		System.out.println("Deleting product for id: "+ id);
		productService.deleteProductById(id);
        model.addAttribute("success", new String("The product deleted successfully!!"));
        model.addAttribute("products", productService.getAllProducts());
        System.out.println("Deleted product for id: "+ id);
        return "product_list";
    }		
	
}
