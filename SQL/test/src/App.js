import React from 'react';
import logo from './logo.svg';
import './App.css';
import VideoList from './VideoList'; // Assuming VideoList is in the same directory

function App() {
  const videos = [
    // Sample videos data
    { id: 1, title: 'Video 1' },
    { id: 2, title: 'Video 2' }
  ];

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <VideoList videos={videos} emptyHeading="No videos available" />
    </div>
  );
}

export default App;
