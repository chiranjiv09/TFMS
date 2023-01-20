package com.tfms.dao;

import java.sql.SQLException;
import java.util.List;

import com.tfms.model.Associate;

public interface AssociateDao {

	public int addForm(Associate associate) throws Exception;
//	public void updateForm(Associate associate , String traineeId) throws SQLException;
	public void deleteForm(String traineeId) throws SQLException;
	public Associate getAssociate(String traineeId) throws SQLException;
	void updateForm() throws SQLException;
	
//	public List<Associate> getAssociates() throws SQLException;
	

	}

