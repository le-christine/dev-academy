import React from 'react';
import './App.css';

// Custom components
import Greet from './Greet.js'
import Header from './Header.js'
import List from './List.js'

let tabs = ["People", "Animals"];

function App() {
  return (
    <div className="App">
      <Greet name = {"Christine"}/>
      <Header tabs={tabs} />
      <List />
    </div>
  );
}

export default App;
