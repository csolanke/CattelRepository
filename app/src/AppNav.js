import React, { Component } from 'react';
import {Nav,Navbar,NavItem,NavLink,NavbarBrand} from 'reactstrap';
import Cattles from './Cattles';
import Home from './Home';
class AppNav extends Component {
    state = {  }
    render() { 
        return (
            <div>
              
              <Navbar color="dark" dark expand="md">
                <NavbarBrand href="/">Amey Dairy</NavbarBrand>
                  <Nav className="mr-auto" navbar>
                    <NavItem>
                      <NavLink href="/cattles/">Cattles</NavLink>
                    </NavItem>
                    <NavItem>
                      <NavLink href="/">Home</NavLink>
                    </NavItem>
                    <NavItem>
                      <NavLink href="/expenses">Expenses</NavLink>
                    </NavItem>
                     </Nav>    
              </Navbar>
            </div>
          );
    }
}
 
export default AppNav;