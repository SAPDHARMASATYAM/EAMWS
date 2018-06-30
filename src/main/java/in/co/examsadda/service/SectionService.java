package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Section;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface SectionService {

	Section getSectionBySectionId(int sectionId);

	List<Section> getSectionsByPracticePaperId(int practicePaperId);

}