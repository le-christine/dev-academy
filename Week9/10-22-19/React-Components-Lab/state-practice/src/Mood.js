import React from 'react';

const Mood = props => {


    return (
      <div>
        <p>On a scale of 1-10</p>
        <p>You are this {props.mood}:
        <span className="moodColor"
        style={{color: props.moodPoints > 5 ? "orange" : "blue"}}> {props.moodPoints}</span></p>
        <button onClick = {props.changeMood}> Cheer up!</button>
        <button onClick={props.increaseMood}>Increase {props.mood}</button>
        <button onClick={props.decreaseMood}>Decrease {props.mood}</button>
      </div>
    )
  }


export default Mood;
