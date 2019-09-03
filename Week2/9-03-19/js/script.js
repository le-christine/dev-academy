/*let name = "kittens";

if (name == "puppies") {
  name += "!";
} else if (name == "kittens") {
  name += "!!";
} else {
  name = "!" + name;
}

console.log(name=="puppies");
*/

// Ternary operators

/*
let age = 12;
let allowed = (age > 18) ? "yes" : "no";



if (age > 18) {
  console.log("yes");
} else {
  console.log("no");
}
*/

/*
False statements;
console.log(Boolean(false));
console.log(Boolean(0));
console.log(Boolean(""));
console.log(Boolean(NaN));
console.log(Boolean(null));
console.log(Boolean(undefined));
*/

/* AND OR
let studentName = "John";
let grade = 80;
let score = 0;

if (studentName == "John" || grade == 80) {
  score = "A";
} else {
  score = "C";
}


console.log(score);

*/

/* NOT
let isStudent = true;

if (!isStudent) {
  console.log("Not a student");
} else {
  console.log("Welcome");
}
*/

/*
let a = "a";
let b = "b";

if (b > a) {
  console.log("a == b");
} else {
  console.log("a != b");
}
*/

/*
let x = "apple";
let y = x;
x = "hello-world";

console.log(x==y);
*/

/*
let food = "apple";

switch (food) {
  case "pear":
    console.log("I like pears");
    break;
  case "apple":
    console.log("I like apples");
    break;
  default:
    console.log("No favorite");
}

if (food == "apple") {
  console.log("I like apples");
} else if (food == "pear") {
  console.log("I like pears");
} else {
  console.log("No favorite");
}

*/

/*

let studentGrade = 82;

// btwn 90 - 100: A
// btwn 80 - 90: A-
// 70 - 80: B
// below 70: F

if (studentGrade >= 90) {
  console.log("A");
} else if (studentGrade >= 80) {
  console.log("A-");
} else if (studentGrade >= 70) {
  console.log("B");
} else {
  console.log("F");
}

*/

// let studentGrades = [40, 50, 100, 78, 85, 94, 0, 0, 65, 0, 27];
/* FOR LOOPS
// console.log(studentGrades[2]);

//console.log(studentGrades.length);


for (let x = 0; x<studentGrades.length; x++) {
  console.log(studentGrades[x]);
}
*/

/* WHILE LOOPS
let i = 0;
while (i < studentGrades.length) {
  console.log(studentGrades[i]);
  i++;
}

 */

 /*DO WHILE

let i = 0;
 do {
   console.log(studentGrades[i]);
   i++;
 } while(i<studentGrades.length);

*/

/*
let x = 0;
for (; x<10; x++) { // x is already defined outside so we escape the initialization
  console.log(x);
}
*/

/*
for (let i = 0; i<studentGrades.length; i++) {
  if (studentGrades[i] == 65) {
    console.log(i);
  }
}
*/


/*
let i = 0;
while (i<studentGrades.length) {
  if (studentGrades[i] == 65){
  console.log(i + " " + studentGrades[i]);
  }
  i++;
}
*/

/*
let z = 0;
do {
  if (studentGrades[z] == 65) {
    console.log(z + " " + studentGrades[z]);
  } else {
    console.log("Not found");
  }
  z++
} while (z < studentGrades.length);
*/

let names = ["John", "Stacy", "Melvin", "Kevin"];
let x = 0; //initialization

do {
  console.log(names[x]);
  x++; // incrementation
} while (x < names.length); // conditional
