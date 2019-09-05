document.querySelector('a').addEventListener('click', viewComments);

function viewComments(e) {
	// Prevent page from jumping to the top.
	e.preventDefault();

	document.querySelector('#comments').className = 'show-comments';
}
