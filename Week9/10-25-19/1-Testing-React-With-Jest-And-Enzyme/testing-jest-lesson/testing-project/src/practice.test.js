import { greet } from './practice';

// it and test are interchangeable
it('greets the argument', () => {
  expect(greet('World')).toBe('Hello World!');
})

test('two plus two is four', () => {
  expect(2+2).toBe(4);
})

test('two plus two is not five', () => {
  expect(2+2).not.toBe(5);
})

// javascript creates objects and assigns them a space
// in memory
// even if the objects contain the same keys and values
// they are compared by reference (address)
test('JS Objects are compared by reference', () => {
  const obj = {a:1, b:2}
  const otherObj = {a:1, b:2}

  const obj2 = obj;

  expect(obj).not.toBe(otherObj);
  expect(obj).toEqual(otherObj);

  expect(obj2).toBe(obj);
  expect(obj2).toEqual(otherObj);
})


test('undefined !== false', () => {
  let variable;

  expect(variable).toBeUndefined();
  expect(variable).toBe(undefined);

  expect(variable).not.toBe(null);
  expect(variable).not.toBeNull();

  expect(variable).not.toBeNaN();
  expect(variable).not.toBe(NaN);

  expect(variable).toBeFalsy();
  expect(variable).not.toBeTruthy();
})

test('JS decimals can have some frustrating precision issues', () => {
  expect(.2 + .2).toBe(.4);
  expect(.1 + .2).not.toBe(.3);
  expect(.1 + .2).toBeCloseTo(.3);
})
