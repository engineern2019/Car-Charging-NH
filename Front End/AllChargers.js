
var url = "http://localhost:8080/h2/login.do?jsessionid=b3e6a4f823c8fbd231d6250fe72bd2df";
var xhr = new XMLHttpRequest();

xhr.open('GET',url);
xhr.responseType = 'text';

xhr.onload = function() {
    if (xhr.status ===200) {
        var chargerInfo = JSON.parse(xhr.responseText);
        console.log(chargerInfo);
    }
    
}

xhr.send();