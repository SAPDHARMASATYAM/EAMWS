package in.co.examsadda.jpa.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, BigInteger> {
	
	public Question findByQuestionId(Integer questionId);
	
	public List<Question> findAllBySectionIdFk(int sectionIda);
	
	public List<Question> findAllByPracticePaperIdFk(int practicePaperId);
}
