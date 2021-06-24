import logo from './logo.svg';
import React, { Component } from 'react';
import './App.css';
import Cattles from './Cattles';
import Home from './Home';
import Expense from './Expense';
import {Route,Switch} from 'react-router';
import { BrowserRouter as Router} from 'react-router-dom';



class App extends Component {
  state = {  }
  render() { 
    return (
      <Router>
        <Switch>
          <Route path='/' exact={true} component ={Home}/>
          <Route path='/cattles' exact={true} component ={Cattles}/>
          <Route path='/expenses' exact={true} component ={Expense}/>
        </Switch>
      </Router>
      
        );
  }
}
 
export default App;
