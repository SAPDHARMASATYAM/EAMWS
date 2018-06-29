package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Option;

public interface OptionRepository extends CrudRepository<Option, Integer> {

	public List<Option> findAllByQuestionIdFk(Integer questionId);
}
