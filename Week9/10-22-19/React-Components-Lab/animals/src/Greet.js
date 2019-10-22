import React, { Component } from 'react';


class Greet extends Component {
  render() {
    return (
      <h1>Hello, {this.props.name}!</h1>
    )
  }
}

// to be able to access this class
export default Greet;
