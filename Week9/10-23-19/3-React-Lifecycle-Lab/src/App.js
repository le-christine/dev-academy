import React, { Component } from 'react';
import Stopwatch from "./Stopwatch";
import './App.css';

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      counters: [0, 1, 2, 3, 4],

    }
  }



  render() {
    return (
      <div>
        {this.state.counters.map((counter, index) => {
          return <Stopwatch key={index} />
        })}
      </div>
    );
  }
}

export default App;
