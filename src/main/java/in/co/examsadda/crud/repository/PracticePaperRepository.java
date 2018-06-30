package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.PracticePaper;

@Repository
public interface PracticePaperRepository extends CrudRepository<PracticePaper, Integer> {
	
	public List<PracticePaper> findAllByInstituteIdFkAndCourseIdFk(String instituteId, int courseId);

	public List<PracticePaper> findAllByCourseIdFk(int courseId);

	public PracticePaper findByPracticePaperId(int practicePaperId);
}
