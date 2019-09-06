function buildName (name) {
  let greeting = `Hello ${name}!`;
  // this is a closure. It is  a function that has access to the greeting
  // if sayName() wasn't nested it would run once and be sent to the garbage
  // Closures keep things around in memory
  let sayName = function () {
    let welcome = greeting + " Welcome!";
    console.log(greeting);
  };

  return sayName();
}

var sayName = buildName("John");


  // scope and closure are similar, but scope is only applied to if (x = 100) { a scope not a closure} else { another scope }
