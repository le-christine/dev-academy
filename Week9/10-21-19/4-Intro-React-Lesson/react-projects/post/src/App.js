import React, { Component } from 'react';
import Comment from './Comment.js';
import './App.css';

class Post extends Component {
  render() {
    let comments = this.props.post.comments.map((comment, index) =>
      <Comment message={comment} key = {index} />
    )

    return (
      <div className="App">
        <h1>{this.props.post.title} </h1>
        <h2>By : {this.props.post.author} </h2>
        <p> {this.props.post.body} </p>
        <div>
        {comments}
        </div>
      </div>
    );
  }
}
export default Post;
