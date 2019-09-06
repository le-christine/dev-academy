/**
 *
 * @param  {Integer} a
 * @param  {Integer} b
 * @return {Integer}
 */

function foo(a,b) {
    console.log(a+b);
    return a+b;
}

/**
 *
 */
foo(1,1);
foo(2,2);

// Closures - a fuction that is nested in another function and thereby has access to it's parents' scope.
// for example - function anAnimal () {
//  name = 'someName';
//  type = 'someType';
//  function foo () {
//  };
//  }
//
//  if foo(){} were outside it only lives and runs once in the memory.
//  However, because it is inside the function, if we were to make another anAnimal object
//  it can live again. this is the power of closure. 
