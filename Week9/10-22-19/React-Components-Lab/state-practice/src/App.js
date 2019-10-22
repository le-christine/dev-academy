import React, { Component } from 'react';
import './App.css';

class App extends Component {
  // What will happen when the component is first created
  constructor(props) {
    // Make call to parent class (Component) constructor
    super(props);

    this.state = {
      moodPoints: 1 // iniitialize this.state.moodPoints
     }

     // bind callbacks to maintain context
     this.changeMood = this.changeMood.bind(this);
  }

  changeMood(e) {
    const newMoodPoints = prompt("How are you feeling (1-10)?");
    this.setState({
      moodPoints: parseInt(newMoodPoints,10)
    })
  }

  render () {
    return (
      <div className="App">
        <p>Hello, world! You have {this.state.moodPoints} moodPoints!</p>
        <button onClick = {this.changeMood}> Cheer up!</button>
      </div>
    );
  }
}

export default App;
