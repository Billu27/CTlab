//lab 01 - ex2
//pasted from pg 43 textbook
//Input/ output

var http = require('http'); //creates hht variable and import the http module
var fs = require('fs'); //import file system module into the fs variable

//if the request is for favicon then end it there
http.createServer(function (req, res) {
 if (req.url === '/favicon.ico') {
	 return res.end(); //end that request
 }
 console.log('Incoming request to ' + req.url);
 var i = 2;
 res.writeHead(200, {'Content-Type': 'text/plain'});

//callback function - called after 5s
 setTimeout(function() {
 	fs.readFile(__filename, {
 	encoding: 'utf8'
 }, function (error, contents) {
 	if (error) {
 		console.error(error);
 		return res.end();
 }
 	console.log('sending response for ' + req.url);
 	res.end(contents);
 });
 }, 5000);


 while(i--) {
 console.log('Loop value: ' + i + '\r');
 }
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');


//for running 
//1. type - localhost:1337/one and two in browser in 2 different tabs
//2. enter both 
//browser will take incoming request from others but give response to "one" only after 5 secs brcause of callback