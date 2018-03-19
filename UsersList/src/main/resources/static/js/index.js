$(function(){
	getUsers("", "", "");
})

$("#filter-form").submit(function(event){
	var username = $("#username").val();
	var name = $("#name").val();
	var email = $("#email").val();
	getUsers(username, name, email);
	event.preventDefault();
});

function getUsers(username, name, email){
	$.get("/users", {username:username, name:name, email:email}, function(response){
		$("#content").html(response);
	});
}