import React, { Component } from 'react';
import Content from './Content';

class Home extends Component {
  render() {
    return (
      <div className = "content">
      <Content />
      <div className = "info">
      <h1>Dentist Website</h1>
      <p>
        Welcome to my dentist website.
      </p>
      </div>
      </div>
);
  }
}

export default Home;
