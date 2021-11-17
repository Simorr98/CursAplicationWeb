function fotos(sw) {
    var foto;
    if (sw == 0) {
        pic = "Plantilles/AmateurA.jpg"
    } else if (sw == 1) {
        pic = "Plantilles/AmateurB.jpg"
    } else if (sw == 2) {
        pic = "Plantilles/JuvenilA.jpg"
    } else if (sw == 3) {
        pic = "Plantilles/Juvenil.jpg"
    } else if (sw == 4) {
        pic = "Plantilles/Cadete.jpg"
    } else if (sw == 5) {
        pic = "Plantilles/Infantil.jpg"
    } else if (sw == 6) {
        pic = "Plantilles/Alevin.jpg"
    } else if (sw == 7) {
        pic = "Plantilles/Benjamin.jpg"
    }
    document.getElementById('imatge').src = pic;
}

function classificacio(sw) {
    var classi;
    if (sw == 0) {
        classi = "https://www.ffib.es/Fed/NPcd/NFG_VisClasificacion?cod_primaria=1000110&codjornada=16&codcompeticion=3843798&codgrupo=3895311&codjornada=16"
    } else if (sw == 1) {
        classi = "Plantilles/AmateurB.jpg"
    } else if (sw == 2) {
        classi = "Plantilles/JuvenilA.jpg"
    } else if (sw == 3) {
        classi = "Plantilles/Juvenil.jpg"
    } else if (sw == 4) {
        classi = "Plantilles/Cadete.jpg"
    } else if (sw == 5) {
        classi = "Plantilles/Infantil.jpg"
    } else if (sw == 6) {
        classi = "Plantilles/Alevin.jpg"
    } else if (sw == 7) {
        classi = "Plantilles/Benjamin.jpg"
    }
    document.getElementById('classificacio').src = classi;
}
