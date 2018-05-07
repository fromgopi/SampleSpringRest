import React, { Component } from 'react';
import {Card, CardActions, CardHeader, CardMedia, CardTitle, CardText} from 'material-ui/Card';
import FlatButton from 'material-ui/FlatButton';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider'

class CardView extends Component{

    render(){
        return(
            <MuiThemeProvider>
                <Card>
                    <CardHeader
                        title="URL Avatar"
                        subtitle="Subtitle"
                        avatar="images/jsa-128.jpg"
                    />
                    <CardMedia
                        overlay={<CardTitle title="Overlay title" subtitle="Overlay subtitle" />}
                    >
                        <img src={require('./images/bg_pic.jpeg')} alt="" />
                    </CardMedia>

                    <CardTitle title={"Handbook Inc"}/>
                </Card>
            </MuiThemeProvider>
        );
    }
}

export default CardView