function caregoryLoat() {
    var material = document.getElementById("materialselect");
    var occation = document.getElementById("occasionselect");
    var print = document.getElementById("printselect");
    var sleeve = document.getElementById("sleeveselect");
    var neck = document.getElementById("neckselect");
    var sizes = document.getElementById("sizeselect");
    var dicount = document.getElementById("discountselect");
    var offer = document.getElementById("offercelect");


    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                var arr = JSON.parse(response);

                var materialList = arr[0];
                var occationList = arr[1];
                var printList = arr[2];
                var sleeveList = arr[3];
                var neckList = arr[4];
                var sizesList = arr[5];
                var discountList = arr[6];
                var offerList = arr[7];



                for (var i in materialList) {

                    var x = document.createElement("option");
                    x.innerHTML = materialList[i].name;
                    document.getElementById("materialselect").appendChild(x);
                }
                for (var i in occationList) {
                    var x1 = document.createElement("option");
                    x1.innerHTML = occationList[i].name;
                    occation.appendChild(x1);
                }
                for (var i in printList) {
                    var x2 = document.createElement("option");
                    x2.innerHTML = printList[i].name;
                    print.appendChild(x2);
                }
                for (var i in sleeveList) {
                    var x4 = document.createElement("option");
                    x4.innerHTML = sleeveList[i].name;
                    sleeve.appendChild(x4);
                }
                for (var i in neckList) {
                    var x3 = document.createElement("option");
                    x3.innerHTML = neckList[i].name;
                    neck.appendChild(x3);
                }

                for (var i in discountList) {

                    var dd = document.createElement("option");
                    dd.innerHTML = discountList[i].name;
                    dicount.appendChild(dd);
                }
                for (var i in offerList) {
                    var oo = document.createElement("option");
                    oo.innerHTML = offerList[i].name;
                    offer.appendChild(oo);
                }
            }
        }
    };

    request.open("GET", "CategoryLoad", true);
    request.send();
}

function materialAdd(x) {
    var material = document.getElementById("material_txt").value;
    var selectmaterial = document.getElementById("materialselect");
    var qtxt = document.querySelector("#material_txt");
    var request = new XMLHttpRequest();

    if (x === 1) {

        if (material === "") {
            alert("null");
            qtxt.style.border = 'red solid 1px';
        } else {
            alert(material);
            request.onreadystatechange = function () {
                if (request.readyState === 4) {
                    if (request.status === 200) {
                        var response = request.responseText;
//                    
                        var o = document.createElement("option");
                        o.innerHTML = response;
                        selectmaterial.appendChild(o);

                    }
                }
            };
            request.open("GET", "CategoryAdd?" + "material=" + material, true);
            request.send();
        }
    }

    if (x === 2) {
        qtxt.style.border = 'black solid 1px';

    }
}
function occationAdd(x) {
    var txt = document.getElementById("occasion_txt").value;
    var select = document.getElementById("occasionselect");
    var qtxt = document.querySelector("#occasion_txt");
    var request = new XMLHttpRequest();

    if (x === 1) {

        if (txt === "") {
            alert("null");
            qtxt.style.border = 'red solid 1px';
        } else {

            request.onreadystatechange = function () {
                if (request.readyState === 4) {
                    if (request.status === 200) {
                        var response = request.responseText;
//                    
                        var o = document.createElement("option");
                        o.innerHTML = response;
                        select.appendChild(o);

                    }
                }
            };
            request.open("GET", "CategoryAdd?" + "occation=" + txt, true);
            request.send();
        }
    }

    if (x === 2) {
        qtxt.style.border = 'black solid 1px';

    }
}
function printAdd(x) {
    var txt = document.getElementById("printtype_txt").value;
    var select = document.getElementById("printselect");
    var qtxt = document.querySelector("#printtype_txt");
    var request = new XMLHttpRequest();

    if (x === 1) {

        if (txt === "") {
            alert("null");
            qtxt.style.border = 'red solid 1px';
        } else {

            request.onreadystatechange = function () {
                if (request.readyState === 4) {
                    if (request.status === 200) {
                        var response = request.responseText;
//                    
                        var o = document.createElement("option");
                        o.innerHTML = response;
                        select.appendChild(o);

                    }
                }
            };
            request.open("GET", "CategoryAdd?" + "print=" + txt, true);
            request.send();
        }
    }

    if (x === 2) {
        qtxt.style.border = 'black solid 1px';

    }
}
function sleeveAdd(x) {
    var txt = document.getElementById("sleevetype_txt").value;
    var select = document.getElementById("sleeveselect");
    var qtxt = document.querySelector("#sleevetype_txt");
    var request = new XMLHttpRequest();

    if (x === 1) {

        if (txt === "") {
            alert("null");
            qtxt.style.border = 'red solid 1px';
        } else {

            request.onreadystatechange = function () {
                if (request.readyState === 4) {
                    if (request.status === 200) {
                        var response = request.responseText;
//                    
                        var o = document.createElement("option");
                        o.innerHTML = response;
                        select.appendChild(o);

                    }
                }
            };
            request.open("GET", "CategoryAdd?" + "sleeve=" + txt, true);
            request.send();
        }
    }

    if (x === 2) {
        qtxt.style.border = 'black solid 1px';

    }
}
function neckAdd(x) {
    var txt = document.getElementById("necktype_txt").value;
    var select = document.getElementById("neckselect");
    var qtxt = document.querySelector("#necktype_txt");
    var request = new XMLHttpRequest();

    if (x === 1) {

        if (txt === "") {
            alert("null");
            qtxt.style.border = 'red solid 1px';
        } else {

            request.onreadystatechange = function () {
                if (request.readyState === 4) {
                    if (request.status === 200) {
                        var response = request.responseText;
//                    
                        var o = document.createElement("option");
                        o.innerHTML = response;
                        select.appendChild(o);

                    }
                }
            };
            request.open("GET", "CategoryAdd?" + "neck=" + txt, true);
            request.send();
        }
    }

    if (x === 2) {
        qtxt.style.border = 'black solid 1px';

    }
}



