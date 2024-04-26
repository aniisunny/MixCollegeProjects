import React, {useState, useEffect} from 'react'
import axios from 'axios'

function DataFeching() {
    //const [post, setPosts] = useState([])
    const [post, setPost] = useState({})
    const [id, setId] = useState(1)
    const [idButtonClick, setIdButtonClick] = useState(1)

    const clickHandler = () => {
        setIdButtonClick(id)
    }

    useEffect(() => {
        axios.get(`https://jsonplaceholder.typicode.com/posts/${idButtonClick}`)
            .then(response => {
                console.log(response)
                setPost(response.data)
            })
            .catch(error => {
                console.log(error)
            })
    }, [idButtonClick])

    return (
        <div>
            <input type="text" value={id} onChange={e => setId(e.target.value)} />
            <button type="button" onClick={clickHandler}>Fetch Data</button>
            <div>{post.title}</div>
            {/* <ul>
                {
                    posts.map(post => (
                        <li key={post.id}>{post.title}</li>
                    ))
                } 
            </ul> */}
        </div>
    )
}

export default DataFeching