// Function to call when the user clicks on the button
const alertUser = function () {
  alert("Welcome, user");
};

// Select the button element from the document
const button = document.querySelector('button');

// Add the event listener to the button: alertUser
// element.addEventListener('nameOfEvent', functionToRun);
button.addEventListener('click', alertUser); // we don't call it with () because JS will continue to run it, not just once
