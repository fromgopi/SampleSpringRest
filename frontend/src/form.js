import React, { Component } from 'react';

class NameForm extends Component{

    constructor(props){
        super(props);
        //this.state = {value: 'Please write about your favorite DOM Element'};
        this.state = {value: 'coconut'};
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event){
        this.setState({value: event.target.value});
        console.log("============ handle Change is called. =======" +
            "====" + this.state);

    }

    handleSubmit(event){
        alert('A name was submitted : ' + this.state.value);
        console.log("============ handle Sumbit is called. =======" +
            "====" + event);
        event.preventDefault();
    }

    render(){
        return(

            <form onSubmit={this.handleSubmit}>

                <label>
                    Pick your favorite Item
                    <select value={this.state.value} onChange={this.handleChange}>
                        <option value="grapefruit">Grapefruit</option>
                        <option value="lime">Lime</option>
                        <option value="coconut">Coconut</option>
                        <option value="mango">Mango</option>
                    </select>
                </label>
                <input type="submit" value="Submit"/>

            </form>
        );
    }
}

export default NameForm;