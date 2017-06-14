/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;


import gov.in.pb.pollution.indtracker.domain.Scale;
import gov.in.pb.pollution.indtracker.repository.ScaleRepository;
import gov.in.pb.pollution.indtracker.service.ScaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Punj Corp
 *
 */
@Service
public class ScaleServiceImpl implements ScaleService{
	
	private ScaleRepository scaleRepository;
	
	
	/**
	 * @param scaleRepository the scaleRepository to set
	 */
	@Autowired
	public void setScaleRepository(ScaleRepository scaleRepository) {
		this.scaleRepository = scaleRepository;
	}



	@Override
	public Iterable<Scale> getAllScales() {
		return scaleRepository.findAll();
	}

}
