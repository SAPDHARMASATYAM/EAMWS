package in.co.examsadda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.service.ExamPaperService;

@RestController
@RequestMapping("exam")
public class ExamController {

	@Autowired
	private ExamPaperService examPaperService;

	/* This method is for single practice paper based on practice paper id */
	@RequestMapping(value = "/getExamPaperByExamPaperId/{examPaperId}", method = RequestMethod.GET, produces = "application/json")
	public ExamPaper getExamPaperByExamPaperId(@PathVariable(name = "examPaperId") Integer examPaperId)
			throws Exception {
		ExamPaper examPaperByExamPaperId = examPaperService.getExamPaperByExamPaperId(examPaperId);
		return examPaperByExamPaperId;
	}

}
