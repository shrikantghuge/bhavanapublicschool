package com.zensar.shrikantexamsystem.actioncontroller;

import org.springframework.beans.factory.annotation.Autowired;

import com.zensar.shrikantexamsystem.beans.Trainee;

/**
 * @author shghuge
 *
 */
public class TraineeLoginAction {
	public TraineeLoginAction() {
		System.out.println("The constructor of trainerloginAction is being created");
	}
	@Autowired
	private Trainee trainee;
	
	public String checkLogin() {
		System.out.println("The username and password is : =="+trainee);
		return "SUCCESS";
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
}
