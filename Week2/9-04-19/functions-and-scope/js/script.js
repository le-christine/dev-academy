/*
console.log("Item1");
console.log("Item2");
console.log("Item3");
*/

// If I wanted to print items again, instead of copy + pasting console log
// I can make a function:

/*
function printItems() {
  console.log("Item1");
  console.log("Item2");
  console.log("Item3");
  menu();
}

function menu() {
  console.log("===Menu===");
}

// To call a function
printItems();
*/

/*
function welcomeUser(username, password, ip_address) {
  if (username === "Christine" && password === "yellow") {
    console.log("Welcome " + username)
  } else {
    console.log("Incorrect username and password");
  }
  console.log(ip_address);
}

welcomeUser("Christine", "yellow", "192.162.1.1");
*/

/*
function welcomeUser(...args) { //tells function to accept all arugments
  console.log(args);
  console.log(typeof(args));
}

welcomeUser("Christine", "yellow", "192.162.1.1", "window-size");
*/

/*
function welcomeUser(...cat) { // SPREAD OPERATOR tells function to accept all arugments
  console.log(cat);
  console.log(typeof(cat));
}

welcomeUser("Christine", "yellow", "192.162.1.1", "window-size");
*/

/* More syntax to decalre functions
const speak = function () {
  console.log("Hi");
}

speak();

*/

/* arrow functions
const speak = (words) => {
  console.log(words);
};

speak("Hi there");


const varName = function () {
  code here;
};

const varName = () => {
  code here;
};
*/


/* Functions can return

const add = (num1, num2) => {
  return num1 + num2;
};

let total = add(1,5);
console.log(total);
*/

/*
let name = "John"; // global variable

function printName() {
  let b = "Local variable";
}

console.log(name);

// Two local variables, x and y
if (name === "John") {
  let x = 10;
} else {
  let y = 20;
}
*/

/*
let getName = (first, last) => {
  setName(first, last);
};

function setName(a,b) {
  console.log("Welcome " + a,b);
}

getName("Christine", "Le")
*/

// global variables

let firstName = "John";
let lastName = "Dowd";
let age = 19;

/*
  *
  * @param firstName
  * @param lastName
  * @returns {string}
*/

//
// function displayPerson(firstName, lastName) {
//   // local vars prefix, and fullName
//   let prefix = "Mr";
//   let fullName = null;
//
//   /*
//     *
//     *
//     * @returns {string}
//   */
//
//   function getFullName() {
//     let suffix = "Esq.";
//     return fullName = `${prefix} ${firstName} ${lastName} ${suffix}`;
//   };
//
//   return getFullName();
//
// };
//
// /*
//  * @returns {number}
//  */
// function removeYears() {
//   let minusYears = 10;
//   let age = 49;
//   return age - minusYears;
// };
//
// console.log(displayPerson(firstName, lastName));
// console.log(removeYears());

console.log(this==window)
console.log(this.document === document);
