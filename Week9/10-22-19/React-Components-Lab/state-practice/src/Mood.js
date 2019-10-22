import React, { Component } from 'react';

class Mood extends Component {
  // What will happen when the component is first created
  constructor(props) {
    // Make call to parent class (Component) constructor
    super(props);

    this.state = {
      moodPoints: 1 // iniitialize this.state.moodPoints
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
      <div>
        <p>On a scale of 1-10</p>
        <p>You are this {this.props.mood}:
        <span className="moodColor"
        style={{color: this.state.moodPoints > 5 ? "orange" : "blue"}}> {this.state.moodPoints}</span></p>
        <button onClick = {this.changeMood}> Cheer up!</button>
        <button onClick={this.increaseMood}>Increase {this.props.mood}</button>
        <button onClick={this.decreaseMood}>Decrease {this.props.mood}</button>
      </div>
    )
  }
}

export default Mood;
