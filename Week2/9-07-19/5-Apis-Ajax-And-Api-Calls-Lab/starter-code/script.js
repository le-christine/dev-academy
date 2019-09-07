// part 1 - make a function called 'makeCall' that will make an AJAX GET request to 'https://randomuser.me/api/' and console.log the response in the success function - 10 min

let data;
/**
 * This function does a fetch request to retrieve a random profile
 *
 * @return {[Promise]} Status of the request
 */
const makeCall = function() {
  fetch('https://randomuser.me/api')
  .then((response) => {
    return response.json();
  })
  .then((response) => {
  	//console.log(response.results[0]);
    data = response.results[0];
    getData(data);
  })
  .catch((err) => {
  	console.log(err);
  })
};

makeCall();
// part 2 - write a function called getData that will parse the results from the ajax request and set new variables for the user's first name, last name, email, dob, street, city, state, address, phone, password, and image.
// Call this function from the success method of your AJAX call. - 15 min

const getData = function(data) { // takes in an object


    // <div class="attribute" id="name">😀</div>
    // <div class="attribute" id="email">📧</div>
    // <div class="attribute" id="birthdate">🎉</div>
    // <div class="attribute" id="address">📪</div>
    // <div class="attribute" id="phone">📞</div>
    // <div class="attribute" id="password">🔒</div>
// initializes variables
let firstname, lastname, fullname, email, dob, street, city, state, address, phone, password, imgUrl;

// asigns variables from data parsing
firstname = data.name.first;
lastname = data.name.last;
fullname = firstname + ' ' + lastname;
email = data.email;
dob = new Date(data.dob.date);
street = location.street;
city = location.city;
state = location.state;
address = street + city + state + data.location.postcode;
phone = data.cell;
password = data.login.password;
imgUrl = data.picture.large;

manipulateDom(fullname, email, dob, address, phone, password, imgUrl);
};


// part 3 - write a function called manipulateDom that will accept the name, email, dob, address, phone, pw, and image as arguments.

// call this function from inside `getData` and pass in the appropriate values - 20 min

const manipulateDom = function(name, email, dob, address, phone, pw, img_url) {
  // Assign these values as data attributes to the html elements as follows.
  // the element with the id of 'bigtext' should have the the user's name for its text
const userName = document.querySelector('#bigtext').innerText = name;
  // the element with the id of 'photo' shouls have the user's image for it's background-image
const userImage = document.querySelector('#photo').style.background = img_url;
  // the element witht he id of 'name' should have the user's name for its data attribute
const userName2 = document.querySelector('#name').createAttribute = ('data-name', name);
  // the element with the id of 'email' should have the user's email for its data attribute
const userEmail = document.querySelector('#email').createAttribute = ('data-email', email);
  // the element with the id of 'birthdate' should have the user's birthdate for its data attribute
const userBirthday = document.querySelector('#birthdate').createAttribute = ('data-dob', dob);
  // the element with the id of 'address' should have the user's address for its data attribute
const userAddress = document.querySelector('#address').createAttribute = ('data-address', address);
  // the element with the id of 'phone' should have the user's phone for its data attribute
const userPhone = document.querySelector('#phone').createAttribute = ('data-phone', phone);
  // the element with the id of 'password' should have the user's password for its data attribute
const userPassword = document.querySelector('#password').createAttribute = ('data-password', password);
};

// part 4 - write a click handler for the button that will call the makeCall function - 5 min

document.getElementsByTagName('button')[0].addEventListener('click', makeCall);

// part 5 - write a function called addEventListeners that will add hover listeners for the icons on the page - 10 min
//
// when hovering over #name, the #smalltext should say 'My name is', and the #bigtext should use the #name's data attribute for its text
// when hovering over #email, the #smalltext should say 'My email is', and the #bigtext should use the #email's data attribute for its text
// when hovering over #birthdate, the #smalltext should say 'My birthday is', and the #bigtext should use the #birthdate's data attribute for its text
// when hovering over #address, the #smalltext should say 'My addresss is', and the #bigtext should use the #address's data attribute for its text
// when hovering over #phone, the #smalltext should say 'My phone number is', and the #bigtext should use the #phone's data attribute for its text
// when hovering over #password, the #smalltext should say 'My password is', and the #bigtext should use the #password's data attribute for its text

function addEventListeners() {

}
