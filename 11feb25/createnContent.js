//05
//create file named "textFile.txt" and write some content
// save in current directory and on desktop

var fs = require('fs');
var data = 'some file data';
fs.writeFile(__dirname + '/testFile1.txt', data, function(error) {
 if (error) {
 return console.error(error.message);
 }
});


var data = 'some file data on dektop';
fs.writeFile('C:/Users/student/Desktop/' + '/testFile3.txt', data, function(error) {
 if (error) {
 return console.error(error.message);
 }
});