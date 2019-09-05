function getKey(e) {
  console.log(e);
  log.textContent += `${e.code}`;
}

const myLog = document.getElementById('log');
document.addEventListener('keyup', getKey);
