const fs = require("fs");
let input = fs.readFileSync(0).toString().trim();
let n = "";
for(i=0; i<8; i++){
    n += input;
}
console.log(n);