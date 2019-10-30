import React from 'react';
import './App.css';

function Character(props){
  console.log(props, "<--- Here")
  const born = props.char.born ? `Born in: ${props.char.born}`: ''
  return(
    <div>
      <h1>{props.char.name ? props.char.name : props.char.aliases[0]}</h1>
      <h4>{props.char.gender}</h4>
      <h3>{born}</h3>
    </div>
  );
}

export default Character;
