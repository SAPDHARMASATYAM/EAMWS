package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

//	public List<Question> findAllBySectionId(Integer sectionId);
}
