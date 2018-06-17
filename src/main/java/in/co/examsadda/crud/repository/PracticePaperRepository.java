package in.co.examsadda.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.PracticePaper;

public interface PracticePaperRepository extends CrudRepository<PracticePaper, Integer> {

	public List<PracticePaper> findAllByCourseId(Integer courseId);
}
