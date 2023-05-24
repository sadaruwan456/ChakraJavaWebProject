function loadProfile() {



    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                document.getElementById("load_pro").innerHTML = response;
//                alert(response);
            }
        }
    };

    request.open("GET", "login_load.jsp", true);
    request.send();

}

function logOut() {
    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                document.getElementById("load_pro").innerHTML = response;
            }
        }
    };

    request.open("GET", "logOut", true);
    request.send();

}


function loginCheck() {

    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                if (response === "false") {
                    window.location = "Login.jsp";
//                    alert(response);
                }
                if(response==="true"){
                    window.location = "MyAccount.jsp";
                }
            }
        }
    };

    request.open("GET", "accLoginCheck", true);
    request.send();

}

function sentLogin(){
     var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                
            }
        }
    };

    request.open("GET", "Login.jsp", true);
    request.send();
}