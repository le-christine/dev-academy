import React, { Component } from 'react';

class Card extends Component {
  render() {
    return (
      <div className = "list-items">
      <img src={this.props.image} />
      <h3>{this.props.title}</h3>
      <p>{this.props.description}</p>
      </div>
    )
  }
}

export default Card;
