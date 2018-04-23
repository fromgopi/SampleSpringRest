import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props){
      super(props);

      this.state = {
          data: []
      };
  }

  componentDidMount(){
      fetch("http://localhost:8080/employees").
          then(response => response.json()).
          then(findResponse => {
              this.setState({
                  data: [findResponse]
              });
          })
  }


    render(){
        return(

            <table>
                <tr><th>Title</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Description</th>
                </tr>{
                this.state.data.map((dynamicData, Key) => {
                    let keys = Object.keys(dynamicData);
                    let d = dynamicData;
                    return keys.map(data => {
                        return (
                            <tr key={Key} style={{borderBottom: '1px solid black'}}>
                                <td>{dynamicData[data].title}</td>
                                <td>{dynamicData[data].firstName}</td>
                                <td>{dynamicData[data].lastName}</td>
                                <td>{dynamicData[data].description}</td>
                            </tr>
                        );
                    });
                })
            }
            </table>
        );
    }
}

export default App;
