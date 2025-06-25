const fs = require("fs");
let input = fs.readFileSync(0).toString();
let grade;
let n = Number(input);

if(n>=90){
    grade='A';
}
else if(n>=80){
    grade='B';
}
else if(n>=70){
    grade='C';
}
else if(n>=60){
    grade='D';
}
else if(n<60){
    grade='F';
}
console.log(grade);