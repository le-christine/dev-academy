// set up our mocha application

// import mocha.setup method
mocha.setup('bdd'); // behavorial driven development - how the function behaves e.g. if a button is clicked what is the output?

// call assert from chai
const assert = chai.assert; // calling assert function from chai library  - this is where to get the to.equal

// call expect from chai
const expect = chai.expect;

function pigLatin(phrase) {
  const pigLatinWords = [];

  phrase.split(' ').forEach((word) => {
    const firstLetter = word.substring(0, 1);
    word = word.substr(1);
    pigLatinWords.push(`${word}-${firstLetter}ay`);
  });

  return pigLatinWords.join(' ');
}

// describe function to run the test suite
describe("my first Test Suite", function() {

  // first function of the test
  it("introduces a test suite", function() {
    // we have true as our default value, and we expect true as the input so the test can pass
    expect(true).to.equal(true); // It uses a language chain for readability and simply states that the program expects true to equal true — which it does.
  });

  // second function of the test
  it("introduces a fail suite", function() {
    // we have true as our default value, and we have given false as the input so the test can fail
    expect(true).to.equal(false); // We would never expect false to equal true, so our test fails. We expected true but we got a false;
  });

  it("Converts 'hello world' into pig latin", function() {
    expect(pigLatin("hello world")).to.equal("ello-hay orld-way"); // blackbox testing - we only need to test the input and output
  })
});

// finally call run method so we can run the test
mocha.run();
