/**
 * 
 */

 function uform() {
    let user = document.getElementById("exampleInputFname").value;
    let email = document.getElementById("exampleInputEmail1").value;
    let pass = document.getElementById("exampleInputPassword1").value;
    let rpass = document.getElementById("exampleInputRepassword1").value;
    let num = document.getElementById("exampleInputNumber").value;
    let status = true;
    
    function isValidPhoneNumber(num) {
        return /^\d{10}$/.test(num);
    }

   if (user.match(/^[0-9]+$/)) {
        document.getElementById("usn").innerHTML = "Please enter valid name, don't use numbers";
       status = false;
    } else {
        document.getElementById("usn").innerHTML = ""; // Clear error message
    }

    if (!(email.includes("@") && email.includes("."))) {
        document.getElementById("eml").innerHTML = "Please enter a valid email";
        status = false;
    } else {
        document.getElementById("eml").innerHTML = ""; // Clear error message
    }
    if (isValidPhoneNumber(num)) {
    	document.getElementById("nos").innerHTML = "valid number";
    } else {
    	document.getElementById("noe").innerHTML = "Please enter valid number";
    	status = false;
    }
    

    if (pass !== rpass) {
        document.getElementById("psw").innerHTML = "Passwords do not match";
        status = false;
    } else if (!(pass.length >= 6 && /[a-z]/.test(pass) && /[A-Z]/.test(pass) && /\d/.test(pass) && /[^a-zA-Z\d]/.test(pass))) {
        document.getElementById("psw").innerHTML = "Password must be strong (use A-Z, a-z, 0-9, special character, and be at least 6 characters long)";
      	status = false;
    } else {
        document.getElementById("psw").innerHTML = ""; // Clear error message
    }
	console.log("Hi")
    return status;
}