import React, {useContext} from 'react'
import ComponentF from './ComponentF.js'
import {UserContext, ChannelContext} from '../App'

function ComponentE() {

    const user = useContext(UserContext)
    const channel = useContext(ChannelContext)

    return (
        <div>
            <ComponentF />
            <div>Hook User Context Value: {user}</div>
            <div>Hook Channel Context Value: {channel}</div>
        </div>
    )
}

export default ComponentE