/**
 * 
 */
function validateForm() {
            var image = document.getElementById("image");
            var company = document.getElementById("company");
          
            var nationality = document.getElementById("nationality");
          
			let status = true;
            if (image.value === "") {
                document.getElementById("imgError").innerHTML = "Please update img";
                status = false;
            }else{
				document.getElementById("updatedImg").innerHTML = image;
			}

            if (company.value === "") {
                document.getElementById("companyError").innerHTML = "Please enter your company/college name";;
                status = false;
            }


            if (nationality.value === "") {
                document.getElementById("nationalityError").innerHTML = "Please update nationality";
                status = false;
            }

            if (document.querySelector('input[name="gender"]:checked') === null) {
               	document.getElementById("genderError").innerHTML = "Please update gender";
                status = false;
            }

            return status;
}

function displayImage() {
            var input = document.getElementById('image');
            var img = document.getElementById('updatedImg');

            var file = input.files[0];
            var reader = new FileReader();
            if(input  == ""){
				img.src = "./css/img/User-profile.png";
			}else{
				reader.onload = function(e) {
                img.src = e.target.result;
           		 }
			}

            
            reader.readAsDataURL(file);
}