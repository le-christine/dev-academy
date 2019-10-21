import React, { Component } from 'react';
import './App.css';

class App extends Component {
  render() {
  return (
    <div className="App">
      <h1>Hello, world!</h1>
    </div>

    // under the hood it is doing;
    // const heading = document.createElement('h1');
    // heading.innerText = "Hello, world!"
    // body.appendChild(heading);
    );
  }
}


export default App;
// exposes this and allows it to be imported
