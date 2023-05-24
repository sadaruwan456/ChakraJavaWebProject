function ani01() {
    var slide = document.querySelector("#sld01");
//    var count  = 1;
    slide.style.marginLeft = '-68vw';
    slide.style.transition = '1s';
    setTimeout(ani02,3000);
   
}

function ani02() {
    var slide = document.querySelector("#sld01");
//    var count  = 1;
    slide.style.marginLeft = '-136vw';
    slide.style.transition = '1s';

    setTimeout(ani03,3000);

}

function ani03() {
    var slide = document.querySelector("#sld01");
//    var count  = 1;
    slide.style.marginLeft = '0';
    slide.style.transition = '-10s'; 
    autoAni();

}
function test(){
    alert("hee");
}


//var x = 1000;
function autoAni() {
     setTimeout(ani01,3000);

   
//    for (var i = 0; i < 4; i++) {
////        var y = x*i;
//        if(i===1){
//            setInterval(ani01,3000);
//        }else if(i===2){
//            setInterval(ani02,3000);
//        }else if (i===3) {
//            setInterval(ani03,3000);
//            
//        }else if (i===4) {
//            alert(i);
//        }
//
//
//        
//    }
}

function latesProLoad(){
    var latePro = document.getElementById("latest_pro_dic");
    
    var request = new XMLHttpRequest();
    
    request.onreadystatechange = function (){
        if(request.readyState===4){
            if(request.status===200){
                var response = request.responseText;
                
                latePro.innerHTML = response;
            }
        }
        
    }
    request.open("GET", "LatesPoductLoad",true);
    request.send();
}