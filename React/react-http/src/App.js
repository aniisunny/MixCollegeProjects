import React from 'react';
import './App.css';
import PostList from './Components/PostList';
import PostForm from './Components/PostForm';

function App() {
  return (
    <div className="App">
      <PostList />
      <PostForm />
    </div>
  );
}

export default App;
