package in.co.examsadda.crud.repository;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
