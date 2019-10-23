import React, { Component } from 'react';

// Custom components
import Home from './Home'

class App extends Component {
  render() {
    return (
      <div className="App">
        <Home />

        {/* Another way to call components
            <Home></Home>
        */}

      </div>
    );
  }
}
export default App;
