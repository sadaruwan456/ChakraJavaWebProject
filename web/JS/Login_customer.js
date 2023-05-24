function loginCustomer() {
    var un = document.getElementById("cus_username").value;
    var pw = document.getElementById("cus_password").value;

    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;

                if (response == "false") {
                    showpop();

                }
                if(response=="true"){
                    showpop2();
                }
            }
        }
    };
    request.open("POST", "loginCheck", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("un=" + un + "&pw=" + pw);
}

function popClose01() {
    var modal = document.querySelector("#myModal");

    modal.style.display = 'none';
}

function popClose02() {
    var modal = document.querySelector("#myModalDone");

    modal.style.display = 'none';

}


function showpop() {
    var modal = document.querySelector("#myModal");

    modal.style.display = 'block';
}
function showpop2() {
    var modal = document.querySelector("#myModalDone");

    modal.style.display = 'block';
}
