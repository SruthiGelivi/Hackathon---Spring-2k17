package com.pavan.conversation.service;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pavan.conversation.Utility.MySQLConnection;

public class DoctorService {
	public String insertNewBook(Appointment appointment) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String sql = "insert into (title,author,price) values(?,?,?)";
		try {
			connection = MySQLConnection.getConnection();
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, appointment.getName());
			preparedStatement.setString(2, appointment.getExperience());
			preparedStatement.setInt(3, appointment.getFees());
			preparedStatement.setString(4, appointment.getPlace());
			preparedStatement.setString(5, appointment.getSpecialization());
			int n = preparedStatement.executeUpdate();
			if (n > 0) {
				return "SUCCESS";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "FAIL";
	}
	
	public Appointment getAppointment(Integer idemotable){
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String sql="select * from new_tabledemotable where iddemotable=?";
		try{
			connection=MySQLConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idemotable);;
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
                Appointment appointment= new Appointment();
				appointment.setExperience(resultSet.getString("degree")); 	
				appointment.setTime(resultSet.getString("first_name"));
				appointment.setFees(resultSet.getInt("iddemotable"));
				appointment.setName(resultSet.getString("last_name"));
				
//				appointment.setSpecialization(resultSet.getString(""));
				return appointment;				
			}else{
				return null;
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();			
		}
		
		return null;
	}
}


