function showCoords(event) {
  console.log(event);
  let x = event.clientX;
  let y = event.clientY;
  let coordinates = "X: " + x + " Y: " + y ;
  document.getElementById("demo").innerHTML = coordinates;
}

let x = document.querySelector("#example").addEventListener('click', showCoords);
