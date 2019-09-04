// 1. Write a lengths function that accepts a single parameter as an argument: an array of strings. The function should return an array of numbers where each number is the length of the corresponding string.

const words = ["hello", "what", "is", "up", "dude"];
//lengths(words);  # => [5, 4, 2, 2, 4]

const lengths = (anArray) => {
  anArraysLength = []
  for (i=0; i<anArray.length; i++) {
    anArraysLength.push(anArray[i].length);
  };
  console.log(anArraysLength);
};

lengths(words);

//2. Write a JavaScript function called transmogrifier(). This function should accept three arguments, which you can assume will be numbers. Your function should return the "transmogrified" result.
//The transmogrified result of three numbers is the product of the first two numbers, raised to the power of the third number.
//For example, the transmogrified result of 5, 3, and 2 is (5 times 3) to the power of 2 (that is, 225). Use your function to find the following answers:
// transmogrifier(5, 4, 3);
// transmogrifier(13, 12, 5);
// transmogrifier(42, 13, 7);

/* pseudocode
PROGRAM transmogrifier takes three args (nums)
  multiply num1 and num2 to product
  take product and raise to 3rd power
returns transmogrified
*/

const transmogrifier = (num1, num2, num3) => {
  let product = num1 * num2;
  let transmogrified = product ** num3;
  return transmogrified;
};

console.log(transmogrifier(5, 4, 3)); //8000
console.log(transmogrifier(13, 12, 5)); //92389579776
console.log(transmogrifier(42, 13, 7)); //14466001271480793000

// 3. Write a function, wordReverse(), that accepts a single argument: a string. The method should return a string with the order of the words reversed. Don't worry about punctuation.
// wordReverse("Now I know what a TV dinner feels like")
// # => "like feels dinner TV a what know I Now"
// wordReverse("Put Hans back on the line")
// # => "line the on back Hans Put"

/* pseudocode
program wordreverse accepts a string
turn string into array
reverse array
join each , with space in array
assign array to be a string
return string
*/

const wordReverse = (aStr) => {
  // anArray = aStr.split(' ');
  // aRevArray = anArray.reverse();
  // aRevString = aRevArray.join(' ');
  aRevString = aStr.split(' ').reverse().join(' ');
  return aRevString;
};

console.log(wordReverse("Now I know what a TV dinner feels like"));
console.log(wordReverse("Put Hans back on the line"));
