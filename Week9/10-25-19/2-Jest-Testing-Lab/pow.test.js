const pow = require('./pow');

test('5 to the 2 power is 25', () => {
  expect(pow(5,2)).toBe(25);
});

test('1 to the 0 power is 1', () => {
  expect(pow(1,0)).toBe(1);
})
