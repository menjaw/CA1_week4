document.getElementById("btn").addEventListener("click", function () {
    GetPersonsWithHobby();
});

function GetPersonsWithHobby()
{
    fetch("api/person/complete", {method: "get"}).then(function (response) {
        return response.json();
    }).then(function (data) {
        document.getElementById("display").innerHTML = data.lastName;
    });
};


document.getElementById("btn2").addEventListener("click", function () {
    GetPersonsLivingIn();
});

function GetPersonsLivingIn()
{
    fetch("api/person/complete", {method: "get"}).then(function (response) {
        return response.json();
    }).then(function (data) {
        document.getElementById("display2").innerHTML = data.lastName;
    });
};


document.getElementById("btn3").addEventListener("click", function () {
    GetPersonsCountHobby();
});

function GetPersonsCountHobby()
{
    fetch("api/person/complete", {method: "get"}).then(function (response) {
        return response.json();
    }).then(function (data) {
        document.getElementById("display3").innerHTML = data.lastName;
    });
};


document.getElementById("btn4").addEventListener("click", function () {
    GetAllZipCodes();
});

function GetAllZipCodes()
{
    fetch("api/zip/all", {method: "get"}).then(function (response) {
        return response.json();
    }).then(function (data) {
        document.getElementById("display4").innerHTML = data.lastName;
    });
};


function showForm()
{
    document.getElementById("form").innerHTML =
            "<form>" +
            "First name: " + "<input type='input'>" + "<br>" +
            "Last name:  " + "<input type='input'>" +
            "<button> Submit </button>" +
            "</form>";
    
    
};