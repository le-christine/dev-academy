const reverse = (str) => {
  reversed = '';
  for (let i = str.length; i>=0; i--) {
    reversed+=str.charAt(i);
  }
  return reversed;
}

module.exports = reverse;
