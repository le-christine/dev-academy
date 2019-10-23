import React, { Component } from 'react';

// Custom components
import Home from './Home'
import Procedures from './Procedures';
import Contact from './Contact';

class App extends Component {
  render() {
    return (
      <div className="App">

        {/* Two ways to call components
            <Home />
            <Home></Home>
        */}

        <Router>
        <div exact path="/" component={Home} />

      </div>
    );
  }
}
export default App;
