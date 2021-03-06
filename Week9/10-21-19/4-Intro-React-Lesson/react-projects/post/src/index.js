import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Post from './App';
import * as serviceWorker from './serviceWorker';

const post = {
  title: 'I love React',
  author: 'Christine Le',
  body: 'React was created in 2011 by Facebook',
  comments: [`I didn't know that!`, 'Pretty lame post', `I don't know, it was alright`]
}

ReactDOM.render(<Post post = {post}/>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
