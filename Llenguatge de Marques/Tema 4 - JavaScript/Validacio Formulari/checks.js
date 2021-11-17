function checkDNI() {
    var patt_dni = /^\d{8}[A-Z]$/;
    var dni = document.getElementById("dni").value;

    if (patt_dni.test(dni)) {
        document.getElementById("dni").style.color = "black";
        document.getElementById("dnii").innerHTML = "";
        document.getElementById("dni").style.background = "white";
        document.getElementById("display").style.display = "none";
    } else {
        document.getElementById("dnii").innerHTML = "- El dni introduït no compleix els requisits";
        document.getElementById("dni").style.background = "red";
        document.getElementById("dni").style.color = "white";
        document.getElementById("display").style.display = "block";
    }
}

function checkMail() {
    var format = /\S+@\S+\.\S+/;
    var email = document.getElementById("correu").value;

    if (format.test(email)) {
        document.getElementById("correu").style.color = "black";
        document.getElementById("emaiil").innerHTML = "";
        document.getElementById("correu").style.background = "white";
        document.getElementById("display").style.display = "none";
    } else {
        document.getElementById("emaiil").innerHTML = "- El email introduït no compleix els requisits";
        document.getElementById("correu").style.background = "red";
        document.getElementById("correu").style.color = "white";
        document.getElementById("display").style.display = "block";
    }
}

function checkName() {
    var name = document.getElementById("firstname").value;
    var long = name.length;

    if (long != 0 && long <= 10) {
        document.getElementById("firstname").style.color = "black";
        document.getElementById("namee").innerHTML = "";
        document.getElementById("firstname").style.background = "white";
        document.getElementById("display").style.display = "none";
    } else {
        document.getElementById("namee").innerHTML = "- El nom introduït no compleix els requisits";
        document.getElementById("firstname").style.background = "red";
        document.getElementById("firstname").style.color = "white";
        document.getElementById("display").style.display = "block";
    }
}

function checkSurname() {
    var surname = document.getElementById("llinatge").value;
    var long = surname.length;

    if (long != 0 && long <= 20) {
        document.getElementById("llinatge").style.color = "black";
        document.getElementById("surnamee").innerHTML = "";
        document.getElementById("llinatge").style.background = "white";
        document.getElementById("display").style.display = "none";
    } else {
        document.getElementById("surnamee").innerHTML = "- El llinatge1 introduït no compleix els requisits";
        document.getElementById("llinatge").style.background = "red";
        document.getElementById("llinatge").style.color = "white";
        document.getElementById("display").style.display = "block";
    }
}

function checkSecondSurname() {
    var secondSurname = document.getElementById("llinatge2").value;
    var long = secondSurname.length;

    if (long != 0 && long <= 20) {
        document.getElementById("llinatge2").style.color = "black";
        document.getElementById("secsurnamee").innerHTML = "";
        document.getElementById("llinatge2").style.background = "white";
        document.getElementById("display").style.display = "none";
    } else {
        document.getElementById("secsurnamee").innerHTML = "- El llinatge2 introduït no compleix els requisits";
        document.getElementById("llinatge2").style.background = "red";
        document.getElementById("llinatge2").style.color = "white";
        document.getElementById("display").style.display = "block";
    }
}

function allChecksInOne() {
    checkDNI();
    checkMail();
    checkName();
    checkSurname();
    checkSecondSurname();
}
