/**
 * 
 */
package gov.in.pb.pollution.indtracker.service;

import gov.in.pb.pollution.indtracker.domain.Product;

/**
 * @author admin
 *
 */
public interface ProductService {

	Iterable<Product> getAllProducts();

	Product getProductById(Integer id);

	boolean deleteProductById(Integer id);

	Product saveProduct(Product product);

}
