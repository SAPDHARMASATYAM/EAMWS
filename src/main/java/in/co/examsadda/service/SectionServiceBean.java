package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import in.co.examsadda.crud.repository.SectionRepository;
import in.co.examsadda.entity.Section;

public class SectionServiceBean implements SectionService {
	
	@Autowired
	private SectionRepository sectionRepository;
	
	@Override
	public Section getSectionBySectionId(int sectionId) {
		return sectionRepository.findById(sectionId).get();
	}

	@Override
	public List<Section> getSectionsByPracticePaperId(int practicePaperId) {
		return sectionRepository.findAllByPracticePaperIdFk(practicePaperId);
	}
}
