/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function showAppInfo() {
    document.getElementById("appInfo").innerHTML =
            "<p>Maven Java web-application</p>"
            + "<p>Project Name: CA1</p>"
            + "<p>Group id: eu.websen</p>"
            + "<p>Version: 1.0-SNAPSHOT</p>"
            + "<p>Server: Apache Tomcat 8.0.27.0</p>"
            + "<p>Java EE version: Java EE 7 Web</p>";
}

function showBrowserUrls() {
    document.getElementById("browserUrls").innerHTML =
            "<p><b>http://websen.eu/ca1/api/person/contactinfo</b></p>"
            + "<p>- Get all persons and there contactinfos</p>"
            + "<p><b>http://websen.eu/ca1/api/person/contactinfo/2</b></p>"
            + "<p>- Get a contactinfo of a person</p>"
            + "<p><b>http://websen.eu/ca1/api/zip/all</b></p>"
            + "<p>- Get all zipcodes</p>";
}

function postmanUrls() {
    document.getElementById("postmanUrls").innerHTML =
            "<h3>Check from postman with these URL's</h3>"
            + "<p>There is a full CRUD</p>"
            + "<p><b> http://websen.eu/ca1/api/person/add</b></p>"
            + "<p>- Add a person to the database</p>"
            + "<p><b>http://websen.eu/ca1/api/person/contactinfo</b></p>"
            + "p>- Get all persons and there contactinfos</p>"
            + "<p><b>http://websen.eu/ca1/api/person/contactinfo/{id}</b></p>"
            + "<p>- Get a contactinfo of a person (Id 1 er slettet fra databasen)</p>"
            + "<p><b>http://websen.eu/ca1/api/person/update</b></p>"
            + "<p>- Update person in the database</p>"
            + "<p><b>http://websen.eu/ca1/api/person/delete/{id}</b></p>"
            + "<p>- Delete person from database</p>"
            + "<p>Get all zipcodes</p>"
            + " <p>http://websen.eu/ca1/api/zip/all</p>";
}

function showNetbeansGuide() {
    document.getElementById("netBeansGuide").innerHTML =
            "<h3>Run the project from Netbeans</h3>"
            + "<p>Clean and Build the project</p>"
            + " <p>Run Project</p>"
            + " <p>Run first the file 'Structure.java'</p>"
            + " <p>Then after run the file 'Populate.java'</p>"
            + " <p>Go and refresh the page</p>"
            + " <p>Try with the url's given above</p>";
}