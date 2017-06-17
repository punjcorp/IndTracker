/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.in.pb.pollution.indtracker.domain.Scale;
import gov.in.pb.pollution.indtracker.repository.ScaleRepository;
import gov.in.pb.pollution.indtracker.service.ScaleService;

/**
 * @author Punj Corp
 *
 */
@Service
public class ScaleServiceImpl implements ScaleService {

	private ScaleRepository scaleRepository;

	/**
	 * @param scaleRepository
	 *            the scaleRepository to set
	 */
	@Autowired
	public void setScaleRepository(ScaleRepository scaleRepository) {
		this.scaleRepository = scaleRepository;
	}

	@Override
	public Iterable<Scale> getAllScales() {
		return scaleRepository.findAll();
	}

	@Override
	public Scale getScaleById(Integer id) {
		return scaleRepository.findOne(id);
	}

	@Override
	public boolean deleteScaleById(Integer id) {
		scaleRepository.delete(id);
		return true;
	}

	@Override
	public Scale saveScale(Scale scale) {
		return scaleRepository.save(scale);
	}

}
