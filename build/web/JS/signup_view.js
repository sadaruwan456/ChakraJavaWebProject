//function nextSign() {
//    var slide01 = document.querySelector("#sign_div01");
//    var fname = document.getElementById("fname").value;
//    var lname = document.getElementById("lname").value;
//    var dob = document.getElementById("dob_txt").value;
//    alert("ssss");
////    if (fname === "" || lname === "" || dob === "") {
////        if (fname === ""){
////            var fnametxt = document.querySelector("#fnamediv");
////        fnametxt.style.border = 'red solid 1px';
////        }
////        if(lname === ""){
////            var lnamediv = document.querySelector("#lnamediv");
////            lnamediv.style.border = 'red solid 1px';
////        }
////        if(dob === ""){
////            var dobdiv = document.querySelector("#dobdiv");
////            dobdiv.style.border = 'red solid 1px';
////        }
////        
////    } else {
////
////    }
//    slide01.style.marginLeft = '-85vw';
//    slide01.style.transition = '0.5s';
//    return false;
//
//}

function txtTypedfname() {
    var fnametxt = document.querySelector("#fnamediv");
    fnametxt.style.border = 'none';
}

function txtTypedlname() {
    var lnamediv = document.querySelector("#lnamediv");
    lnamediv.style.border = 'none';
}
function dobChange() {
    var dobdiv = document.querySelector("#dobdiv");
    dobdiv.style.border = 'none';
}

function txtTypeEmail() {
    var dobdiv = document.querySelector("#emaildiv");
    dobdiv.style.border = 'none';
}
function passwordType() {
    var dobdiv = document.querySelector("#passworddiv");
    dobdiv.style.border = 'none';
}
function passwordcomType() {
    var dobdiv = document.querySelector("#passworcomddiv");
    dobdiv.style.border = 'none';
}



function colorget() {
    var c = document.getElementById("color").value;

    alert(c);
}


function testData() {

    var slide01 = document.querySelector("#sign_div01");
    var spanError = document.querySelector("#error_span");
    var email = document.getElementById("email_txt").value;
    var pw1 = document.getElementById("password_txt").value;
    var pw2 = document.getElementById("passwordcom_txt").value;







    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;



                if (email === "" || pw1 === "" || pw2 === "") {
                    //feilds are empty
                    if (email === "") {
                        var emailtxt = document.querySelector("#emaildiv");
                        emailtxt.style.border = 'red solid 1px';

                    }
                    if (pw1 === "") {
                        var emailtxt = document.querySelector("#passworddiv");
                        emailtxt.style.border = 'red solid 1px';
                    }
                    if (pw2 === "") {

                        var emailtxt = document.querySelector("#passworcomddiv");
                        emailtxt.style.border = 'red solid 1px';
                    }
                } else {
                    //fields are not empty
                    var array = JSON.parse(response);
                    var emailres = array[0];
                    var pwres = array[1];
                    var already = array[2];

                    if (emailres === "valid") {
                        if(already=="valid"){
                            spanError.style.display = 'none'; 
                        if (pwres === "valid") {
                            if (pw1 === pw2) {
                                popShow(1);


                            } else {
                                var emailtxt = document.querySelector("#passworcomddiv");
                                emailtxt.style.border = 'red solid 1px';

                            }

                        } else {
                            var emailtxt = document.querySelector("#passworddiv");
                            emailtxt.style.border = 'red solid 1px';
                        }
                        }else{
                            
                            spanError.style.display = 'block'; 
                        }

                    } else {
                        var emailtxt = document.querySelector("#emaildiv");
                        emailtxt.style.border = 'red solid 1px';
                    }
                }




            }
        }
    };
    request.open("POST", "Sign_up_validation01", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("email=" + email + "&pw=" + pw1);


}


function testSect() {
    var fname = document.getElementById("fname_txt").value;
    var lname = document.getElementById("lname_txt").value;
    var dob = document.getElementById("dob_txt").value;
    var pic = document.getElementById("pro_pic").value;
    alert("ddd");
    var request = new XMLHttpRequest();
    if (fname === "" || lname === "" || dob === "" || pic === "") {
        //fields are empty
        if (fname === "") {
            var fnametxt = document.querySelector("#fnamediv");
            fnametxt.style.border = 'red solid 1px';
            return false;
        }
        if (lname === "") {
            var lnamediv = document.querySelector("#lnamediv");
            lnamediv.style.border = 'red solid 1px';
            return false;
        }
        if (dob === "") {
            var dobdiv = document.querySelector("#dobdiv");
            dobdiv.style.border = 'red solid 1px';
            return false;
        }
        if (pic === "") {
            return false;
        }

    } else {

        request.onreadystatechange = function () {
            if (request.readyState === 4) {
                if (request.status === 200) {
                    var response = request.responseText;
                    var array = JSON.parse(response);
                    var fnameres = array[0];
                    var lnameres = array[1];


                    if (fnameres === "valid") {
                        if (lnameres === "valid") {

                            return true;

                        } else {

                            return false;
                            var lnamediv = document.querySelector("#lnamediv");
                            lnamediv.style.border = 'red solid 1px';
                        }
                    } else {
                        return false;
                        var fnametxt = document.querySelector("#fnamediv");
                        fnametxt.style.border = 'red solid 1px';
                    }





                }
            }
        };



    }




    request.open("POST", "Sign_up_validation02", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("fname=" + fname + "&lname=" + lname);

}

//function signField() {
//    var email = document.getElementById("email_txt").value;
//    var pw1 = document.getElementById("password_txt").value;
//    var pw2 = document.getElementById("passwordcom_txt").value;
//
//    var request = new XMLHttpRequest();
//    request.onreadystatechange = function () {
//        if (request.readyState === 4) {
//            if (request === 200) {
//                var response = request.responseText;
//
//            }
//        }
//    };
//
//    request.open("POST", "", true);
//    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
//    request.send("email=" + email + "&pw=" + pw1);
//
//
//}

function normal() {
    alert();
}


function popClose() {
    var modal = document.querySelector("#myModal");

    modal.style.display = 'none';
}




function popShow(x) {
    var email = document.getElementById("email_txt").value;
    var request = new XMLHttpRequest();


    if (x === 1) {

        var modal = document.querySelector("#myModal");
        modal.style.display = 'block';
    }

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
            }
        }
    };


    request.open("POST", "SendOtp", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("email=" + email);


}


function nextact() {
    var slide01 = document.querySelector("#sign_div01");
    var otp = document.getElementById("otp_txt").value;
    var valsp = document.querySelector("#valide_lb");
    
    var request = new XMLHttpRequest();
    
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                if (response === "valid") {
                    slide01.style.marginLeft = '-85vw';
                    slide01.style.transition = '0.5s';
                    popClose();

                } else {
                    
                   valsp.style.display = 'block'; 
                }
            }
        }
    };


    request.open("POST", "OtpCheck", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("otp=" + otp);
}