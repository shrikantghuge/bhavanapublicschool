//Models Section
	Exam.Student = Backbone.Model.extend({
		urlRoot : './Login',
		initialize : function() {
			console.log("Student object is initialized!");
		}
	});
	
	Exam.Trainer = Backbone.Model.extend({
	urlRoot : '/traineerLogin',
	defaults : {
		id:100,
		trainerName:'Shriaknt',
		speciality:'software dev',
		trainerEmailId : 'shghuge@cisco.com',
		trainerMobileNo : 7894561234,
		trainerPassword : 'shri'
	} ,
	initialize : function(){
		console.log("Trainer model has been initialized");
	}
	});
	