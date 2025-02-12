var fs = require('fs');
fs.readFile(__filename,"utf-8", function(error, data) {
 if (error) {
 return console.error(error.message);
 }
 console.log(data);
});

console.log("_____________________")
console.log("")

//create this for current and any other file reads
//03