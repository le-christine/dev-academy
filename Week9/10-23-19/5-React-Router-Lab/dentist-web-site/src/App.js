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

        <Router>
        <nav>
         <Link to="/">Home</Link>{' '}
         <Link to="/procedures">Procedures</Link>{' '}
         <Link to="/contact">Contact</Link>{' '}
        </nav>
         <div>
          <Route exact path="/" component={Home} />
          <Route path="/procedures" component={Procedures} />
          <Route path="/contact" component={Contact} />
        </div>
        </Router>
      </div>


    );
  }
}
export default App;
