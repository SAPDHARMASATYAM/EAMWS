package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Section;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface SectionService {
	
	public List<Section> getAllSectionsByPracticePaperId(int practicePaperId);
	public Section getSectionBySectionId(int practicePaperId);
	public Section saveSection(Section section);
	public List<Section> saveSections(List<Section> sections);

}