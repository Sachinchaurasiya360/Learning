const { reject } = require('async');
const fs=require('fs');
const { resolve } = require('path');

fs.readFile('data.txt','utf8',function(err,data){
    if(err){
        console.log(err)}
    else
        console.log(data)
})

console.log("hello world")





let a=0;

function greet(){
    console.log("Namaste")
}


function count(){
    for(let i=0;i<1000;i++){
        a++
    }
}


setTimeout(greet, 3000) 
count()

console.log(a)



let promise= new Promise (function(resolve,reject){
    console.log("Promise started")
})