import React, { Component } from 'react';
import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom';

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
            <div path="/procedures" component={Procedures} />
            <div path="/contact" component={Contact} />
        </Router>
      </div>

    );
  }
}
export default App;
