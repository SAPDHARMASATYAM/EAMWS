package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.model.ExamPaper;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface ExamPaperService {

	public ExamPaper getExamPaperByExamPaperId(Integer examPaperId) throws Exception;
	public List<ExamPaper> getExamPapersByExamIds(List<Integer> examPaperIds ) throws Exception;

	public ExamPaper saveExamPaper(ExamPaper examPaper)throws Exception;
	public List<ExamPaper> saveExamPapers(List<ExamPaper> examPapers)throws Exception;

}