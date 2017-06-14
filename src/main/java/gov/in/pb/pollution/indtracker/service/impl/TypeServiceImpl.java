/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;


import gov.in.pb.pollution.indtracker.domain.Type;
import gov.in.pb.pollution.indtracker.repository.TypeRepository;
import gov.in.pb.pollution.indtracker.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author admin
 *
 */
@Service
public class TypeServiceImpl implements TypeService{
	
	private TypeRepository typeRepository;
	
	
	/**
	 * @param typeRepository the typeRepository to set
	 */
	@Autowired
	public void setTypeRepository(TypeRepository typeRepository) {
		this.typeRepository = typeRepository;
	}



	@Override
	public Iterable<Type> getAllTypes() {
		return typeRepository.findAll();
	}

}
