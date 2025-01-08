//lab 01 - 08/01/2025
//create a server using node.js

var http = require('http')
http.createServer(function(req,res){
	res.writeHead(200, {'Content-Type': 'text/plain'});
	res.end('Hello World\n');
}).listen(1337,'127.0.0.1');
console.log('Server running at http://127.0.0.1:1337//');

//to run this server type in browser (chrome, edge)
localhost:portnumber - localhost:1337