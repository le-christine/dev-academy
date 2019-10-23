import React, { Component } from 'react';
import Lollipop from './assets/pink-lollipop.jpeg';
import Suckers from './assets/colorful-lollipops.jpeg';
import DonutsMilk from './assets/donuts-milk.jpeg';
import Donuts from './assets/blue-pink-donuts.jpeg';
import FruitCandy from './assets/fruit-candy.jpeg';
import BreakfastGummy from './assets/breakfast-gummy.jpeg';
import Balloons from './assets/balloons.jpeg';
import IceCream from './assets/assorted-ice-cream-scoops.jpeg';


class Content extends Component {
  constructor(props) {
    super(props);

    this.state = {
      imageSrc : [
        Lollipop,
        Suckers,
        DonutsMilk,
        Donuts,
        FruitCandy,
        BreakfastGummy,
        Balloons,
        IceCream
      ]
    }

    this.randomizer = this.randomizer.bind(this);

  }

  randomizer() {
    return Math.floor(Math.random()*this.state.imageSrc.length);
  }

  render () {
    return (
      <img src={this.state.imageSrc[this.randomizer()]}/>
    )
  }
}

export default Content;
