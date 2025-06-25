const fs = require("fs");
let input = fs.readFileSync(0).toString().split(" ");
let a = Number(input[0]);
let b = Number(input[1]);

let r1,r2;

if(a<b) {r1=1;}
else {r1=0;}

if(a==b) {r2=1;}
else {r2=0;}
console.log(r1, r2);