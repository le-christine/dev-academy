import React, { Component } from 'react';


class Calculator extends Component {
  constructor(props) {
    super(props);

    this.state = {
      output: 0,
      numOne: 0,
      numTwo: 0,
      hover: false,
      click: false
    }

    this.numOne = this.numOne.bind(this);
    this.numTwo= this.numTwo.bind(this);
    this.calculateIt = this.calculateIt.bind(this);

  }

  // arrow function declaration implicitly binds the function
  hoverEnter = () => {
    this.setState({
      hover: true
    })
  }

  hoverLeave = () => {
    this.setState({
      hover: false
    })
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

    mouseDown = () => {
      this.setState({click: true})
    }

    mouseUp = () => {
      this.setState({click: false})
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
    const buttonStyles = {
      borderRadius: "5px",
      padding: "15px 25px",
      fontSize: "22px",
      textDecoration: "none",
      margin: "20px",
      color: "#fff",
      position: "relative",
      display: "inline-block",
      backgroundColor: this.state.hover ? "#6FC6FF" : "#55ACEE",
      transform: this.state.click ? "translate(0px, 5px)" : "",
      boxShadow: this.state.click ? "0px 1px 0px 0px" : ""
    };


    return (
      <div className = "container">
        <h1>Calculate</h1>
          <input type="number" onChange = {this.numOne} />
          <input type="numer" onChange = {this.numTwo}/>
          <h3>{this.state.output}</h3>
            {/*if we pass a variable as a callback it will invoke it right away
            we need to wrap this as an anonymous function with the closure syntax*/}
          <button 
            style={buttonStyles}
            onClick={()=>this.calculateIt("+")}
            onMouseEnter={this.hoverEnter}
            onMouseLeave={this.hoverLeave}
            onMouseDown={this.mouseDown}
            onMouseUp={this.mouseUp}>Add</button>
          <button onClick={()=>this.calculateIt("-")}>Substract</button>
          <button onClick={()=>this.calculateIt("*")}>Multiply</button>
          <button onClick={()=>this.calculateIt("/")}>Divide</button>
        </div>
    )
  }
}

export default Calculator;
