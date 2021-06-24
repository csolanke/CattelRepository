import React, { Component } from 'react';
import AppNav from './AppNav';
class Cattles extends Component {
    state = { 
        isLoading : true,
        Cattlesarray:[]
     }
     
     async componentDidMount(){
         const respone = await fetch('/api/v1/cattles');
         const body = await respone.json();
         this.setState({Cattlesarray : body,isLoading:false});
     }


    render() { 
        const {Cattlesarray,isLoading}= this.state;
        
        if(isLoading)
        return (<div>Loading........./</div>);

        return (
          

            <div>
                <AppNav/>
                <h5>Here are your Cattles </h5>

                {
                    Cattlesarray.map(cattle =>

                        <div id={cattle.id}>
                            {cattle.cattleName}
                           <div> {cattle.pricePurchased}</div>
                           <div>{cattle.milkingCapacity}</div>
                        </div>

                    )
                }
                    
                     
            </div>
            
                
                    
                    )
            
        
    }
}
 
export default Cattles;