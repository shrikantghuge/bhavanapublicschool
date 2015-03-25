package com.zensar.shrikantexamsystem.zenemsdaoservices;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.zensar.shrikantexamsystem.beans.*;
import com.zensar.shrikantexamsystem.exceptions.ServicesNotFoundException;
import com.zensar.shrikantexamsystem.serviceprovider.ConnectionProvider;
public class ExamDAOServicesImpl implements ExamDAOServices{

	@Override
	public String insertExam(Exam exam) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertSection(Exam exam, Section section)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertTrainer(Trainer trainer) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertQuestions(List<Question> questions, Section section)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertTrainee(List<Trainee> trainees, Exam exam)
			throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Exam retrieveExam(int examId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> retrieveExams(int trainerId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Section> retrieveSections(int examId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainee> retrieveTrainees(int examId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Section retrieveSection(int examId, int sectionId)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trainee retrieveTrainee(int examId, int traineeId)
			throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateExam(Exam exam) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTrainer(Trainer trainer) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSection(Section section) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteExam(Exam exam) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSection(Section section) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteQuestions(int sectionId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudents(int examId) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Trainer retrieveTrainer(Trainer trainer) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertStudentDetails(String filePath) throws SQLException,
			IOException {
		// TODO Auto-generated method stub
		return false;
	}
	
}

//TODO: Connection pool
//TODO : Excelsheel reading method 
