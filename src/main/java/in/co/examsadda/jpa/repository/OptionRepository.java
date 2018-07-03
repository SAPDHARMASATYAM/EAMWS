package in.co.examsadda.jpa.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {

	public Option findByOptionId(Integer optionId);
	
	public List<Option> findAllByQuestionIdFk(BigInteger questionId);
	
	public List<Option> findAllBySectionIdFk(int sectionId);
}