function discountAdd() {
    var distxt = document.getElementById("dis_txt").value;
    var select = document.getElementById("discountselect");
    alert(distxt);
    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                alert(response);
                var o = document.createElement("option");
                o.innerHTML = response + "%";
                select.appendChild(o);

            }
        }
    };

    request.open("GET", "CategoryAdd?" + "discount=" + distxt, true);
    request.send();
}

function offerAdd() {
    var buy = document.getElementById("buy_txt").value;
    var get = document.getElementById("get_txt").value;
    var select = document.getElementById("offercelect");

    var request = new XMLHttpRequest();
    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;
                alert(response);
                var o = document.createElement("option");
                o.innerHTML = response;
                select.appendChild(o);

            }
        }
    };

    request.open("GET", "CategoryAdd?" + "buy_count=" + buy + "&get_count=" + get, true);
    request.send();
}



function sizeAdd(x) {
    var txt = document.getElementById("size_txt").value;
    var select = document.getElementById("sizeselect");
    var qtxt = document.querySelector("#size_txt");
    var request = new XMLHttpRequest();

    if (x === 1) {

        if (txt === "") {
            alert("null");
            qtxt.style.border = 'red solid 1px';
        } else {

            request.onreadystatechange = function () {
                if (request.readyState === 4) {
                    if (request.status === 200) {
                        var response = request.responseText;
//                    
                        var o = document.createElement("option");
                        o.innerHTML = response;
                        select.appendChild(o);

                    }
                }
            };
            request.open("GET", "CategoryAdd?" + "size=" + txt, true);
            request.send();
        }
    }

    if (x === 2) {
        qtxt.style.border = 'black solid 1px';

    }
}


function setTextSize() {
    var xs = document.getElementById("xs").checked;
    var s = document.getElementById("s").checked;
    var m = document.getElementById("m").checked;
    var l = document.getElementById("l").checked;
    var xl = document.getElementById("xl").checked;
    var xxl = document.getElementById("xxl").checked;

    var sisez = [];
//    var Sizes = sisez.toString();
    if (xs) {
        sisez.push("XS");
    }
    if (s) {
        sisez.push("S");
    }
    if (m) {
        sisez.push("M");
    }
    if (l) {
        sisez.push("L");
    }
    if (xl) {
        sisez.push("XL");
    }
    if (xxl) {
        sisez.push("XXL");
    }

    return sisez;
}


