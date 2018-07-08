package in.co.examsadda.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer> {

	
}
