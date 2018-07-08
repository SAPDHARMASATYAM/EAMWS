package in.co.examsadda.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {

	public List<Option> findAllByQuestionQuestionId(Long questionId);
}
