/*
const classroom = {
  name: "History 101",
  campus: "NYC",
  start: "1/1/2020",
  sayHello: function() { // this is a method on an object
    console.log(`This is ${this.name} and the class starts on ${this.start}`);
  }
}

classroom.sayHello();

const helloFunction = () => {
  console.log("This is going to be the best!");
}

classroom.sayHello = helloFunction;
classroom.sayHello();
*/

// Looping through the object
// for ... in
// Object.keys(obj)
// Object.getOwnPropertyNames(obj)

/*
const myCar = {
  make: "Ford",
  model: "Mustang",
  year: 1969
};

const myCar2 = {
  make: "Toyota",
  model: "Camry",
  year: 2004
};

// for ... in
const showProps = (obj) => {
  let result = "";
  for (let key in obj) {
    //result += key + " = " + obj[key] + "\n";
    result += `${key} = ${obj[key]} \n`
  }
  return result;
}

console.log(showProps(myCar2));

// Object.keys(obj)
// Object.keys(myCar) will return an array of keys ["make", "model", "year"]
console.log(Object.keys(myCar));

// Object.getOwnPropertyNames(object)
// Object.getOwnPropertyNames(myCar) will return an array of keys ["make", "model", "year"]
console.log(Object.getOwnPropertyNames(myCar));


const student = {name: "Chris"};
const student2 = {name: "Chris"};

console.log(student === student2); // False because the memory addresses differ
console.log(student === student); // True because the memory addresses are the same

Independent Practice
Independent Exercise: Monkeying Around (15 min)
Create a monkey object, that has the following properties:

name
species
foodsEaten
And the following methods:

eatSomething(foodString)
introduce: Produces a string introducing itself, including its name, species, and what it has eaten.
Then, use the monkey object you created to do the following:

Create three monkeys total. Make sure all three monkeys have all properties set and methods defined.
Exercise your monkeys by retrieving their properties and using their methods using a for...in loop.
Note: Make sure to practice using both syntaxes for retrieving properties (dot notation and brackets)!

*/

function monkeyObject(name, species, foodsEaten) {
  this.name = name,
  this.species = species,
  this.foodsEaten = foodsEaten,
  this.eatSomething = function(foodString) {
    console.log(`Hi, I am a monkey. My name is ${this.name} and I am a ${this.species}.
      Today I ate ${this.foodsEaten} and ${foodString}.`);
  }
}
//
const monkeyGeorge = new monkeyObject("George", "Chimpanzee", "bananas, mangoes, and strawberries");

const monkeyKoko = {
  name: "Koko",
  species: "gorilla",
  foodsEaten: "plaintains, calendulas, carnations, pansies, and roses",
  eatSomething: function(foodString) {
    console.log(`Hi, I am a monkey. My name is ${this.name} and I am a ${this.species}.
      Today I ate ${this.foodsEaten}.`);
  }
}

const monkey = {
  eatSomething: function() {
    console.log(`Hi, I am a monkey. My name is ${this.name} and I am a ${this.species}.
      Today I ate ${this.foodsEaten}.`)
  }
}

const monkeyJack = Object.create(monkey);
monkeyJack.name = "Jack";
monkeyJack.species = "Capuchin";
monkeyJack.foodsEaten = "oysters, quail eggs";

// console.log(monkeyGeorge, monkeyGeorge.eatSomething("corn"));
// console.log(monkeyKoko, monkeyKoko.eatSomething());
// console.log(monkeyJack, monkeyJack.eatSomething());

const showMonkeyBio = (monkeyObj) => {
  for (let fact in monkeyObj) {
    if (typeof(monkeyObj[fact]) !== "function") {
    console.log(`${fact} = ${monkeyObj[fact]}`);
    }
  }
}


// showMonkeyBio(monkeyGeorge);
// showMonkeyBio(monkeyKoko);
// showMonkeyBio(monkeyJack);

/* In class solution

function Monkey(name, species, foodsEaten) {
  this.name = name;
  this.species = species;
  this.foodsEaten = foodsEaten;
  this.eatSomething = function(foodString) {
    this.foodsEaten.push(foodString);
  };
  this.introduce = function() {
    console.log(`Hello my name is ${this.name} and I am a ${this.species}, I've also eaten: ${this.foodsEaten}`);
  };
  this.exercise = function() {
    for (const key in this) {
      const value = this[key];
      console.log(key + " " + value);
    }
  };
}
const Casey = new Monkey("Casey", "Human", ["Hotdog", "Cheeseburger", "Pizza"]);

*/
