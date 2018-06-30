package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Section;

@Repository
public interface SectionRepository extends CrudRepository<Section, Integer> {

	public List<Section> findAllByPracticePaperIdFk(int practicePaperId);
	
}
