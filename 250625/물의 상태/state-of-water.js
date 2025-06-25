const fs = require("fs");
let input = fs.readFileSync(0).toString();
let n = Number(input);
let temp;
if(n<0){
    temp = 'ice';
}
else if(n>=100){
    temp = 'vapor';
}
else if(0<n<100){
    temp = 'water';
}
console.log(temp);