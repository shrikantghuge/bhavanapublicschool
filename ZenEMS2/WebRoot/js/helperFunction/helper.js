// Required helper function starting
Exam.checkCredentials = function(model) {
	console.log('you are going to save the data im model as :--'+model.get('username') +"and password is"+model.get('password'));
	model.fetch({
		error : function() {
			console.log("there is error in storing");
		},
		success : function(model) {
			console.log("Politician updated successfully! response is: "+model);
		}
	});
};

Exam.checktrainerCredentials = function(trainer) {
	trainer.fetch({
		success:function(model){
			console.log('politician fetched successfully');
			//$("#mainSection").html("The admin logged in successfully!!");
			if(model.toJSON().trainerName ==='Shriaknt' ){
				Exam.mainSectionRegions.show(new Exam.InvalidUserView());
				console.log("invalid user selected");
			}
			else{
				Exam.mainSectionRegions.show(new Exam.TrainerHomeView());
				console.log("json id"+model.toJSON().id);
			}
		}
	});
};
	
	