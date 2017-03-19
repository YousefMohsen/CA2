/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var input = document.getElementById("input");

var btn = document.getElementById("btn");

var btnPressed = function(){
   
    findType(input.value);
};

var isInteger = function(n){
    
    return !isNaN(parseFloat(n)) && isFinite(n);
};

var findType = function(str){
    
    if(str.includes("@")){
        alert("this is an email!");
    }else if(str.length===8 && isInteger(str)){
        alert("this is a phone number!");   
    }else if(str.length===4 && isInteger(str)){
        alert("this is a zip code!");   
    }
    
    
};
btn.addEventListener("click",btnPressed);



//////////

          var getPersonID  = function(pId){
                 var url = "http://localhost:8084/CA2/api/person/complete/"+pId;
   var conf = {method: 'get'};
   var promise = fetch(url,conf);
   
   promise.then(function(respone){
       
       return respone.json();
       
   }).then(function(text){

   console.log( text);
 
    generateInfoBoxes(text);
    
   });
       
          
              
              
          }
    var getAll = function(){
           
   var url = "http://localhost:8084/CA2/api/person/complete";
   var conf = {method: 'get'};
   var promise = fetch(url,conf);
   
   promise.then(function(respone){
       
       return respone.json();
       
   }).then(function(text){

   console.log( text);
 
    generateInfoBoxes(text);
    
   });
        
    };
    
function listToTable(alist) {
   var result = alist.map(function (item) {
     var deletehRef = "  <a onclick=\"deletePerson("+item.id+")\">Delete</a>"

                    return "<tr> <td>" + item.id + "</td><td>" + item.fname + "</td><td>" + item.lname + "</td><td>" + item.phone + "</td><td>" +deletehRef+ "</td></tr>";
                });
                var pre = "<table class=\"table table-striped\"><thead><tr><th>ID</th><th>Firstname</th><th>Lastname</th><th>Phone</th></tr></thead><tbody>";
                var post = "</tbody></table>";
                
                var newPersonForm =  "<tr> <td>" +   "" + "</td><td>" +   "<input type=\"text\" name=\"fname\" value=\"\" />"+ "</td><td>" +   "<input type=\"text\" name=\"lname\" value=\"\" />" + "</td><td>" +   "<input type=\"text\" name=\"phone\" value=\"\" />" +  "</td></tr>";
                var formStart =    "<form id=\"aform\" action=\"api/person\" method=\"POST\">";
                var formEnd =            " </form>";
                return formStart+pre + result.join() + newPersonForm + post+formEnd;
            }
           var isArray= function(what) {
    return Object.prototype.toString.call(what) === '[object Array]';
            }
            
            
    var generateInfoBoxes = function(jsonIn){
        var outputDiv = document.getElementById("output");
   console.log("jsonIn"+jsonIn);
   
        if(isArray(jsonIn)){
        var result = jsonIn.map(function (item) {
   console.log("item.firstName"+item.firstName);

   var outp = "<div class=\"infoBox\">\n" +
"        <h3 class=\"centerText\">" +item.firstName + " "+item.lastName+ "</h3>\n" +
"        <p>Firstname: "+item.firstName +"</p>\n" +
"        <p>Lastname: "+item.lastName+"</p>\n" +
"         <p>Lastname: Messi</p>\n" +
"         \n" +
"         <h5>Contact info:</h5>\n" +
"             <p>Email: "+item.email+"</p>\n" +
"         <p>Phone: "+item.phones[0]+"</p>\n" +
"         <p>Address: "+item.address.street +" "+item.address.cityInfo.city+" "+item.address.cityInfo.zipCode+"</p> \n" +
"        \n" +
"    </div>";
                    return outp;
                });  
            
        } else{
         var result = "<div class=\"infoBox\">\n" +
"        <h3 class=\"centerText\">" +jsonIn.firstName + " "+jsonIn.lastName+ "</h3>\n" +
"        <p>Firstname: "+jsonIn.firstName +"</p>\n" +
"        <p>Lastname: "+jsonIn.lastName+"</p>\n" +
"         <p>Lastname: Messi</p>\n" +
"         \n" +
"         <h5>Contact info:</h5>\n" +
"             <p>Email: "+jsonIn.email+"</p>\n" +
"         <p>Phone: "+jsonIn.phones[0]+"</p>\n" +
"         <p>Address: "+jsonIn.address.street +" "+jsonIn.address.cityInfo.city+" "+jsonIn.address.cityInfo.zipCode+"</p> \n" +
"        \n" +
"    </div>";   
            
            
        }
            
            
            
            
    // console.log(result);
   
   
    outputDiv.innerHTML =result;
  };
   
getPersonID(2);
     