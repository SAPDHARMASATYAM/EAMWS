package in.co.examsadda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.util.ExamsAddaConstants;

public class ExamPaperDAO{

	Connection connection;
	
	public ExamPaper findExamPaperByExamPaperId(Integer examPaperId) throws Exception{
	PreparedStatement findExamPaperstatement = null;
	PreparedStatement findSectionStatement = null;
	PreparedStatement findQuestionsStatement = null;
	ResultSet findExamResultSet = null;
	ExamPaper examPaper = new ExamPaper();
	PracticePaper paper = new PracticePaper();
	try {
		findExamPaperstatement = connection.prepareStatement(ExamsAddaConstants.FINDEXAMPAPERBYPAPERID);
		findSectionStatement = connection.prepareStatement(ExamsAddaConstants.FINDSECTIONBYID);
		findQuestionsStatement = connection.prepareStatement(ExamsAddaConstants.FINDQUESTIONBYID);
		findExamPaperstatement.setInt(1, examPaperId);
		findExamResultSet = findExamPaperstatement.executeQuery();
		while(findExamResultSet.next()) {
			paper.setPaperNameInEnglish(findExamResultSet.getString("paperNameInEnglish"));
			paper.setPaperNameInRegional(findExamResultSet.getString("paperNameInRegional"));
			paper.setDuration(findExamResultSet.getInt("duration"));
		}
		
	}catch (SQLException sqle) {
		throw sqle;
	}
		return null;
	}

	
	public List<ExamPaper> findExamPapersByExamId(Integer examId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String saveExamPaper(ExamPaper examPaper) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String saveExamPapers(List<ExamPaper> examPapers) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String updateExamPaperByExamId(ExamPaper examPaper) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String deleteExamPaperByExamPaperId(Integer examPaperId) {
		
		return null;
	}

	
	public String deleteExamPapersByExamId(Integer examId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String activateExamPaperByExamPaperId(Integer examPaperId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String deactivateExamPaperByExamPaperId(Integer examPaperId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String activateExamPapersByExamId(Integer examId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String deactivateExamPapersByExamId(Integer examId) {
		// TODO Auto-generated method stub
		return null;
	}

}
