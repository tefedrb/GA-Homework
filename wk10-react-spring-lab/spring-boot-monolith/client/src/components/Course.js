import React from 'react';

const Course = props => {
  return (
    <div>
      <h3>{props.name}</h3>
      <h3>{props.code}</h3>
    </div>
  );
}

export default Course;
