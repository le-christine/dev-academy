const reverse = require('./reverse');

it('reverses a string', () => {
  expect(reverse('cat')).toBe('tac');
})

it('reverses a string', () => {
  expect(reverse('hello there the angel from my nightmare')).toBe('eramthgin ym morf legna eht ereht olleh');
})
