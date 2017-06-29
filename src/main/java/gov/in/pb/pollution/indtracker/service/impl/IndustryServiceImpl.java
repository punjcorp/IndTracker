/**
 * 
 */
package gov.in.pb.pollution.indtracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.in.pb.pollution.indtracker.domain.Industry;
import gov.in.pb.pollution.indtracker.repository.IndustryRepository;
import gov.in.pb.pollution.indtracker.service.IndustryService;

/**
 * @author Punj Corp
 *
 */
@Service
public class IndustryServiceImpl implements IndustryService {

	private IndustryRepository industryRepository;

	/**
	 * @param industryRepository
	 *            the industryRepository to set
	 */
	@Autowired
	public void setIndustryRepository(IndustryRepository industryRepository) {
		this.industryRepository = industryRepository;
	}

	@Override
	public Iterable<Industry> getAllIndustries() {
		return industryRepository.findAll();
	}

	@Override
	public Industry getIndustryById(Integer id) {
		return industryRepository.findOne(id);
	}

	@Override
	public boolean deleteIndustryById(Integer id) {
		industryRepository.delete(id);
		return true;
	}

	@Override
	public Industry saveIndustry(Industry industry) {
		return industryRepository.save(industry);
	}

}
