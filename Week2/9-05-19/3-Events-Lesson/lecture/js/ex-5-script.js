function showCoords(event) {
  let x = event.clientX;
  let y = event.clientY;
  let coordinates = "x coo " + x + " Y coo " + y;
  document.getElementById("demo").innerHTML = coordinates;
}

let x = document.querySelector("#example").addEventListener('click', showCoords)
