const emailInputField = document.getElementById('email');
//const submitButton = document.getElementById('btn');
emailInputField.addEventListener('blur', checkEmailInput);
//submitButton.addEventListener('click', checkEmailInput);
/**
 * To check the email input from the user
 */
function checkEmailInput () {
  if (emailInputField.value.length === 0) {
    document.getElementById('message').innerText = 'Please enter your email address.';
    emailInputField.className = 'error';
  } else {
    document.getElementById('message').innerText = '';
  }
};
