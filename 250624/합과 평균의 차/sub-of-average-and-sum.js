const fs = require("fs");
let input = fs.readFileSync(0).toString().split(" ");
let a = Number(input[0]);
let b = Number(input[1]);
let c = Number(input[2]);

avg = (a+b+c)/3;
console.log(a+b+c);
console.log(avg);
console.log((a+b+c)-avg);