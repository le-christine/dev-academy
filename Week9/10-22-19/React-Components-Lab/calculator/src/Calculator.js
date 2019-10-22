import React, { Component } from 'react';


class Calculator extends Component {
  constructor(props) {
    super(props);

    this.state = {
      output: 0,
      numOne: 0,
      numTwo: 0
    }

    this.numOne = this.numOne.bind(this);
    this.numTwo= this.numTwo.bind(this);
    this.calculateIt = this.calculateIt.bind(this);

  }

  calculateIt(operator) {
      let output;

      if (operator === "+") {
        output = this.state.numOne + this.state.numTwo;
      }
      else if (operator === "-") {
        output = this.state.numOne - this.state.numTwo;
      }
      else if (operator === "*") {
        output = this.state.numOne * this.state.numTwo;
      }
      else {
        output = this.state.numOne / this.state.numTwo;
      }

      this.setState({
        output
      })
    }

  numOne(event) {
    const numOne = parseInt(event.target.value);
    this.setState({
      numOne
    })
  }

  numTwo(event) {
    const numTwo = parseInt(event.target.value);
    this.setState({
      numTwo
    })
  }

  render() {
    return (
      <div className = "container">
        <h1>Calculate</h1>
          <input type="number" onChange = {this.numOne} />
          <input type="numer" onChange = {this.numTwo}/>
          <h3>{this.state.output}</h3>
            {/*if we pass a variable as a callback it will invoke it right away
            we need to wrap this as an anonymous function with the closure syntax*/}
          <button onClick={()=>this.calculateIt("+")}>Add</button>
          <button onClick={()=>this.calculateIt("-")}>Substract</button>
          <button onClick={()=>this.calculateIt("*")}>Multiply</button>
          <button onClick={()=>this.calculateIt("/")}>Divide</button>
        </div>
    )
  }
}

export default Calculator;
