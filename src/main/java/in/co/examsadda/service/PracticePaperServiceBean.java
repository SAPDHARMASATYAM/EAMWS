package in.co.examsadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.jpa.PracticePaperRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PracticePaperServiceBean implements PracticePaperService {

	@Autowired
	private PracticePaperRepository practicePaperRepository;
	
	@Override
	public PracticePaper getPracticePaperByPracticePaperId(int practicePaperId) {
		return practicePaperRepository.getOne(practicePaperId);
	}

	@Override
	public PracticePaper savePracticePaper(PracticePaper practicePaper) {
		PracticePaper savePracticePaperResponse = practicePaperRepository.save(practicePaper);
		return savePracticePaperResponse;
	}

	@Override
	public PracticePaper updatePracticePaper(PracticePaper practicePaper) {
		PracticePaper updatePracticePaperResponse = practicePaperRepository.save(practicePaper);
		return updatePracticePaperResponse;
	}

	@Override
	public boolean deletePracticePaperByPracticePaperId(int practicePaperId) {
		practicePaperRepository.deleteById(practicePaperId);
		return true;
	}

}
