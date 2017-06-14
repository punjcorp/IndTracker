/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;


import gov.in.pb.pollution.indtracker.domain.Product;
import gov.in.pb.pollution.indtracker.repository.ProductRepository;
import gov.in.pb.pollution.indtracker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author admin
 *
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;
	
	
	/**
	 * @param categoryRepository the categoryRepository to set
	 */
	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}



	@Override
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}

}
