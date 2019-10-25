import React, { Component } from 'react';
import styled, { keyframes } from 'styled-components';

const rotate360 = keyframes`
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
`;

const Button = styled.button`
  border-radius: 5px;
  padding: 15px 25px;
  font-size: 22px;
  text-decoration: none;
  margin: 20px;
  color: #fff;
  position: relative;
  display: inline-block;
  background-color: #55acee;
  box-shadow: 0px 5px 0px 0px #3C93D5;
  &:hover{
    background-color: #6FC6FF
  }
  &:active{
    transform: translate(0px, 5px);
    box-shadow: 0px 1px 0px 0px;
  }
  &:focus {
    outline:none !important;
  }
`;

const ErrorButton = styled(Button)`
  background-color: #e74c3c;
  box-shadow: 0px 5px 0px 0px #CE3323;
  &:hover{
    background-color: #FF6656;
  }
`;

const SuccessButton = styled(Button)`
  background-color: #2ecc71;
  box-shadow: 0px 5px 0px 0px #15B358;
  &:hover{
    background-color: #48E68B;
  }
`;

const InfoButton = styled(Button)`
  background-color: #f1c40f;
  box-shadow: 0px 5px 0px 0px #D8AB00;
  &:hover{
    background-color: #FFDE29;
  }
`;


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

    return (
      <div className = "container">
        <h1>Calculate</h1>
          <input type="number" onChange = {this.numOne} />
          <input type="numer" onChange = {this.numTwo}/>
          <h3>{this.state.output}</h3>
            {/*if we pass a variable as a callback it will invoke it right away
            we need to wrap this as an anonymous function with the closure syntax*/}
          <Button onClick={()=>this.calculateIt("+")}>Add</Button>
          <ErrorButton onClick={()=>this.calculateIt("-")}>Substract</ErrorButton>
          <SuccessButton onClick={()=>this.calculateIt("*")}>Multiply</SuccessButton>
          <InfoButton onClick={()=>this.calculateIt("/")}>Divide</InfoButton>
        </div>
    )
  }
}

export default Calculator;
