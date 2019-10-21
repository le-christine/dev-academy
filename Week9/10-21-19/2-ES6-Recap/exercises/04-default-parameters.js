// Write a function that takes 3 parameters: greeting, firstName,
// and lastName. Set the default values to 'hello' and your first
// and last name, if no input is provided.

const greeting = function(greeting='hello', firstName='Christine', lastName='Le'){
  return `${greeting} ${firstName} ${lastName}`;
}  // fill this in!

console.log(greeting());

console.log(greeting('hi', 'harry', 'hedger'));
