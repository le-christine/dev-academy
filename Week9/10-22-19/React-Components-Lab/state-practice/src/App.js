import React, { Component } from 'react';
import './App.css';


import Mood from './Mood';
class App extends Component {

  // What will happen when the component is first created
  constructor(props) {
    // Make call to parent class (Component) constructor
    super(props);

    this.state = {
      moodPoints: 1, // iniitialize this.state.moodPoints
      mood: "happy"
     }

     // bind callbacks to maintain context
     this.changeMood = this.changeMood.bind(this);
     this.increaseMood = this.increaseMood.bind(this);
     this.decreaseMood = this.decreaseMood.bind(this);
  }

  changeMood(e) {
    const newMoodPoints = prompt("How are you feeling (1-10)?");
    const newMood = parseInt(newMoodPoints,10) <= 10 ? parseInt(newMoodPoints,10) : 1;
    this.setState({
        moodPoints: newMood
      })
  }

  increaseMood(e) {
    const newMood = this.state.moodPoints < 10 ? (this.state.moodPoints + 1) : 1;
    this.setState({
        moodPoints: newMood
      })
    }

  decreaseMood(e) {
    const newMood = this.state.moodPoints < 10 && this.state.moodPoints > 1 ? (this.state.moodPoints - 1) : 1;
    this.setState({
        moodPoints: newMood
      })
  }

  render () {
    return (
        <Mood
          decreaseMood = {this.decreaseMood}
          increaseMood = {this.increaseMood}
          changeMood = {this.changeMood}
          mood={this.state.mood}
          moodPoints ={this.state.moodPoints} />
    );
  }
}

export default App;
