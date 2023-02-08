function checkForm(){

	

	if((document.getElementById("cardNumber").value).length==0){
		alert("Please enter the card number!");
		return false;
	}
	
	if((document.getElementById("cardNumber").value).length==0){
		alert("Please enter the card number!");
		return false;
	}
	if(isNaN(document.getElementById("cardNumber").value)){
		alert("Invalid Card number!");
		return false;
	}
	
	if((document.getElementById("cardNumber").value).length<16){
		alert("Invalid Card number!");
		return false;
	}
	
	if((document.getElementById("holderName").value).length==0){
		alert("Please enter the card holder's name'!");
		return false;
	}


	if((document.getElementById("expireDate").value).length==0){
		alert("Please enter the card expire date'!");
		return false;
	}
	
	if((document.getElementById("cvv").value).length==0){
		alert("Please enter the CVV number'!");
		return false;
	}
	
	if((document.getElementById("cvv").value).length<3){
		alert("Invalid the CVV number'!");
		return false;
	}
	
	
	if(isNaN(document.getElementById("CVV").value)){
		alert("Invalid CVV number!");
		return false;
	}
	
	if((document.getElementById("expireDate").value).length<5){
		alert("Invalid expire dater!");
		return false;
	}
	
}


function checkQTY(){
	
	if(parseInt(document.getElementById("quantity").value)<0){
		alert("Invalid input!");
		return false;
	}
	
	
}