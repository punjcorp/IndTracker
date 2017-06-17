/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.in.pb.pollution.indtracker.domain.Type;
import gov.in.pb.pollution.indtracker.repository.TypeRepository;
import gov.in.pb.pollution.indtracker.service.TypeService;

/**
 * @author admin
 *
 */
@Service
public class TypeServiceImpl implements TypeService {

	private TypeRepository typeRepository;

	/**
	 * @param typeRepository
	 *            the typeRepository to set
	 */
	@Autowired
	public void setTypeRepository(TypeRepository typeRepository) {
		this.typeRepository = typeRepository;
	}

	@Override
	public Iterable<Type> getAllTypes() {
		return typeRepository.findAll();
	}

	@Override
	public Type getTypeById(Integer id) {
		return typeRepository.findOne(id);
	}

	@Override
	public boolean deleteTypeById(Integer id) {
		typeRepository.delete(id);
		return true;
	}

	@Override
	public Type saveType(Type type) {
		return typeRepository.save(type);
	}

}
