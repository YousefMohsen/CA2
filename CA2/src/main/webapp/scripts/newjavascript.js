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