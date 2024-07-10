
// for(var i = 0; i < 5; i++) {
//     for(var j = 0; j < i; j++) {
//         console.log("*");
//     }
// }


// console.log(square(5));
// function square(num) {
//     return num * num;
// }

// function oddEven(num) {
//     if (num % 2 == 0) {
//         return 'Even';
//     } else {
//         return 'Odd';
//     }
// }

// console.log(oddEven(5));


// let a="$$$***";

// for(var i=0;i<3;i++){
//     console.log(a);
// }


// for (var i = 5; i > 0; i--) {
//     for (var j = 0; j < i; j++) {
//         process.stdout.write(" * ");
//     }
//     process.stdout.write("\n");
// }


const rows = 5;

// first loop is for printing the rows
for (let i = 0; i < rows; i++) {

    // loop for printing leading whitespaces
    let spaces = '';
    for (let j = 0; j < 2 * (rows - i) - 1; j++) {
        spaces += ' ';
    }

    // loop for printing * character
    let stars = '';
    for (let k = 0; k <= i; k++) {
        stars += '* ';
    }

    console.log(spaces + stars);
}
