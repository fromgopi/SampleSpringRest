import React, { Component } from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider'
import {Table, TableHeader, TableRow, TableHeaderColumn} from '../node_modules/material-ui/Table'


const obj = [{
    name: "onion",
    price: ".99",
    id: 1
}, {
    name: "pepper",
    price: "1.25",
    id: 2
}, {
    name: "broccoli",
    price: "3.00",
    id: 3
}];

class TableExample extends Component{
    render(){
        return(
            <MuiThemeProvider>
                <Table>
                    <TableHeader>
                        <TableRow>
                            <TableHeaderColumn>ID</TableHeaderColumn>
                            <TableHeaderColumn>Name</TableHeaderColumn>
                            <TableHeaderColumn>Status</TableHeaderColumn>
                        </TableRow>
                    </TableHeader>
                </Table>
            </MuiThemeProvider>
        );
    }
}

export default TableExample

