const fs = require("fs");
let input = fs.readFileSync(0).toString();
let n = Number(input);
let mon;
if(n>=3000){
    mon = 'book';
}
else if(n>=1000){
    mon = 'mask';
}
else{
    mon = 'no';
}
console.log(mon);