const fs = require("fs");
let input = fs.readFileSync(0).toString().split(" ");
let a = Number(input[0]);
let n = Number(input[1]);

let k;

for(i=0; i<n; i++){
    a+=n;
    console.log(a);
}
