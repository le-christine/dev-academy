import React, { Component } from 'react';
import './App.css';


import Mood from './Mood';
class App extends Component {

  render () {
    return (
        <Mood mood={"happy"} />
    );
  }
}

export default App;
