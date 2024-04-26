import React from 'react'
import './myStyles.css'

function Stylesheet(props) {
    const className = props.primary ? "primary" : ""
    return (
        <div>
            <h1 className="primary font-xl">Stylesheet</h1>
            <h1 className={`${className} font-xl`}>Stylesheets</h1>
        </div>
    )
}

export default Stylesheet