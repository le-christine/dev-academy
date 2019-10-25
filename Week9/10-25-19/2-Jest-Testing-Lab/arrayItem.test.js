const removeLastItem = require('./arrayItem');

it('removes last item of the array', () => {
  const foods = ['chicken', 'potatoes', 'oj', 'milk'];
  const foodsNoMilk = ['chicken', 'potatoes', 'oj'];
  expect(removeLastItem(foods)).not.toContain('milk');
})