function getProducts() {
    var pid = document.getElementById("p_id").value;
    var pname = document.getElementById("p_name").value;


//    alert(pid);
//    alert(pname);
//    alert(pimage);

    var material = document.getElementById("materialselect");
    var materialtxt = material.options[material.selectedIndex].text;

    var occation = document.getElementById("occasionselect");
    var occaionttxt = occation.options[occation.selectedIndex].text;

    var print = document.getElementById("printselect");
    var printtxt = print.options[print.selectedIndex].text;

    var sleeve = document.getElementById("sleeveselect");
    var sleevetxt = sleeve.options[sleeve.selectedIndex].text;

    var neck = document.getElementById("neckselect");
    var necktxt = neck.options[neck.selectedIndex].text;

//    alert(materialtxt);
//    alert(occaionttxt);
//    alert(printtxt);
//    alert(sleevetxt);
//    alert(necktxt);

    var sisez = setTextSize();

    alert(sisez);
    var radio1 = document.getElementById("assra").checked;
    var radio2 = document.getElementById("rejra").checked;
    var return_type;//meka ganna
    if (radio1) {
        return_type = document.getElementById("assra").value;
    } else if (radio2) {
        return_type = document.getElementById("rejra").value;
    }
    alert(return_type);

    var cost = document.getElementById("cost_txt").value;
    var price = document.getElementById("price_txt").value;
    var qty = document.getElementById("qty_txt").value;

    var discount = document.getElementById("discountselect");
    var discounttxt = discount.options[discount.selectedIndex].text;

    var offer = document.getElementById("offercelect");
    var offertxt = offer.options[offer.selectedIndex].text;

//    alert(cost);
//    alert(price);
//    alert(qty);
//    alert(discounttxt);
//    alert(offertxt);


    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {
                var response = request.responseText;


                proImageUpload();

            }
        }
    };

    request.open("POST", "ProductsAdd", true);
    request.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    request.send("&pname=" + pname + "&material=" + materialtxt + "&occation=" + occaionttxt + "&print=" + printtxt + "&sleeve=" + sleevetxt + "&neck=" + necktxt + "&sizes=" + sisez + "&return=" + return_type + "&cost=" + cost + "&price=" + price + "&qty=" + qty + "&discount=" + discounttxt + "&offer=" + offertxt);

}

function proImageUpload() {
    var pimage = document.getElementById("file_input").files[0];

    var formData = new FormData();
    formData.append("file", pimage);

    var request = new XMLHttpRequest();

    request.onreadystatechange = function () {
        if (request.readyState === 4) {
            if (request.status === 200) {

                var response = request.responseText;
                alert(response);
                clearFields();

            }

        }

    };

    request.open("POST", "productUpload", true);
//request.setRequestHeader("Content-Type","");//mekedi request heder eka dala entype eka denna oni naa, formdata object ekak pass karanakota multipart widiyataa dagannawa
    request.send(formData);
}

function clearFields() {
    var pid = document.getElementById("p_id").value = '';
    var pname = document.getElementById("p_name").value = '';
    var material = document.getElementById("materialselect").selectedIndex = "0";
    var occation = document.getElementById("occasionselect").selectedIndex = "0";
    var print = document.getElementById("printselect").selectedIndex = "0";
    var sleeve = document.getElementById("sleeveselect").selectedIndex = "0";
    var neck = document.getElementById("neckselect").selectedIndex = "0";
    var radio1 = document.getElementById("assra").checked = false;
    var radio2 = document.getElementById("rejra").checked = false;

    var xs = document.getElementById("xs").checked = false;
    var s = document.getElementById("s").checked = false;
    var m = document.getElementById("m").checked = false;
    var l = document.getElementById("l").checked = false;
    var xl = document.getElementById("xl").checked = false;
    var xxl = document.getElementById("xxl").checked = false;

    var cost = document.getElementById("cost_txt").value = " ";
    var price = document.getElementById("price_txt").value = " ";
    var qty = document.getElementById("qty_txt").value = " ";

    var discount = document.getElementById("discountselect").selectedIndex = "0";
    var offer = document.getElementById("offercelect").selectedIndex = "0";


}