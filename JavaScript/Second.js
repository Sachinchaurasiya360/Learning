

//     prepareMaggi();


// function prepareMaggi() {
//     console.log("Step 1: Take a pan and add 2 cups of water in it.");
//     console.log("Step 2: Boil the water for 2 minutes.");
//     console.log("Step 3: Add the Maggi masala in the water.");
//     console.log("Step 4: Add the Maggi noodles in the water.");
//     console.log("Step 5: Boil the Maggi for 2 minutes.");
//     console.log("Step 6: Your Maggi is ready to eat.");
// }



function oddeven(num){
    if(num%2==0){
        console.log("Even");
    }
    else{
        console.log("Odd");
    }
}

oddeven(5);


function prime(num){
    let number=0;
    for(let i=2;i<num;i++){
        if(num%i==0){
            flag=1;
            break;
        }
    }
    if(number==0){
        console.log("Prime");
    }
    else{
        console.log("Not Prime");
    }
}

