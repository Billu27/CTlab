var fs = require('fs');
var data;
try {
 data = fs.readFileSync("argv.js","utf-8",);
 console.log(data);
} catch (error) {
 console.error(error.message);
}

//03