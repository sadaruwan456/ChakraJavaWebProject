function dbAdd() {
    var name = document.getElementById("name").value;
    var password = document.getElementById("password").value;

    alert(name);
    alert(password);

    var request = new XMLHttpRequest();

    request.open("GET", "DbTest?" + "un=" + name + "&pw=" + password, true);
    request.send();
}