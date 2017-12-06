/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.dto;

import java.io.Serializable;

import gov.in.pb.pollution.indtracker.domain.Category;
import gov.in.pb.pollution.indtracker.domain.Product;
import gov.in.pb.pollution.indtracker.domain.Resource;
import gov.in.pb.pollution.indtracker.domain.Scale;
import gov.in.pb.pollution.indtracker.domain.Type;

/**
 * @author admin
 *
 */
public class IndustryDTO implements Serializable {
	
	private Iterable<Category> categories;
	private Iterable<Resource> resources;
	private Iterable<Product> products;
	private Iterable<Scale> scales;
	private Iterable<Type> types;
	/**
	 * @return the categories
	 */
	public Iterable<Category> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Iterable<Category> categories) {
		this.categories = categories;
	}
	/**
	 * @return the resources
	 */
	public Iterable<Resource> getResources() {
		return resources;
	}
	/**
	 * @param resources the resources to set
	 */
	public void setResources(Iterable<Resource> resources) {
		this.resources = resources;
	}
	/**
	 * @return the products
	 */
	public Iterable<Product> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(Iterable<Product> products) {
		this.products = products;
	}
	/**
	 * @return the scales
	 */
	public Iterable<Scale> getScales() {
		return scales;
	}
	/**
	 * @param scales the scales to set
	 */
	public void setScales(Iterable<Scale> scales) {
		this.scales = scales;
	}
	/**
	 * @return the types
	 */
	public Iterable<Type> getTypes() {
		return types;
	}
	/**
	 * @param types the types to set
	 */
	public void setTypes(Iterable<Type> types) {
		this.types = types;
	}
	
	

}
