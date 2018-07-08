package in.co.examsadda.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.PracticePaper;

@Repository
public interface PracticePaperRepository extends JpaRepository<PracticePaper, Integer> {
	
	
	
}
