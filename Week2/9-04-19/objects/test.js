// Four ways to create objects
// (1)
/*
const myObject = {};
*/

// Constructor Function - use keyword new to create a new object out of the template

// (2)
function Classroom(name, numberOfStudents) {
  this.name = name;
  this.numberofStudents = numberOfStudents;
}

// this in the classroom constructor context means:
// An Object of type Classroom
// Call its properties/methods with this.property

const AMEX = new Classroom("AMEX", 25);

// (3)

const Person = {
	type: "human",
	displayType: function() {
		console.log(this.type);
    }
}

const Person1 = Object.create(Person);
Person1.displayType(); // human

// (4)
const Person = {
  name: 'Glinda'
}

const classroom = new Object();


// To access properties
// Object.key;
// Object['key'];

// To update the property value
// Object.key = new-value;

// To remove the property key
// delete Object.key;
