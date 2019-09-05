// Add your event handlers here

const changeBackgroundRed = () => {
  document.body.style.backgroundColor = 'red';
}
const redButton = document.querySelector('li.red-theme');
redButton.addEventListener('click', changeBackgroundRed);

const changeBackgroundWhite = () => {
  document.body.style.backgroundColor = 'white';
}
const whiteButton = document.querySelector('li.white-theme');

whiteButton.addEventListener('click', changeBackgroundWhite);

const changeBackgroundBlue = () => {
  document.body.style.backgroundColor = 'blue';
}
const blueButton = document.querySelector('li.blue-theme');

blueButton.addEventListener('click', changeBackgroundBlue);

const changeBackgroundYellow = () => {
  document.body.style.backgroundColor = 'yellow';
}
const yellowButton = document.querySelector('li.yellow-theme');

yellowButton.addEventListener('click', changeBackgroundYellow);


function turnRed () {
  document.querySelector('body').className = 'red-theme';
}
function turnWhite () {
  document.querySelector('body').className = 'white-theme';
}
function turnBlue () {
  document.querySelector('body').className = 'blue-theme';
}
function turnYellow () {
  document.querySelector('body').className = 'yellow-theme';
}
