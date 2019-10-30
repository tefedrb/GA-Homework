import React, {Component} from 'react';
import './App.css';
import Character from './Character';

class App extends Component {
  constructor(props){
      super(props);
      this.state = {
        characters: null,
      }
  }

  componentDidMount(){
    fetch('https://www.anapioficeandfire.com/api/characters?page=1&pageSize=50')
      .then(res => {
        return res.json();
      })
      .then(res => {
        console.log(res)
        this.setState({
          characters: res
        })
      })
      .catch(error => {
        console.log(error)
      })
  }

  render(){
    const showCharacters = this.state.characters ? this.state.characters.map((char, key) => {
      return <Character char={char} key={key} />
    }) : <h3>"Uhhh"</h3>
    return (
      <div className="App">
        {showCharacters}
      </div>
    );
  }
}

export default App;
