package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Section;
import in.co.examsadda.model.ExamSection;

public interface SectionRepository extends CrudRepository<Section, Integer> {
	
	public List<Section> findAllByPracticePaperId(Integer practicePaperId);
	
}
