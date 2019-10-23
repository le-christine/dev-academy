import React, { Component } from 'react';
import "./Stopwatch.css"

class Stopwatch extends Component {
  constructor(props) {
    super(props);

    this.state = {
      counter: 0,
      pause: false
    }

  this.incrementCounter = this.incrementCounter.bind(this);
  this.start = this.start.bind(this);
  this.pause = this.pause.bind(this);
  this.reset = this.reset.bind(this);
  }

    incrementCounter() {
    const counter = this.state.counter + 1;
    this.setState({
      counter
    });

    if (!this.state.paused) {
      window.setTimeout(this.incrementCounter, 1000)
    }
  }

  start() {
    this.setState({
      paused: false
    });

    window.setTimeout(this.incrementCounter, 1000);
  }

  pause() {
    this.setState({
      paused: true
    })
  }

  reset() {
    this.setState({
      counter: 0,
      paused: true
    })
  }

  render() {
    return (
      <div className="stopwatch">
        <h1>{this.state.counter}</h1>
        <div className="controls">
          <button onClick={this.reset}>Reset</button>
          <button onClick={this.start}>Start</button>
          <button onClick={this.pause}>Pause</button>
        </div>
      </div>
    );
  }
}

export default Stopwatch;
