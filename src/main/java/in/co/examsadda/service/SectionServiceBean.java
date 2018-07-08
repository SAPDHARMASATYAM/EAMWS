package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Section;
import in.co.examsadda.jpa.SectionRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SectionServiceBean implements SectionService {
	
	@Autowired
	private SectionRepository sectionRepository;

	@Override
	public List<Section> getAllSectionsByPracticePaperId(int practicePaperId) {
		List<Section> findAllByPracticePaperPracticePaperIdResponse = sectionRepository.findAllByPracticePaperPracticePaperId(practicePaperId);
		return findAllByPracticePaperPracticePaperIdResponse;
	}

	@Override
	public Section getSectionBySectionId(int practicePaperId) {
		Section getSectionBySectionIdResponse = sectionRepository.getOne(practicePaperId);
		return getSectionBySectionIdResponse;
	}

	@Override
	public Section saveSection(Section section) {
		Section saveSectionResponse = sectionRepository.save(section);
		return saveSectionResponse;
	}

	@Override
	public List<Section> saveSections(List<Section> sections) {
		List<Section> saveSectionsByPracticePaperIdResponse = sectionRepository.saveAll(sections);
		return saveSectionsByPracticePaperIdResponse;
	}
}
