import React from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  construction(prop) {
    super(prop);
    this.state = { apiResponse: ""};
  }
  callAPI() {
    fetch("http://localhost:9000/testAPI")
          .then(res => res.text())
          .then(res => this.setState({ apiResponse: res}))
          .catch(err => err);
  }

  componentDidMount() {
    this.callAPI();
  }
  render() {
    return(
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-header" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-title">Welcome to React</p>
      </div>
    )
  }
}

export default App;
