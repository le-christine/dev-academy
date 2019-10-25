import React, { Component } from 'react';

class OneDogPic extends Component {
  constructor() {
    super();

    this.state = {
      pic: ''
    }

  }

  componentDidMount() {
    fetch('https://dog.ceo/api/breeds/image/random')
    .then(res=>res.json())
    .then(data=>this.setState({pic: data.message}))
    .catch(err => console.log(err));
  }

  moreRandomDogs = () => {
    fetch('https://dog.ceo/api/breeds/image/random')
    .then(res=>res.json())
    .then(data=>this.setState({pic: data.message}))
    .catch(err => console.log(err));
  }


  render() {
    return (
      <img
        className="singleDog"
        onClick={this.moreRandomDogs}
        src={this.state.pic}
        alt="a dog"
      />
    )
  }
}

export default OneDogPic;
