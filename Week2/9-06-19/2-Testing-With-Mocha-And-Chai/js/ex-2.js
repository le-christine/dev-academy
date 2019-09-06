mocha.setup('bdd');
const assert = chai.assert;
const expect = chai.expect;

/**
 * Returns pig latin of a word
 * @param  {[String]} phrase
 * @return {[String]}
 */
function pigLatin(phrase) {
  const pigLatinWords = [];

  phrase.split(' ').forEach((word) => {
    const firstLetter = word.substring(0, 1); //substring returns part of string [start, end] not including the end itself
    word = word.substr(1); //substr returns part of the string [start, length]
    pigLatinWords.push(`${word}-${firstLetter}ay`);
  });

  return pigLatinWords.join(' ');
}

console.log(pigLatin("hello world"));

describe("pigLatinWords Test", function() {
  // input 'hello world' and output should be ello-hay orld-way
  it("Converts 'hello world' to ello-hay orld-way", function() {
    expect(pigLatin('hello world')).to.equal('ello-hay orld-way');
  });
});

mocha.run();
