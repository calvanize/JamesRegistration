$(function() {
	$("#squareform").on("submit", function(e){		
		$.post($(this).attr("action"), 
			$(this).serialize(), 
			function(res){
				$("#result").val(res);
			}
		);
	return false;
	});
});