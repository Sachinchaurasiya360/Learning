// let sum=0;
// for(let i=0;i<100;i++){
//     sum=sum+i;
// }
// console.log(sum);




//set timeout function
function greet(){
    console.log("Hello world");
}
setTimeout(greet,7000);


let arr=[1,2,3,4,5];

for(let i=0;i<arr.length;i++){
    if(arr[i]%2==0){
        console.log(arr[i]);
    }

}


let biggestNum=[1,2,3,4,5,6,7,8,9,10];

for(let i=0;i<biggestNum.length;i++){
    if(biggestNum[i]<biggestNum[i-1]){
        console.log(biggestNum[i]);
    }
}


function sum(a,b){
    return a+b;
}
console.log(sum(5,6));



