package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.SectionRepository;
import in.co.examsadda.entity.Section;

@Service
public class ExamSectionService {
	@Autowired
	private SectionRepository sectionRepository;

	public Section getSectionBySectionId(Integer sectionId) {
		return sectionRepository.findById(sectionId).get();
	}
	public List<Section> getAllSectionsByPracticepaperId(Integer practicePaperId){
		return sectionRepository.findAllByPracticePaperId(practicePaperId);
	}
}
