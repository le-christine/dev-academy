mocha.setup('bdd');
const assert = chai.assert;
const expect = chai.expect;

function maxOfTwoNumbers(x, y) {
    if (x > y) {
        return x;
    }

    return y;
}

function maxOfTwoNumbersTernary(x, y) {
    return x > y ? x : y;
}

function maxOfThree(x, y, z) {
    if (x > y && x > z) {
        return x;
    }

    if (y > x && y > z) {
        return y;
    }

    return z;
}

const vowels = ['a', 'e', 'i', 'o', 'u', 'y'];

function isCharacterAVowel(x) {
    if (vowels.includes(x.toLowerCase())) {
        return true;
    }

    return false;
}

function sumArray(x) {
    let sum = 0;
    for (let i = 0; i < x.length; i++) {
        sum += x[i];
    }

    return sum;
}

function multiplyArray(x) {
    let mult = 1;

    for (let i = 0; i < x.length; i++) {
        mult *= x[i];
    }

    return mult;
}

function numberOfArguments() {
    return arguments.length;
}

function reverseString(x) {
    let reverse = '';

    for (var i = x.length - 1; i >= 0; i--) {
        reverse += x[i];
    }

  return reverse;
}

function altReverseString(x) {
    return x.split('').reverse().join('');
}

function findLongestWord(x) {
    let longest = "";

    for (let i = 0; i < x.length; i++) {
        if (x[i].length > longest.length) {
            longest = x[i]
        }
    }

    return longest;
}

function filterLongWords(x, num) {
    let longWords = [];

    for (let i = 0; i < x.length; i++) {
        if (x[i].length > num) {
            longWords.push(x[i]);
        }
    }

    return longWords;
}

function filterLongWordsBonus(x, num) {
    const longWords = x.filter((word) => {
        if (word.length > num) {
            return word;
        }
    })

    return longWords;
}

function charactersOccurancesCount(x) {
    x = x.toLowerCase();
    let chars = {};

    for (let i = 0; i < x.length; i++) {
        chars[x.charAt(i)] = i;
    }

    return chars;
}

function returnNumArgs(...args) {
  return args.length;
}

describe ("Testing functions lab", function() {
  it("maxOfTwoNumbers(1,6) === 6", function() {
    expect(maxOfTwoNumbers(1,6)).to.equal(6);
  });

  it("maxOfThree(1,9,6) === 9", function() {
    expect(maxOfThree(1,9,6)).to.equal(9);
  });

  it("isCharacterAVowel('a') === true", function() {
    expect(isCharacterAVowel('a')).to.equal(true);
  });

  it("isCharacterAVowel('c') === false", function() {
    expect(isCharacterAVowel('c')).to.equal(false);
  });

  it ("sumArray Test Case([1,2,3,4]) === 10", function() {
    expect(sumArray([1,2,3,4])).to.equal(10);
  });

  it ("multiplyArray([1,2,3,4]) === 24", function() {
    expect(multiplyArray([1,2,3,4])).to.equal(24);
  });

  it(`returnNumArgs("first", "second") === 2`, function() {
    expect(returnNumArgs("first", "second")).to.equal(2);
  });

  it(`reverseString("jag testar") === "ratset gaj"`, function() {
    expect(reverseString("jag testar")).to.equal("ratset gaj");
  });

  it (`findLongestWord(["one", "two", "three", "twenty"]) === "twenty"`, function() {
    expect(findLongestWord(["one", "two", "three", "twenty"])).to.equal("twenty");
  });

  // this test case uses to.eql which compares each object's property
  it ("filterLongWords Test Case", function() {
    expect(filterLongWords(["a", "an", "ann", "anne", "annie", "annabelle"],3)).to.eql(["anne", "annie", "annabelle" ]);
  });

});

mocha.run();
