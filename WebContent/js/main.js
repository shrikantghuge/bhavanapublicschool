$(document).ready(function(){
	$("#about-us").click(function(){
		$.ajax({
			url: "aboutus",			
			success:function(response){				
				$("#main-containt").html(response)
			}
		});
	});
	
	$("#extra_curricular").click(function(){
		$.ajax({
			url: "extra",			
			success:function(response){				
				$("#main-containt").html(response)
			}
		});
	});
	$("#facilities").click(function(){
		$.ajax({
			url: "facilities",			
			success:function(response){				
				$("#main-containt").html(response)
			}
		});
	});
});