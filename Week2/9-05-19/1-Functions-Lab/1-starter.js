/* ============ BEFORE YOU GET STARTED ============ */

/* here is a very short function that pops up an alert window that says 'Hello!' */
function hello() {
  alert('Hello!');
}

/* Here's the steps to test it:
- Open index.html in chrome.
- Type the keyboard shortcut `cmd + option + j`. Dev tools should open to the console.
- You should see the message saying 'starter.js is connected!'
- Underneath that, next to the blue arrow, type `hello()` to call the `hello` function
- You should get an alert window that says HELLO!
*/

/* ================= AS YOU COMPLETE EACH STEP ============= */

/* After each step, perform the following commands in the terminal:
1. git add .
2. git commit -m "add completed part PART-NUMBER-HERE"
This will help us track your progress and it will give you practice writing good commit messages!!
*/

/*REMINDER - ANY QUESTION THAT DOES NOT SPECIFICALLY TELL YOU TO ALERT OR PROMPT SHOULD BE LOGGED TO THE CONSOLE*/

/* ++++====+++==++++==+++++======++++===++++++=====+++==++++++++++===== */
/* ======================= WRITE YOUR ANSWERS HERE!!!!! =============== */
/* ++++====+++==++++==+++++======++++===++++++=====+++==++++++++++===== */

// PART 0: Just DO it!!
const justDoIt = (aName) => {
  return aName + ", JUST DO IT!";
};

//console.log(justDoIt('Christine'));

// PART 1: Big or Small String?

/* pseudocode
program bigorsmallstring accepts a string
if string length > 10:
  return "string is long"
else:
  return "word is short"
*/

const bigOrSmallString = (aStr) => {
  if (aString.length > 10) {
    return "This word is loooooong!";
  } else {
    return "This word is short 😬";
  }
};

//console.log(bigOrSmallString("thesortinghat"));

// PART 2: Odd or Even String Length?
const oddOrEvenString = (aStr) => {
  if (aStr.length % 2 !== 0) {
    return "This string's length is odd..";
  } else {
    return "This string length is TOTALLY even!";
  }
};
//console.log(oddOrEvenString('four'));
//console.log(oddOrEvenString('seven'));

// PART 3: Median

/*
sort the array
is arr length is 0dd, take the middle number by slicing floor(len/2)
if arry is even, take the two middle numbers and find its average

*/
const medianOfArray = (anArr) => {
  sortedArr = anArr.sort();
  let arrLength = sortedArr.length;
  if (arrLength % 2 !== 0) {
    let median = sortedArr[Math.floor(arrLength/2)];
    return median;
  } else {
    let median = (sortedArr[Math.floor(arrLength/2)] + sortedArr[Math.floor(arrLength/2-1)])/2;
    return median;
  }
};

// console.log(medianOfArray([4,6,5,6]));
// console.log(medianOfArray([10, 19, 20, 25, 18]));
// PART 4: Sum Array



// PART 5: Vowel Count



// PART 6: Initials



// BONUS: Days of the week



// BONUS: Let's take the Subway



// BONUS: Truth - y & False -y Checker



// BONUS: Double X Counter



/* connection checker console log */
console.log('starter.js is connected! Let\'s get to work! 💪');
