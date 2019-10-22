import React, { Component } from 'react';

import './App.css';

//custom components
import FruitList from './FruitList';
import FruitFilter from './FruitFilter';

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      initialFruits: [
        'Acai',
        'Aceola',
        'Apple',
        'Apricots',
        'Avocado',
        'Banana',
        'Blackberry',
        'Blueberries',
        'Camu Camu berry',
        'Cherries',
        'Coconut',
        'Cranberry',
        'Cucumber',
        'Currents',
        'Dates',
        'Durian',
        'Fig',
        'Goji berries',
        'Gooseberry',
        'Grapefruit',
        'Grapes',
        'Jackfruit',
        'Kiwi',
        'Kumquat',
        'Lemon',
        'Lime',
        'Lucuma',
        'Lychee',
        'Mango',
        'Mangosteen',
        'Melon',
        'Mulberry',
        'Nectarine',
        'Orange',
        'Papaya',
        'Passion Fruit',
        'Peach',
        'Pear',
        'Pineapple',
        'Plum',
        'Pomegranate',
        'Pomelo',
        'Prickly Pear',
        'Prunes',
        'Raspberries',
        'Strawberries',
        'Tangerine/Clementine',
        'Watermelon'
      ],
      fruitsToDisplay: [],
      unmatchedFruits: [],
      filterValue: ''
    }

    this.handleFilterChange = this.handleFilterChange.bind(this);
  }

  componentDidMount() {
    this.setState({
      fruitsToDisplay: this.state.initialFruits
    })
  }

  handleFilterChange(event) {
    event.preventDefault();
    const filterValue = event.target.value;
    this.setState((prevState) => {
      const filteredFruitList =
        this.state.initialFruits
          .filter(
            fruit => fruit.toLocaleLowerCase()
            .includes(filterValue.toLocaleLowerCase()))
      const unmatchedFruits=
        this.state.initialFruits
          .filter(
            fruit => !fruit.toLocaleLowerCase()
              .includes(filterValue.toLocaleLowerCase()))

      return {
        fruitsToDisplay: filteredFruitList,
        unmatchedFruits,
        filterValue
      }
    })
  }


  render() {
  return (
    <div className="App">

      <FruitFilter
        value = {this.state.filterValue}
        onChange = {this.handleFilterChange}
      />
        <p>Matching fruits:</p>
        <FruitList fruits={this.state.fruitsToDisplay} />


        <p>Unmatched fruits:</p>
        <FruitList fruits={this.state.unmatchedFruits} />
        
    </div>
  );
}
}

export default App;
