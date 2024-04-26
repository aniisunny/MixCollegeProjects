import React, { Component } from 'react'

class Form extends Component {
    constructor(props) {
        super(props)
        this.state = {
            username: '',
            comments: '',
            topic: 'react'
        }
    }

    handlerUsernameChange = (event) => {
        this.setState({
            username: event.target.value
        })
    }

    handlerCommentsChange = (event) => {
        this.setState({
            comments: event.target.value
        })
    }

    handlerTopicChange = (event) => {
        this.setState({
            topic: event.target.value
        })
    }

    handlerSubmit = event => {
        alert(`${this.state.username} ${this.state.comments} ${this.state.topic}`)
        event.preventDefault()
    }

    render() {
        return (
            <form onSubmit={this.handlerSubmit}>
                <div>
                    <label>Username </label>
                    <input 
                        type='text' 
                        value={this.state.username} 
                        onChange={this.handlerUsernameChange}
                    />
                </div>
                <div>
                    <label>Comment</label>
                    <textarea
                        value={this.state.comments}
                        onChange={this.handlerCommentsChange}
                    />
                </div>
                <div>
                    <label>Topic</label>
                    <select value={this.state.topic} onChange={this.handlerTopicChange}>
                        <option value="react">React</option>
                        <option value="angular">Angular</option>
                        <option value="vue">Vue</option>
                    </select>
                </div>
                <button type="submit">Submit</button>
            </form>
        )
    }
}

export default Form