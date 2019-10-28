console.log('js is connected');

function clearResults() {
  const movieList = document.querySelector('.movieResults');
  movieList.innerHTML = '';
}

function getMovies() {
  clearResults();
  const query = document.querySelector('.movieQuery').value;
  fetch(`http://www.omdbapi.com/?s=${query}&apikey=b4f8e5c7`)
  .then ((res) => {
    return res.json();
  })
  .then((res) => {
    manipulateDom(res);
  })
  .catch((error) => {
    console.log(error);
  })
}

function manipulateDom(res) {
  const movieList = document.querySelector('.movieResults');
  for (let i = 0; i<res.Search.length; i++) {
    const result = document.createElement('li');
    result.innerText = res.Search[i].Title;
    movieList.appendChild(result);
  }
}
