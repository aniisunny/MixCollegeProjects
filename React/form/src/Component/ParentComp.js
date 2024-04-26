import React, { Component } from 'react'
import RegularComp from './RegularComp'
import PureComp from './PureComp'
import MemoComp from './MemoComp'

class ParentComp extends Component {
    constructor(props) {
        super(props)

        this.state = {
            name: 'Aniruddha'
        }
    }

    componentDidMount() {
        setInterval(() => {
            this.setState({
                name: 'Anii'
            })
        }, 2000)
    }

    render() {
        console.log('Parent Comp Render')
        return (
            <div>
                Parent Component
                <RegularComp name={this.state.name}></RegularComp>
                <PureComp name={this.state.name}></PureComp>
                <MemoComp name={this.state.name}/>
            </div>
        )
    }
}

export default ParentComp