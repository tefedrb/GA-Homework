import React, {Component} from 'react';
import './App.css';
import CourseList from './components/CourseList'

class App extends Component {
  componentDidMount(){

  }

  render(){
    return (
      <div className="App">
        <CourseList />
      </div>
    );
  }
}

export default App;
