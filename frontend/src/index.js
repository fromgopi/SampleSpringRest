import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import NameForm from './form';
import registerServiceWorker from './registerServiceWorker';

/*ReactDOM.render(<App />, document.getElementById('root'));*/
ReactDOM.render(<NameForm />, document.getElementById('root'));
registerServiceWorker();
