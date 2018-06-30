package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Option;

@Repository
public interface OptionRepository extends CrudRepository<Option, Integer> {

	public Option findByOptionId(int optionId);
	
	public List<Option> findAllByQuestionIdFk(Integer questionId);
	
	public List<Option> findAllBySectionIdFk(int sectionId);
}
