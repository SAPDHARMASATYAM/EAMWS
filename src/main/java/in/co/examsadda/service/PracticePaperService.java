package in.co.examsadda.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.PracticePaper;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface PracticePaperService {

	public PracticePaper getPracticePaperByPracticePaperId(int practicePaperId);
	public PracticePaper savePracticePaper(PracticePaper practicePaper);
	public PracticePaper updatePracticePaper(PracticePaper practicePaper);
	public boolean deletePracticePaperByPracticePaperId(int practicePaperId);

}