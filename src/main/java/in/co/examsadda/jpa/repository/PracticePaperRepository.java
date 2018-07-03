package in.co.examsadda.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.PracticePaper;

@Repository
public interface PracticePaperRepository extends JpaRepository<PracticePaper, Integer> {
	
	public List<PracticePaper> findAllByInstituteIdFkAndCourseIdFk(String instituteId, int courseId);

	public List<PracticePaper> findAllByCourseIdFk(int courseId);

	public PracticePaper findByPracticePaperId(int practicePaperId);
}
