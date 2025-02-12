process.argv.forEach(function(value, index, args) {
 console.log('process.argv[' + index + '] = ' + value);
});

//run this file and pass 2 names
//node argv.js sani pani
//01