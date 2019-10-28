console.log('js is connected');

function clearResults() {
  const movieList = document.querySelector('.movieResults');
  const warning = document.querySelector('.warning');
  movieList.innerHTML = '';
  warning.innerText='';
}

function getMovies() {
  clearResults();
  const query = document.querySelector('.movieQuery').value;
  fetch(`http://www.omdbapi.com/?s=${query}&apikey=b4f8e5c7`)
  .then ((res) => {
    return res.json();
  })
  .then((res) => {
    console.log(res);
    manipulateDom(res, query);
  })
  .catch((error) => {
    console.log(error);
  })
}

function manipulateDom(res, query) {
  if (res.Search) {
  const movieList = document.querySelector('.movieResults');
  for (let i = 0; i<res.Search.length; i++) {
    const result = document.createElement('li');
    result.innerText = res.Search[i].Title + ', released ' + res.Search[i].Year;
    movieList.appendChild(result);
    }
  } else {
    const warning = document.querySelector('.warning');
    warning.innerText = 'No movies match the title of: ' + query;
  }
}
