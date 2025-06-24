const fs = require("fs");
let input = fs.readFileSync(0).toString().split();
let n = Number(input[0]);
console.log(n);
if(n<0){
    console.log("minus");
}