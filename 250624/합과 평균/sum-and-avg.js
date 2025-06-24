const fs = require("fs");
let input = fs.readFileSync(0).toString().split(" ");
let a = Number(input[0]);
let b = Number(input[1]);
let avg = (a+b)/2;

console.log(a+b, avg.toFixed(1));