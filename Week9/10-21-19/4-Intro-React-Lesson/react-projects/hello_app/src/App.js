import React, { Component } from 'react';
import './App.css';

class Hello extends Component {
  render () {
  return (
    <div className="App">
      <h1>Hello, {this.props.name}!</h1>
      <h2> {this.props.name} is {this.props.age} years old.</h2>
    </div>
    );
  }
}
export default Hello;
