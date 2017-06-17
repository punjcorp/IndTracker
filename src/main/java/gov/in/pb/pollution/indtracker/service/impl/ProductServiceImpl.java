/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.in.pb.pollution.indtracker.domain.Product;
import gov.in.pb.pollution.indtracker.repository.ProductRepository;
import gov.in.pb.pollution.indtracker.service.ProductService;

/**
 * @author admin
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	/**
	 * @param categoryRepository
	 *            the categoryRepository to set
	 */
	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Iterable<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepository.findOne(id);
	}

	@Override
	public boolean deleteProductById(Integer id) {
		productRepository.delete(id);
		return true;
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

}
