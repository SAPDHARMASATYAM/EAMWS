package in.co.examsadda.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	public List<Question> findAllBySectionSectionId(int sectionId);
}
