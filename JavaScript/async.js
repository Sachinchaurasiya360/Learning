const fs = require('fs');

fs.readFile("C:\\Codes\\Notes\\Week 1.md", "utf-8", function(err, data) {
    if (err) {
        console.error("An error occurred:", err);
        return;
    }
    console.log(data);


});
console.log("File read successfully");
