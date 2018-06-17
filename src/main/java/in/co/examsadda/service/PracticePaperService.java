package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.PracticePaperRepository;
import in.co.examsadda.entity.PracticePaper;

@Service
public class PracticePaperService {

	@Autowired
	private PracticePaperRepository practicePaperRepository;
	
	public PracticePaper getPracticePaperByPracticePaperId(Integer practicePaperId){	
		return practicePaperRepository.findById(practicePaperId).get();
	}
	
	public List<PracticePaper> getPracticePapersByCourseId(Integer practicePaperId){	
		return practicePaperRepository.findAllByCourseId(practicePaperId);
	}
}
