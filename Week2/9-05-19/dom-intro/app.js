console.log("Stranger Things are coming!");
document.querySelector("h1").innerText = "Christine rocks";
const image = document.querySelector('img'); //grabs the img element
console.log(image);
image.style.display = "none";
image.style.display = "block";
image.style.filter = "grayscale(100%)";
image.style.width = "95%";
image.style.filter = "";

const eggos = document.createElement('img'); //this is created but it's not attached to the document- there is no parent or children.
document.querySelector('.container').appendChild(eggos);

eggos.setAttribute('src', 'https://i.ytimg.com/vi/TgSmPqMGk2g/maxresdefault.jpg');
eggos.style.width = '100%';
eggos.remove();

console.log(document.querySelectorAll('li'));
document.querySelectorAll('li')[0].innerText = "Christine L.";
document.querySelectorAll('li')[4].style.color = 'hotpink';
document.querySelectorAll('li')[3].remove();
